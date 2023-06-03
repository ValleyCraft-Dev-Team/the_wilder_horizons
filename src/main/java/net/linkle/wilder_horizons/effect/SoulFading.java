package net.linkle.wilder_horizons.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class SoulFading extends StatusEffect {

    public SoulFading() {
        super(StatusEffectCategory.HARMFUL, 12117082);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.damage(DamageSource.MAGIC, 0.5F);
        if (entity instanceof PlayerEntity player) {
            player.addExhaustion(0.005F * (float)(amplifier + 1));
        }
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
