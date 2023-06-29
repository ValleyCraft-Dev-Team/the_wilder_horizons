package net.linkle.wilder_horizons.entity;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.environment.sounds.WHSounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.control.FlightMoveControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.BirdNavigation;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.decoration.ItemFrameEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.function.Predicate;

public class CrowEntity extends AnimalEntity implements Bird {

    protected Item itemToPickup = Items.AIR;
    protected boolean startAi;
    public float flapProgress;
    public float maxWingDeviation;
    public float prevMaxWingDeviation;
    public float prevFlapProgress;
    private float flapSpeed = 1.0f;
    private float field_28640 = 1.0f;

    public CrowEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
        moveControl = new FlightMoveControl(this, 10, false);
        setCanPickUpLoot(true);
    }

    @Override
    protected Vec3i getItemPickUpRangeExpander() {
        return new Vec3i(1, 1, 1);
    }

    @Override
    public boolean canPickupItem(ItemStack stack) {
        return stack.isOf(itemToPickup);
    }

    @Override
    protected void initGoals() {
        goalSelector.add(0, new CrowGoal());
        goalSelector.add(0, new EscapeDangerGoal(this, 1.25));
        goalSelector.add(0, new SwimGoal(this));
        //goalSelector.add(2, new FollowMobGoal(this, 1.0, 3.0f, 7.0f));
    }

    public static DefaultAttributeContainer.Builder createCrowAttributes() {
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 6.0).add(EntityAttributes.GENERIC_FLYING_SPEED, 0.4f).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2f);
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        startAi = true;
        return ActionResult.PASS;
    }

    @Override
    protected EntityNavigation createNavigation(World world) {
        var navigation = new BirdNavigation(this, world);
        navigation.setCanPathThroughDoors(false);
        navigation.setCanSwim(true);
        navigation.setCanEnterOpenDoors(true);
        return navigation;
    }

    @Override
    protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return dimensions.height * 0.6f;
    }

    @Override
    public void tickMovement() {
        super.tickMovement();
        flapWings();
    }

    private void flapWings() {
        prevFlapProgress = flapProgress;
        prevMaxWingDeviation = maxWingDeviation;
        maxWingDeviation += (float)(onGround || hasVehicle() ? -1 : 4) * 0.3f;
        maxWingDeviation = MathHelper.clamp(maxWingDeviation, 0.0f, 1.0f);
        if (!onGround && flapSpeed < 1.0f) {
            flapSpeed = 1.0f;
        }
        flapSpeed *= 0.9f;
        Vec3d vec3d = getVelocity();
        if (!onGround && vec3d.y < 0.0) {
            setVelocity(vec3d.multiply(1.0, 0.6, 1.0));
        }
        flapProgress += flapSpeed * 2.0f;
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return false;
    }

    public static boolean canSpawn(EntityType<CrowEntity> type, WorldAccess world, SpawnReason spawnReason, BlockPos pos, Random random) {
        return AnimalEntity.isLightLevelValidForNaturalSpawn(world, pos);
    }

    @Override
    public boolean handleFallDamage(float fallDistance, float damageMultiplier, DamageSource damageSource) {
        return false;
    }

    @Override
    protected void fall(double heightDifference, boolean onGround, BlockState state, BlockPos landedPosition) {
    }

    @Override
    public boolean canBreedWith(AnimalEntity other) {
        return false;
    }

    @Override
    @Nullable
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }

    @Override
    public boolean tryAttack(Entity target) {
        return target.damage(DamageSource.mob(this), 3.0f);
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return WHSounds.CROW.sound;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return WHSounds.CROW.sound;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return WHSounds.CROW.sound;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        playSound(SoundEvents.ENTITY_PARROT_STEP, 0.15f, 1.0f);
    }

    @Override
    protected void playHurtSound(DamageSource source) {
        ambientSoundChance = -getMinAmbientSoundDelay();
        var soundEvent = getHurtSound(source);
        if (soundEvent != null) {
            playSound(soundEvent, getSoundVolume(), getSoundPitch() + 0.3f);
        }
    }

    @Override
    protected boolean hasWings() {
        return this.speed > this.field_28640;
    }

    @Override
    protected void addFlapEffects() {
        this.playSound(SoundEvents.ENTITY_PARROT_FLY, 0.15f, 1.0f);
        this.field_28640 = this.speed + this.maxWingDeviation / 2.0f;
    }

    @Override
    public float getSoundPitch() {
        return ParrotEntity.getSoundPitch(this.random);
    }

    public static float getSoundPitch(Random random) {
        return (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f;
    }

    @Override
    public SoundCategory getSoundCategory() {
        return SoundCategory.NEUTRAL;
    }

    @Override
    public boolean isPushable() {
        return true;
    }

    @Override
    protected void pushAway(Entity entity) {
        if (entity instanceof PlayerEntity) {
            return;
        }
        super.pushAway(entity);
    }

    @Override
    public boolean isInAir() {
        return !this.onGround;
    }

    @Override
    public Vec3d getLeashOffset() {
        return new Vec3d(0.0, 0.5f * this.getStandingEyeHeight(), this.getWidth() * 0.4f);
    }

    @Override
    public float prevFlapProgress() {
        return prevFlapProgress;
    }

    @Override
    public float flapProgress() {
        return flapProgress;
    }

    @Override
    public float prevMaxWingDeviation() {
        return prevMaxWingDeviation;
    }

    @Override
    public float maxWingDeviation() {
        return maxWingDeviation;
    }

    protected class CrowGoal extends Goal {

        @Nullable
        private Task task;

        @Override
        public boolean canStart() {
            return startAi;
        }

        @Override
        public boolean shouldRunEveryTick() {
            return true;
        }

        @Override
        public boolean shouldContinue() {
            return task != null;
        }

        @Override
        public void start() {
            setTask(new TimerTask(30, () -> {
                setTask(new MineWheat());
            }));
        }

        @Override
        public void stop() {
            task = null;
            startAi = false;
        }

        @Override
        public void tick() {
            if (task != null) {
                if (task.shouldContinue()) {
                    task.tick();
                } else {
                    var task = this.task;
                    this.task = null;
                    task.stop();
                }
            }
        }

        public void setTask(Task task) {
            if (task.canStart()) {
                this.task = task;
                task.start();
            }
        }

        protected abstract class Task {
            protected abstract boolean shouldContinue();

            protected boolean canStart() {
                return true;
            }

            protected void start() {

            }

            protected abstract void tick();

            protected abstract void stop();
        }

        protected class TimerTask extends Task {

            int ticks;
            Runnable runnable;

            TimerTask(int ticks, Runnable runnable) {
                this.ticks = ticks;
                this.runnable = runnable;
            }

            @Override
            protected boolean shouldContinue() {
                return ticks > 0;
            }

            @Override
            protected void tick() {
                ticks--;
            }

            @Override
            protected void stop() {
                runnable.run();
            }
        }

        protected class GotoTask extends Task {

            final double x, y, z;
            final Runnable runnable;

            protected GotoTask(int x, int y, int z, Runnable runnable) {
                this(x + 0.5, y + 0.6, z + 0.5, runnable);
            }

            protected GotoTask(double x, double y, double z, Runnable runnable) {
                this.x = x;
                this.y = y;
                this.z = z;
                this.runnable = runnable;
            }

            @Override
            protected boolean canStart() {
                return navigation.startMovingTo(x, y, z, 1);
            }

            @Override
            protected void tick() {
                if (!navigation.isFollowingPath() && Math.sqrt(squaredDistanceTo(x, y, z)) > 0.3) {
                    moveControl.moveTo(x, y, z, 1);
                }
            }

            @Override
            protected boolean shouldContinue() {
                return Math.sqrt(squaredDistanceTo(x, y, z)) > 0.3;
            }

            @Override
            protected void stop() {
                runnable.run();
            }
        }

        protected class PickupTask extends Task {

            final Item item;
            final Runnable runnable;
            @Nullable
            ItemEntity entity;

            protected PickupTask(Item item, Runnable runnable) {
                this.item = item;
                this.runnable = runnable;
            }

            @Override
            protected boolean canStart() {
                var list = world.getEntitiesByClass(ItemEntity.class, getBoundingBox().expand(10, 10, 10), item -> !item.cannotPickup() && item.isAlive() && item.getStack().isOf(this.item));
                if (!list.isEmpty()) {
                    entity = list.get(0);
                    itemToPickup = item;
                    return true;
                }
                return false;
            }

            @Override
            protected void start() {
                itemToPickup = item;
            }

            @Override
            protected boolean shouldContinue() {
                return entity.isAlive();
            }

            @Override
            protected void tick() {
                if (!navigation.isFollowingPath()) {
                    moveControl.moveTo(entity.getX(), entity.getY(), entity.getZ(), 1);
                }
            }

            @Override
            protected void stop() {
                itemToPickup = Items.AIR;
                runnable.run();
            }
        }

        protected class MineWheat extends Task {

            boolean shouldContinue = false;
            BlockPos target;

            @Override
            protected boolean shouldContinue() {
                return shouldContinue;
            }

            @Override
            protected boolean canStart() {
                for (var pos : BlockPos.iterate(getBlockPos().add(-5, -3, -5), getBlockPos().add(5, 3, 5))) {
                    if (world.getBlockState(pos).isOf(Blocks.WHEAT)) {
                        target = pos.toImmutable();
                        return true;
                    }
                }
                return false;
            }

            @Override
            protected void start() {
                shouldContinue = navigation.startMovingAlong(navigation.findPathTo(target.getX()+0.5, target.getY()+0.6, target.getZ()+0.5, 1), 1);
            }

            @Override
            protected void tick() {
                if (world.getBlockState(getBlockPos()).isOf(Blocks.WHEAT)) {
                    world.breakBlock(getBlockPos(), true);
                    shouldContinue = false;
                }
            }

            @Override
            protected void stop() {
                setTask(new TimerTask(10, CrowGoal.this::task1));
            }
        }

        protected class LureChicken extends Task {

            final int x, y, z;

            protected LureChicken(int x, int y, int z) {
                this.x = x;
                this.y = y;
                this.z = z;
            }

            @Override
            protected boolean shouldContinue() {
                return false;
            }

            @Override
            protected void tick() {

            }

            @Override
            protected void stop() {

            }
        }

        void task1() {
            setTask(new TimerTask(10, this::task2));
        }

        void task2() {
            setTask(new GotoTask(-523.5, 75, 1216, this::task3));
        }

        void task3() {
            setTask(new TimerTask(60, this::task4));
        }

        void task4() {
            setTask(new GotoTask(-521, 73, 1217, this::task5));
        }

        void task5() {
            setTask(new TimerTask(7 * 20, this::task6));
        }

        void task6() {
            var list = world.getEntitiesByClass(ItemFrameEntity.class, getBoundingBox().expand(1), frame -> frame.getHeldItemStack().isOf(Items.MINECART));
            if (!list.isEmpty()) {
                list.forEach(frame -> frame.damage(DamageSource.mob(CrowEntity.this), 1));
                setTask(new TimerTask(30, () -> {
                    setTask(new GotoTask(-524, 75, 1224, this::task7));
                }));
            }
        }

        void task7() {
            dropItem(Items.MINECART);
            setTask(new TimerTask(30, () -> {
                setTask(new GotoTask(-523, 75, 1224, this::task8));
            }));
        }

        void task8() {
            setTask(new TimerTask(30, () -> {
                setTask(new GotoTask(-521, 73, 1214, this::task9));
            }));
        }

        void task9() {
            setTask(new TimerTask(30, () -> {
                var list = world.getEntitiesByClass(ItemFrameEntity.class, getBoundingBox().expand(1), frame -> frame.getHeldItemStack().isOf(Items.CHICKEN_SPAWN_EGG));
                if (!list.isEmpty()) {
                    list.forEach(frame -> frame.damage(DamageSource.mob(CrowEntity.this), 1));
                    setTask(new TimerTask(20, () -> {
                        setTask(new GotoTask(-520, 74, 1210, this::task10));
                    }));
                }
            }));
        }

        void task10() {
            dropItem(Items.CHICKEN_SPAWN_EGG);
            setTask(new TimerTask(30, () -> {
                setTask(new GotoTask(-521, 73, 1214, this::task8));
            }));
        }

        void task11() {

        }

        void task12() {

        }

        void task13() {

        }

        void task14() {

        }
    }
}