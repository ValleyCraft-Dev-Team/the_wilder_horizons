package net.linkle.wilder_horizons.util;

import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;

public class SLUtil extends net.minecraft.util.Util {
    public static boolean inWater(ItemPlacementContext context) {
        return context.getWorld().getFluidState(context.getBlockPos()).getFluid() == Fluids.WATER;
    }
}
