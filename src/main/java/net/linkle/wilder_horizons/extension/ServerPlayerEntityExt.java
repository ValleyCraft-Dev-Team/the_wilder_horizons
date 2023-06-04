package net.linkle.wilder_horizons.extension;

import net.minecraft.util.math.BlockPos;

public interface ServerPlayerEntityExt {
    default void setWaypointPos(int x, int y, int z) {
        setWaypointPos(new BlockPos(x, y, z));
    }
    
    void setWaypointPos(BlockPos pos);
    
    BlockPos getWaypointPos();
}
