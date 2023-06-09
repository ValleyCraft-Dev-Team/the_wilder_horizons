package net.linkle.wilder_horizons.item;

import net.linkle.wilder_horizons.entity.projectiles.GlowBallEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.world.World;

public class GlowBallItem extends ThrowableItem {

    public GlowBallItem(Settings settings) {
        super(settings);
    }
    
    @Override
    protected ThrownItemEntity newThrownEntity(World world, PlayerEntity user) {
        return GlowBallEntity.create(world, user);
    }
    
    @Override
    protected int getCooldownTick() {
        return 1 * 5;
    }
}
