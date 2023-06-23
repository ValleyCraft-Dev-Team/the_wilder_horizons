package net.linkle.wilder_horizons.entity.slimes;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class TameableSlimeEntity extends SlimeEntity {
    public TameableSlimeEntity(EntityType<? extends SlimeEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        //goalSelector.add(3, new TemptGoal(this, 1.0, Items.BEETROOT, false));
        targetSelector.add(5, new ActiveTargetGoal(this, Monster.class, false));
    }

    @Override
    public void setSize(int size, boolean heal) {
        int i = MathHelper.clamp(size, 1, 1);
        this.refreshPosition();
        this.calculateDimensions();
        this.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).setBaseValue(4);
        this.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).setBaseValue((double)(0.2F + 0.1F * (float)i));
        this.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).setBaseValue(4);
        if (heal) {
            this.setHealth(this.getMaxHealth());
        }

        this.experiencePoints = i * 2;
    }
}
