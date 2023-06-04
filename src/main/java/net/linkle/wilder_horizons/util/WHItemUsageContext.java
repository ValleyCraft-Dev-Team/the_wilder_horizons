package net.linkle.wilder_horizons.util;

import net.linkle.wilder_horizons.widener.ItemUsageContextWidener;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;

public class WHItemUsageContext extends ItemUsageContext {
    public WHItemUsageContext(ItemUsageContext context, ItemStack stack) {
        super(context.getWorld(), context.getPlayer(), context.getHand(), stack, ((ItemUsageContextWidener)context).getHit());
    }
}
