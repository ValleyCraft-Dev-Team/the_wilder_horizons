package net.linkle.wilder_horizons.item;

import net.linkle.wilder_horizons.util.FoodStatusEffect;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SLBolusItem extends SLFoodItem {

    public SLBolusItem(Settings settings, int hunger, float satMod, boolean isMeat, StatusEffect effect) {
        super(settings, hunger, satMod, isMeat, new FoodStatusEffect(new StatusEffectInstance(effect, 5 * 20, 0,
                true, false))); // 30 seconds
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        user.clearStatusEffects();
        return stack;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 32;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( Text.translatable("item.soulslikegrit.poison_bolus.tooltip_0").formatted(Formatting.GRAY));
        tooltip.add( Text.translatable("item.soulslikegrit.poison_bolus.tooltip_1").formatted(Formatting.GRAY));
    }
}
