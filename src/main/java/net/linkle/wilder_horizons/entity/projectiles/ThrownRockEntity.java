package net.linkle.wilder_horizons.entity.projectiles;

import net.linkle.wilder_horizons.init.core_inits.WHEntities;
import net.linkle.wilder_horizons.init.core_inits.WHTools;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

public class ThrownRockEntity extends ThrownItemEntity {

    public ThrownRockEntity(EntityType entityType, World world) {
        super(entityType, world);
    }

    private ThrownRockEntity(World world, PlayerEntity user) {
        super(WHEntities.THROWN_ROCK.type(), user, world);
    }

    public static ThrownRockEntity create(World world, PlayerEntity user) {
        return new ThrownRockEntity(world, user);
    }

    @Override
    protected Item getDefaultItem() {
        return WHTools.THROWING_ROCK;
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) { // called on entity hit.
        super.onEntityHit(entityHitResult);
        var entity = entityHitResult.getEntity(); // sets a new Entity instance as the EntityHitResult (victim)
        entity.damage(DamageSource.thrownProjectile(this, this.getOwner()), 3); // deals damage
    }

    @Override
    protected void onCollision(HitResult hitResult) { // called on collision with a block
        super.onCollision(hitResult);
        if (!this.world.isClient) { // checks if the world is client
            this.world.sendEntityStatus(this, (byte)3); // particle?
            this.kill(); // kills the projectile
        }
    }
}
