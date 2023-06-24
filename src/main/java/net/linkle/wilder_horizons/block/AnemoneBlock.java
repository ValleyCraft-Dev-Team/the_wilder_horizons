package net.linkle.wilder_horizons.block;

import net.linkle.wilder_horizons.init.init_core.WHEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.SeagrassBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class AnemoneBlock extends SeagrassBlock {
    public AnemoneBlock(Settings settings) {
        super(settings);
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (entity instanceof LivingEntity && entity.getType() != EntityType.COD
                && entity.getType() != EntityType.SALMON
                && entity.getType() != EntityType.PUFFERFISH
                && entity.getType() != EntityType.TROPICAL_FISH
                && entity.getType() != WHEntities.ABYSSWATCHER.type()
                && entity.getType() != WHEntities.RED_PORGY.type()
                && entity.getType() != WHEntities.PERCH.type()
                && entity.getType() != WHEntities.STONEROLLER_MINNOW.type()
                && entity.getType() != WHEntities.SARDINE.type()
        ) {
            entity.slowMovement(state, new Vec3d(0.800000011920929D, 0.75D, 0.800000011920929D));
            if (!world.isClient && (entity.lastRenderX != entity.getX() || entity.lastRenderZ != entity.getZ())) {
                double d = Math.abs(entity.getX() - entity.lastRenderX);
                double e = Math.abs(entity.getZ() - entity.lastRenderZ);
                if (d >= 0.003000000026077032D || e >= 0.003000000026077032D) {
                    entity.damage(DamageSource.GENERIC, 1.0F);
                }
            }

        }
    }
}
