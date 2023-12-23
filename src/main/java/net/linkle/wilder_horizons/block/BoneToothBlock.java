package net.linkle.wilder_horizons.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.enums.Thickness;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class BoneToothBlock extends BrimstoneCrystalClusterBlock {
    public BoneToothBlock(int height, int xzOffset, Settings settings) {
        super(height, xzOffset, settings);
    }

    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        entity.handleFallDamage(fallDistance + 2.0F, 2.0F, DamageSource.STALAGMITE);
    }
}
