package net.linkle.wilder_horizons.item;

import net.linkle.wilder_horizons.util.FoodStatusEffect;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class SLSalveItem extends SLFoodItem {
    public SLSalveItem(Settings settings, int hunger, float satMod, boolean isMeat, StatusEffect effect) {
        super(settings, hunger, satMod, isMeat, new FoodStatusEffect(new StatusEffectInstance(effect, 11 * 20, 0,
                true, false))); // 30 seconds
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
