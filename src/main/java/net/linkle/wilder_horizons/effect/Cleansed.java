package net.linkle.wilder_horizons.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class Cleansed extends StatusEffect {

    public Cleansed() {
        super(StatusEffectCategory.BENEFICIAL, 15065046);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity player && entity.isInsideWaterOrBubbleColumn()) {
            if (entity.getHealth() < entity.getMaxHealth()) {
                entity.heal(0.5F);
            }
            entity.setStuckArrowCount(0);
        }
        entity.isSneaky();
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i = 20 >> amplifier;
        if (i > 0) {
            return duration % i == 0;
        }
        return true;
    }
}