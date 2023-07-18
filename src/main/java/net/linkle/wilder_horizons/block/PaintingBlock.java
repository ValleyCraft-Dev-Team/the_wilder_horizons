package net.linkle.wilder_horizons.block;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class PaintingBlock extends HorizontalWithWaterBlock {
    protected static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(3, 0, 12, 13, 19, 14);
    protected static final VoxelShape WEST_SHAPE = Block.createCuboidShape(12, 0, 3, 14, 19, 13);
    protected static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(3, 0, 2, 13, 19, 4);
    protected static final VoxelShape EAST_SHAPE = Block.createCuboidShape(2, 0, 3, 4, 19, 13);

    public PaintingBlock(Settings settings) {
        super(settings);
    }
}
