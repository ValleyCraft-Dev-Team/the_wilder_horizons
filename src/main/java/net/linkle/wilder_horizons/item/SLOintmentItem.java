package net.linkle.wilder_horizons.item;

import net.linkle.wilder_horizons.util.FoodStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.UseAction;

public class SLOintmentItem extends SLFoodItem {
    public SLOintmentItem(Settings settings, int hunger, float satMod, boolean isMeat, StatusEffect effect) {
        super(settings, hunger, satMod, isMeat, new FoodStatusEffect(new StatusEffectInstance(effect, 78 * 20, 0,
                true, true))); // 30 seconds
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 16;
    }
    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }
    @Override
    public SoundEvent getDrinkSound() {
        return SoundEvents.BLOCK_MOSS_CARPET_HIT;
    }
}
