package net.linkle.wilder_horizons.item.gear.tools.bows;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;

public class CrossBowPistolItem extends CrossbowItem {
    public CrossBowPistolItem(Settings settings) {
        super(settings);
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return getPullTime(stack) + 3;
    }

    //default crossbow speed is 25 - (5 * i) where i is the level of the quick_charge enchantment
    public static int getPullTime(ItemStack stack) {
        int i = EnchantmentHelper.getLevel(Enchantments.QUICK_CHARGE, stack);
        return i == 0 ? 15 : 15 - 5 * i;
    }

    @Override
    public int getRange() {
        //default bow range is 15
        //brasium bow is 25
        //amethyst leveled bow is 20
        //default crossbow range is 8
        //23 ~= 1.5x default bow range
        //12 = 1.5 default crossbow range
        return 6;
    }
}
