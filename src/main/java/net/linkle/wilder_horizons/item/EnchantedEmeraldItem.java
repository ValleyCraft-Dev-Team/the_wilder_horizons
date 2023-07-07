package net.linkle.wilder_horizons.item;

import net.minecraft.item.ItemStack;

public class EnchantedEmeraldItem extends AlphaModItem {
    public EnchantedEmeraldItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
