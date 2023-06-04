package net.linkle.wilder_horizons.entity.skeletons;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.world.World;

public class MummyEntity extends SkeletonEntity {
    public MummyEntity(EntityType<? extends SkeletonEntity> entityType, World world) {
        super(entityType, world);
    }
}
