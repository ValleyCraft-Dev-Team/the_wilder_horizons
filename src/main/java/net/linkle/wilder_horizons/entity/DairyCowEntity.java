package net.linkle.wilder_horizons.entity;

import net.linkle.wilder_horizons.init.init_core.WHEntities;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

public class DairyCowEntity extends CowEntity {

    public DairyCowEntity(net.minecraft.entity.EntityType entityType, World world) {
        super(entityType, world);
    }

    @Override
    public DairyCowEntity createChild(ServerWorld world, PassiveEntity entity) {
        return WHEntities.DAIRY_COW.create(world);
    }
}
