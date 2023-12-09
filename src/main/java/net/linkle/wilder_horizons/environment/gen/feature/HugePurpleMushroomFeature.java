package net.linkle.wilder_horizons.environment.gen.feature;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.gen.feature.HugeMushroomFeature;
import net.minecraft.world.gen.feature.HugeMushroomFeatureConfig;

public class HugePurpleMushroomFeature extends HugeMushroomFeature {

    public HugePurpleMushroomFeature(Codec<HugeMushroomFeatureConfig> codec) {
        super(codec);
    }

    @Override
    protected int getHeight(Random random) {
        return random.nextInt(2) + 9;
    }

    @Override
    protected void generateCap(WorldAccess world, Random random, BlockPos start, int y, BlockPos.Mutable mutable, HugeMushroomFeatureConfig config) {
        start = start.up(y);
        final var blockProvider = config.capProvider;
        setBlock(world, start, blockProvider.getBlockState(random, start));
        setBlock(world, start.down().north(), blockProvider.getBlockState(random, start));
        setBlock(world, start.down().east(), blockProvider.getBlockState(random, start));
        setBlock(world, start.down().south(), blockProvider.getBlockState(random, start));
        setBlock(world, start.down().west(), blockProvider.getBlockState(random, start));
        for (var pos : BlockPos.iterate(start.add(-1, -4, -1), start.add(1, -2, 1))) {
            if ((pos.getY() <= start.getY()-3) && Math.abs(pos.getX() - start.getX()) != Math.abs(pos.getZ() - start.getZ())) continue; // +
            if ((pos.getY() <= start.getY()-4) && (Math.abs(pos.getX() - start.getX())== 2) == (Math.abs(pos.getZ() - start.getZ()) == 2)) continue; // corners
            if ((pos.getY() <= start.getY()-3) && pos.getX() == start.getX() && pos.getZ() == start.getZ()) continue; // center
            setBlock(world, pos, blockProvider.getBlockState(random, start));
        }
        setBlock(world, start.down(3).north(2), blockProvider.getBlockState(random, start));
        setBlock(world, start.down(3).east(2), blockProvider.getBlockState(random, start));
        setBlock(world, start.down(3).south(2), blockProvider.getBlockState(random, start));
        setBlock(world, start.down(3).west(2), blockProvider.getBlockState(random, start));
        for (var pos : BlockPos.iterate(start.add(-2, -5, -2), start.add(2, -4, 2))) {
            if (Math.abs(pos.getX() - start.getX()) <= 1 && Math.abs(pos.getZ() - start.getZ()) <= 1) continue; // hollow
            if ((Math.abs(pos.getX() - start.getX()) == 2) == (Math.abs(pos.getZ() - start.getZ()) == 2)) continue; // corners
            setBlock(world, pos, blockProvider.getBlockState(random, start));
        }
        for (var pos : BlockPos.iterate(start.add(-1, -6, -1), start.add(1, -6, 1))) {
            setBlock(world, pos, blockProvider.getBlockState(random, start));
        }
    }

    protected void setBlock(WorldAccess world, BlockPos pos, BlockState state) {
        if (world.getBlockState(pos).isOpaqueFullCube(world, pos)) return;
        setBlockState(world, pos, state);
    }

    /* Hug Red Mushroom Cap (reverse engineered code)
    @Override
    protected void generateCap(WorldAccess world, Random random, BlockPos start, int y, BlockPos.Mutable mutable, HugeMushroomFeatureConfig config) {
        for (int i = y - 3; i <= y; ++i) {
            int radius = i < y ? config.foliageRadius : config.foliageRadius - 1;
            int center = config.foliageRadius - 2;
            for (int x = -radius; x <= radius; ++x)
            for (int z = -radius; z <= radius; ++z) {
                boolean cornerX = x == -radius || x == radius;
                boolean cornerZ = z == -radius || z == radius;
                if (i < y && cornerX == cornerZ) continue;
                mutable.set(start, x, i, z);
                if (world.getBlockState(mutable).isOpaqueFullCube(world, mutable)) continue;
                BlockState state = config.capProvider.getBlockState(random, start);
                if (state.contains(MushroomBlock.WEST) && state.contains(MushroomBlock.EAST) && state.contains(MushroomBlock.NORTH) && state.contains(MushroomBlock.SOUTH) && state.contains(MushroomBlock.UP)) {
                    state = state.with(MushroomBlock.UP, i >= y - 1).with(MushroomBlock.WEST, x < -center).with(MushroomBlock.EAST, x > center).with(MushroomBlock.NORTH, z < -center).with(MushroomBlock.SOUTH, z > center);
                }
                setBlockState(world, mutable, state);
            }
        }
    }
    */

    @Override
    protected int getCapSize(int i, int j, int capSize, int y) {
        int k = 0;
        if (y < j && y >= j - 3) {
            k = capSize;
        } else if (y == j) {
            k = capSize;
        }
        return k;
    }
}
