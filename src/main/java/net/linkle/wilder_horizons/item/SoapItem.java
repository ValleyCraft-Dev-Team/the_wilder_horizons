package net.linkle.wilder_horizons.item;

import net.linkle.wilder_horizons.util.FoodStatusEffect;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import java.util.List;

public class SoapItem extends FoodItem {
    public SoapItem(Settings settings, int hunger, float satMod, boolean isMeat, StatusEffect effect) {
        super(settings, hunger, satMod, isMeat, new FoodStatusEffect(new StatusEffectInstance(effect, 45 * 20, 0, true, false))); // 30 seconds
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 32;
    }
    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }
    @Override
    public SoundEvent getDrinkSound() {
        return SoundEvents.BLOCK_BUBBLE_COLUMN_BUBBLE_POP;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( Text.translatable("item.soulslikegrit.soap.tooltip_0").formatted(Formatting.GRAY));
        tooltip.add( Text.translatable("item.soulslikegrit.soap.tooltip_1").formatted(Formatting.GRAY));
        tooltip.add( Text.translatable("item.soulslikegrit.soap.tooltip").formatted(Formatting.RED));
        tooltip.add( Text.translatable("item.soulslikegrit.soap.tooltip_2").formatted(Formatting.RED));
    }
}
