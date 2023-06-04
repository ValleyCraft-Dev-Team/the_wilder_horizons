package net.linkle.wilder_horizons.interfaces;

import net.linkle.wilder_horizons.init.Events;
import net.minecraft.item.ItemStack;

/**
 * Used for tool/weapon item to prevent from being destroyed by using or
 * attacking with it if the item's damage level is 1. See {@link Events} for
 * code.
 */
public interface PreventDestroy {
    static boolean isUsable(ItemStack stack) {
        return stack.getDamage() < stack.getMaxDamage() - 1;
    }
}
