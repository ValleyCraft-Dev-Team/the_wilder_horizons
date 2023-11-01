package net.linkle.wilder_horizons.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class GlowSquidLanternBlock extends LanternBlock {
    public GlowSquidLanternBlock() {
        this(Settings.copy(Blocks.LANTERN).ticksRandomly());
    }
    public GlowSquidLanternBlock(Settings settings) {
        super(settings);
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        var shape = this.getOutlineShape(state, world, pos, ShapeContext.absent());
        var vec = shape.getBoundingBox().getCenter();
        double x = (double)pos.getX() + vec.x;
        double z = (double)pos.getZ() + vec.z;
        for (int i = 0; i < 3; ++i) {
            if (!random.nextBoolean()) continue;
            world.addParticle(ParticleTypes.GLOW, x + random.nextDouble() / 5.0, (double)pos.getY() + (0.5 - random.nextDouble()), z + random.nextDouble() / 5.0, 0.0, 0.0, 0.0);
        }
    }
}
