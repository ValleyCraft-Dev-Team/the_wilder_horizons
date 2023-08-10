package net.linkle.wilder_horizons.item;

import net.linkle.wilder_horizons.util.FoodStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;

public class NegativeFoodItem_1_Effect extends FoodItem {
    public NegativeFoodItem_1_Effect(Settings settings, int hunger, float satMod, StatusEffect effect) {
        super(settings, hunger, satMod, true, new FoodStatusEffect(
                new StatusEffectInstance(effect, 30 * 20, 0)));
    }
}