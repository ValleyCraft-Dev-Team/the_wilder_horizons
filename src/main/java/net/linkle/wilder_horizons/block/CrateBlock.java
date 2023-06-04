package net.linkle.wilder_horizons.block;

import org.jetbrains.annotations.Nullable;

import net.linkle.wilder_horizons.block.entity.CrateBlockEntity;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class CrateBlock extends HorizontalContainerBlock {
    
    public CrateBlock(Settings settings) {
        super(settings);
    }
    
    @Override @Nullable
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CrateBlockEntity(pos, state);
    }
}
