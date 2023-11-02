package net.linkle.wilder_horizons.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class SnowFlowerBlock extends ModPlantBlock{

    public SnowFlowerBlock() {
        this(Settings.copy(Blocks.POPPY).luminance(s -> 5).ticksRandomly());
        shape = Block.createCuboidShape(4, 0, 4, 12, 9, 12);
    }

    public SnowFlowerBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOpaqueFullCube(world, pos);
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
    	var shape = this.getOutlineShape(state, world, pos, ShapeContext.absent());
        var vec = shape.getBoundingBox().getCenter();
        double x = (double)pos.getX() + vec.x;
        double z = (double)pos.getZ() + vec.z;
        for (int i = 0; i < 3; ++i) {
            if (!random.nextBoolean()) continue;
            world.addParticle(ParticleTypes.SNOWFLAKE, x + random.nextDouble() / 5.0, (double)pos.getY() + (0.5 - random.nextDouble()), z + random.nextDouble() / 5.0, 0.0, 0.0, 0.0);
        }
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (entity instanceof LivingEntity && entity.getType() != EntityType.STRAY && entity.getType() != EntityType.POLAR_BEAR && entity.getType() != EntityType.FOX && entity.getType() != EntityType.WOLF) {
            entity.slowMovement(state, new Vec3d(0.8, 0.75D, 0.8));
            if (!world.isClient) {
            	entity.damage(DamageSource.FREEZE, 1.0F);
            }
        }
    }
}
