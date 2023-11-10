package net.linkle.wilder_horizons.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.GuardianEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class GuardianSentryEntity extends GuardianEntity {
    public GuardianSentryEntity(EntityType<? extends GuardianSentryEntity> entityType, World world) {
        super(entityType, world);
    }

    public static boolean canSpawnSentry(EntityType<? extends GuardianSentryEntity> type, WorldAccess world, SpawnReason spawnReason, BlockPos pos, Random random) {
        return !(random.nextInt(20) != 0 && world.isSkyVisibleAllowingSea(pos) || world.getDifficulty() == Difficulty.PEACEFUL || spawnReason != SpawnReason.SPAWNER && !world.getFluidState(pos).isIn(FluidTags.WATER) || !world.getFluidState(pos.down()).isIn(FluidTags.WATER));
    }

    public static DefaultAttributeContainer.Builder createGuardianSentryAttributes() {
        return GuardianEntity.createGuardianAttributes();
    }
}
