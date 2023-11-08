package net.linkle.wilder_horizons.block;

import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.Direction;

public class GiantSkullBlock extends HorizontalBlock {
    public GiantSkullBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected Direction getFacing(ItemPlacementContext ctx) {
        return ctx.getSide().getOpposite();
    }
}
