package net.linkle.wilder_horizons.mixin;

import net.linkle.wilder_horizons.item.gear.armor.WHArmorMaterials;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.tag.FluidTags;
import net.minecraft.world.World;

@Mixin(PlayerEntity.class)
abstract class PlayerEntityMixin extends LivingEntity {

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "updateTurtleHelmet", at = @At("HEAD"))
    void updateDiverSuit(CallbackInfo info) {
        if (!isSubmergedIn(FluidTags.WATER)) {
            for (var slot : EquipmentSlot.values()) {
                if (slot.getType() != EquipmentSlot.Type.ARMOR) continue;
                var stack = getEquippedStack(slot);
                if (stack.getItem() instanceof ArmorItem armor && armor.getMaterial() == WHArmorMaterials.TURTLE) {
                    continue;
                }
                return;
            }
            addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 200, 0, false, false, true));
        }
    }
}
