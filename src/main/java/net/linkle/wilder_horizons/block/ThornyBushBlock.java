package net.linkle.wilder_horizons.block;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class ThornyBushBlock extends ModPlantBlock {

    public ThornyBushBlock(VoxelShape shape, Settings settings) {
        super(shape, settings);
    }
    
    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }
    
    @Override
    public float getMaxHorizontalModelOffset() {
        return 0.2f;
    }
    
    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.slowMovement(state, new Vec3d(0.85f, 0.8, 0.85f));
        entity.damage(DamageSource.CACTUS, 1.0f);
    }
}
