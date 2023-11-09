package net.linkle.wilder_horizons.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ZombifiedPigEntity extends HostileEntity implements Monster {
    public ZombifiedPigEntity(EntityType<? extends ZombifiedPigEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createZombifiedPigAttributes() {
        return createHostileAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 15).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25).add(EntityAttributes.GENERIC_FOLLOW_RANGE, 16).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 3);
    }

    @Override
    protected void initGoals() {
        goalSelector.add(1, new AttackGoal(1.2, false));
        goalSelector.add(2, new WanderAroundFarGoal(this, 1.0));
        targetSelector.add(1, new RevengeGoal(this).setGroupRevenge());
        targetSelector.add(2, new ActiveTargetGoal<>(this, PlayerEntity.class, true, false));
    }

    public class AttackGoal extends MeleeAttackGoal {
        private int ticks;

        public AttackGoal(double speed, boolean pauseWhenMobIdle) {
            super(ZombifiedPigEntity.this, speed, pauseWhenMobIdle);
        }

        @Override
        public void start() {
            super.start();
            this.ticks = 0;
        }

        @Override
        public void stop() {
            super.stop();
            setAttacking(false);
        }

        @Override
        public void tick() {
            super.tick();
            ++this.ticks;
            setAttacking(this.ticks >= 5 && this.getCooldown() < this.getMaxCooldown() / 2);
        }
    }
}
