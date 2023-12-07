package net.linkle.wilder_horizons.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

import java.util.Iterator;

public class MossweedBlock extends ModMushroomBlockDaySafe {
    public MossweedBlock() {
        this(Settings.copy(Blocks.RED_MUSHROOM).ticksRandomly());
        shape = Block.createCuboidShape(4, 0, 4, 12, 12, 12);
    }

    public MossweedBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(5) == 0) {
            int i = 5;
            Iterator var7 = BlockPos.iterate(pos.add(-4, -1, -4), pos.add(4, 1, 4)).iterator();

            while(var7.hasNext()) {
                BlockPos blockPos = (BlockPos)var7.next();
                if (world.getBlockState(blockPos).isOf(this)) {
                    --i;
                    if (i <= 0) {
                        return;
                    }
                }
            }

            BlockPos blockPos2 = pos.add(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);

            for(int k = 0; k < 4; ++k) {
                if (world.isAir(blockPos2) && state.canPlaceAt(world, blockPos2)) {
                    pos = blockPos2;
                }

                blockPos2 = pos.add(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            }

            if (world.isAir(blockPos2) && state.canPlaceAt(world, blockPos2)) {
                world.setBlockState(blockPos2, state, 2);
            }
        }

    }
}
