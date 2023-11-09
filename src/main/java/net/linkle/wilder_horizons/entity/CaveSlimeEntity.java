package net.linkle.wilder_horizons.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.world.World;

public class CaveSlimeEntity extends SlimeEntity {
    public CaveSlimeEntity(EntityType<? extends CaveSlimeEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createCaveSlimeAttributes() {
        return HostileEntity.createHostileAttributes();
    }

    @Override
    protected ParticleEffect getParticles() {
        return super.getParticles();
    }
}
