package net.linkle.wilder_horizons.entity;

import net.linkle.wilder_horizons.environment.sounds.WHSounds;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.control.FlightMoveControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.BirdNavigation;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class SeagullEntity extends AnimalEntity implements Bird {

    public float flapProgress;
    public float maxWingDeviation;
    public float prevMaxWingDeviation;
    public float prevFlapProgress;
    private float flapSpeed = 1.0f;
    private float field_28640 = 1.0f;

    public SeagullEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
        moveControl = new FlightMoveControl(this, 10, false);
    }

    @Override
    protected void initGoals() {
        goalSelector.add(0, new EscapeDangerGoal(this, 1.2));
        goalSelector.add(0, new SwimGoal(this));
        goalSelector.add(1, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
        goalSelector.add(2, new FlyGoal(this, 1.0));
        //goalSelector.add(2, new FollowMobGoal(this, 1.0, 3.0f, 7.0f));
    }

    public static DefaultAttributeContainer.Builder createSeagullAttributes() {
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

    public static boolean canSpawn(EntityType<SeagullEntity> type, WorldAccess world, SpawnReason spawnReason, BlockPos pos, Random random) {
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
        return WHSounds.SEAGULL.sound;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return WHSounds.SEAGULL.sound;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return WHSounds.SEAGULL.sound;
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
}