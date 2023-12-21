package net.linkle.wilder_horizons.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class ModGlowingMushroomBlock extends ModMushroomBlock {

    public ModGlowingMushroomBlock() {
        this(Settings.copy(Blocks.POPPY).luminance(s -> 7).ticksRandomly());
        shape = Block.createCuboidShape(4, 0, 4, 12, 9, 12);
    }

    public ModGlowingMushroomBlock(Settings settings) {
        super(settings);
    }
    
    public ModGlowingMushroomBlock large() {
        shape = Block.createCuboidShape(3, 0, 3, 13, 14, 13);
        return this;
    }

    //public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
    //    if (entity instanceof LivingEntity && entity.getType() != EntityType.MAGMA_CUBE && entity.getType() != EntityType.BLAZE) {
    //        entity.slowMovement(state, new Vec3d(0.800000011920929D, 0.75D, 0.800000011920929D));
    //        if (!world.isClient && (entity.lastRenderX != entity.getX() || entity.lastRenderZ != entity.getZ())) {
    //            double d = Math.abs(entity.getX() - entity.lastRenderX);
    //            double e = Math.abs(entity.getZ() - entity.lastRenderZ);
    //            if (d >= 0.003000000026077032D || e >= 0.003000000026077032D) {
    //                entity.damage(WHDamageSources.GLOWCAP, 1.0F);
    //            }
    //        }
    //
    //    }
    //}
}
