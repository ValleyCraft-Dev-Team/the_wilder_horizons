package net.linkle.wilder_horizons.item;

import net.linkle.wilder_horizons.util.FoodStatusEffect;
import net.minecraft.item.ItemStack;

public class GlintBottleItem extends BottleItem {

    public GlintBottleItem(Settings settings, int hunger, float satMod) {
        super(settings, hunger, satMod);
    }

    public GlintBottleItem(Settings settings, int hunger, float satMod, FoodStatusEffect effects) {
        super(settings, hunger, satMod, effects);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
