package net.linkle.wilder_horizons.item;

import net.linkle.wilder_horizons.util.FoodStatusEffect;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SLFoodItem extends SLModItem {
    protected boolean hideTooltip;

    /** @param satMod = saturationModifier */
    public SLFoodItem(Settings settings, int hunger, float satMod, boolean isMeat) {
        this(settings, hunger, satMod, isMeat, null);
    }

    /** @param satMod = saturationModifier */
    public SLFoodItem(Settings settings, int hunger, float satMod, boolean isMeat, @Nullable FoodStatusEffect effects) {
        super(settings.food(newFoodComponent(hunger, satMod, isMeat, effects)));
    }

    public SLFoodItem hideTooltip() {
        hideTooltip = true;
        return this;
    }

    protected static FoodComponent newFoodComponent(int hunger, float saturationModifier, boolean isMeat, @Nullable FoodStatusEffect statusEffects) {
        var builder = new FoodComponent.Builder();
        builder.hunger(hunger);
        builder.saturationModifier(saturationModifier);

        if (isMeat) {
            builder.meat();
        }

        if (statusEffects != null) {
            statusEffects.build(builder);
        }

        return builder.build();
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        if (getFoodComponent() == null || hideTooltip) return;
        var list = getFoodComponent().getStatusEffects();

        for (var pair : list) {
            var effect = pair.getFirst();
            var name = effect.getEffectType().getName();
            if (name instanceof MutableText text) {
                var color = effect.getEffectType().isBeneficial() ? Formatting.BLUE : Formatting.RED;
                var build = new StringBuilder();

                /* Won't work
                if (effect.getAmplifier() > 0) {
                    build.append(' ');
                    build.append(new TranslatableText("potion.withAmplifier" + effect.getAmplifier()));
                } */

                if (effect.getDuration() > 20) {
                    build.append(" (");
                    build.append(StatusEffectUtil.durationToString(effect, 1));
                    build.append(')');
                }

                tooltip.add(text.formatted(color).append(build.toString()));
            }
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
