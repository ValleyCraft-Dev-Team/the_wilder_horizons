package net.linkle.wilder_horizons.tool.throwing;

import net.linkle.wilder_horizons.item.ThrowableItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.world.World;

public class RockItem extends ThrowableItem {

    public RockItem(Settings settings) {
        super(settings);
    }
    
    @Override
    protected ThrownItemEntity newThrownEntity(World world, PlayerEntity user) {
        return ThrownRockEntity.create(world, user);
    }
    
    @Override
    protected int getCooldownTick() {
        return 1 * 10;
    }
}
