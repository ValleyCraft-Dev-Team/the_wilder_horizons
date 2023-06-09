package net.linkle.wilder_horizons.entity.skeletons;

import net.linkle.wilder_horizons.init.init_core.WHArmors;
import net.linkle.wilder_horizons.init.init_core.WHEffects;
import net.linkle.wilder_horizons.init.init_core.WHTools;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class LichEntity extends SkeletonEntity {
    public LichEntity(EntityType<? extends SkeletonEntity> entityType, World world) {
        super(entityType, world);
    }

    @Nullable
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {
        //equipStack(EquipmentSlot.HEAD, new ItemStack(WHArmors.LICH_HOOD_KEEPSAKE));
        //equipStack(EquipmentSlot.CHEST, new ItemStack(WHArmors.LICH_CLOAK_KEEPSAKE));
        equipStack(EquipmentSlot.MAINHAND, new ItemStack(WHTools.SCYTHE_IRON));
        return super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
    }

    public static DefaultAttributeContainer.Builder createHostileAttributes() {
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 100.0D).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 7.0);
    }

    protected void updateEnchantments(Random random, LocalDifficulty localDifficulty) {
    }

    public boolean canHaveStatusEffect(StatusEffectInstance effect) {
        return effect.getEffectType() == StatusEffects.WITHER ? false : super.canHaveStatusEffect(effect);
    }


    public boolean tryAttack(Entity target) {
        if (!super.tryAttack(target)) {
            return false;
        } else {
            if (target instanceof LivingEntity) {
                ((LivingEntity)target).addStatusEffect(new StatusEffectInstance(WHEffects.SOUL_FADING, 100), this);
            }
            return true;
        }
    }
}
