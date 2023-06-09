package net.linkle.wilder_horizons.entity.skeletons;

import net.linkle.wilder_horizons.init.init_core.WHTools;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class WandererEntity extends SkeletonEntity {
    public WandererEntity(EntityType<? extends SkeletonEntity> entityType, World world) {
        super(entityType, world);
    }

    @Nullable
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {
        this.equipStack(EquipmentSlot.MAINHAND, this.makeInitialWeapon());
        return super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
    }

    private ItemStack makeInitialWeapon() {
        return new ItemStack(WHTools.WOODEN_STAFF);
    }
}
