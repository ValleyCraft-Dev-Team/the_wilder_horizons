package net.linkle.wilder_horizons.entity;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.environment.sounds.WHSounds;
import net.linkle.wilder_horizons.tags.ModBlockTags;
import net.linkle.wilder_horizons.tags.ModItemTags;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.FuzzyTargeting;
import net.minecraft.entity.ai.control.FlightMoveControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.BirdNavigation;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.Path;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

public class CrowEntity extends AnimalEntity implements Bird {

    static final Predicate<ItemEntity> PICKABLE_DROP_FILTER = item -> !item.cannotPickup() && item.isAlive() && item.getStack().isIn(ModItemTags.SEEDS);

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
    public boolean canPickupItem(ItemStack stack) {
        return false;
    }

    @Override
    public boolean canGather(ItemStack stack) {
        return stack.isIn(ModItemTags.SEEDS);
    }

    @Override
    public boolean tryEquip(ItemStack equipment) {
        return true;
    }

    @Override
    protected void initGoals() {
        goalSelector.add(0, new EscapeDangerGoal(this, 1.2));
        goalSelector.add(0, new SwimGoal(this));
        goalSelector.add(1, new CrowFleeScarecrowsGoal(1.1));
        goalSelector.add(2, new PickupItemGoal());
        goalSelector.add(3, new DestroyCropsGoal());
        goalSelector.add(4, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
        goalSelector.add(5, new FlyGoal(this, 1.0));
        //goalSelector.add(2, new FollowMobGoal(this, 1.0, 3.0f, 7.0f));
    }

    public static DefaultAttributeContainer.Builder createCrowAttributes() {
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 6.0).add(EntityAttributes.GENERIC_FLYING_SPEED, 0.4f).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2f);
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

    protected class CrowFleeScarecrowsGoal extends Goal {
        private final double speed;
        private int cooldown;
        Optional<BlockPos> scarecrowPos = Optional.empty();
        @Nullable
        protected Path fleePath;

        public CrowFleeScarecrowsGoal(double speed) {
            this.speed = speed;
            this.setControls(EnumSet.of(Goal.Control.MOVE));
        }

        @Override
        public boolean canStart() {
            if (cooldown > 0) {
                --cooldown;
                return false;
            }
            scarecrowPos = findScarecrow();
            if (scarecrowPos.isPresent()) {
                var centerPos = Vec3d.ofCenter(scarecrowPos.get());
                var pathPos = FuzzyTargeting.findFrom(CrowEntity.this, 15, 8, centerPos);
                Main.LOGGER.info(String.valueOf(pathPos));
                if (pathPos == null) {
                    return false;
                }
                Main.LOGGER.info(String.valueOf(pathPos));
                if (squaredDistanceTo(pathPos.x, pathPos.y, pathPos.z) < centerPos.squaredDistanceTo(getPos())) {
                    return false;
                }
                Main.LOGGER.info(String.valueOf(pathPos));
                cooldown = toGoalTicks(20);
                fleePath = getNavigation().findPathTo(pathPos.x, pathPos.y, pathPos.z, 1);
                return fleePath != null;
            }
            cooldown = 30 + random.nextInt(20);
            return false;
        }

        @Override
        public boolean shouldContinue() {
            return !getNavigation().isIdle();
        }

        protected Optional<BlockPos> findScarecrow() {
            return BlockPos.findClosest(getBlockPos(), 10, 6, pos -> world.getBlockState(pos).isIn(ModBlockTags.SCARECROWS));
        }

        @Override
        public void start() {
            getNavigation().startMovingAlong(fleePath, speed);
        }

        @Override
        public void stop() {
            scarecrowPos = Optional.empty();
        }

        @Override
        public void tick() {

        }
    }

    protected class DestroyCropsGoal extends Goal {

        private int cooldown;
        Optional<BlockPos> cropPos = Optional.empty();
        @Nullable
        protected Path fleePath;

        public DestroyCropsGoal() {
            this.setControls(EnumSet.of(Goal.Control.MOVE));
        }

        @Override
        public boolean canStart() {
            if (cooldown > 0) {
                --cooldown;
                return false;
            }
            cropPos = findCrops();
            if (cropPos.isPresent()) {
                cooldown = toGoalTicks(20);
                fleePath = getNavigation().findPathTo(cropPos.get(), 1);
                Main.LOGGER.info(Objects.toString(fleePath));
                return fleePath != null;
            }
            cooldown = 30 + random.nextInt(20);
            return false;
        }

        @Override
        public boolean shouldContinue() {
            return !getNavigation().isIdle();
        }

        protected Optional<BlockPos> findCrops() {
            return BlockPos.findClosest(getBlockPos(), 8, 5, pos -> world.getBlockState(pos).isIn(BlockTags.CROPS));
        }

        @Override
        public void start() {
            String.valueOf(getNavigation().startMovingAlong(fleePath, 1));
        }

        @Override
        public void stop() {
            if (cropPos.isPresent() && cropPos.get().getSquaredDistance(getBlockPos()) <= 2 * 2) {
                if (world.getBlockState(cropPos.get()).isIn(BlockTags.CROPS)) {
                    world.breakBlock(cropPos.get(), true, CrowEntity.this);
                }
            }
            cropPos = Optional.empty();
        }

        @Override
        public void tick() {

        }
    }

    class PickupItemGoal extends Goal {
        public PickupItemGoal() {
            setControls(EnumSet.of(Goal.Control.MOVE));
        }

        @Override
        public boolean canStart() {
            //if (!getEquippedStack(EquipmentSlot.MAINHAND).isEmpty()) {
                //return false;
            //}
            if (getTarget() != null || getAttacker() != null) {
                return false;
            }
            //if (!CrowEntity.this.wantsToPickupItem()) {
                //return false;
            //}
            if (getRandom().nextInt(toGoalTicks(10)) != 0) {
                return false;
            }
            var list = world.getEntitiesByClass(ItemEntity.class, getBoundingBox().expand(8.0, 8.0, 8.0), PICKABLE_DROP_FILTER);
            return !list.isEmpty();
        }

        @Override
        public void tick() {
            var list = world.getEntitiesByClass(ItemEntity.class, getBoundingBox().expand(8.0, 8.0, 8.0), PICKABLE_DROP_FILTER);
            if (!list.isEmpty()) {
                getNavigation().startMovingTo(list.get(0), 1.2f);
            }
        }

        @Override
        public void start() {
            tick();
        }
    }
}