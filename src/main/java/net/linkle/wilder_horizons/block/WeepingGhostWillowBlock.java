package net.linkle.wilder_horizons.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class WeepingGhostWillowBlock extends ModPlantBlock{
    public WeepingGhostWillowBlock() {
        this(Settings.copy(Blocks.POPPY).luminance(s -> 3).ticksRandomly());
        shape = Block.createCuboidShape(4, 0, 4, 12, 9, 12);
    }

    public WeepingGhostWillowBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOpaqueFullCube(world, pos);
    }
}
