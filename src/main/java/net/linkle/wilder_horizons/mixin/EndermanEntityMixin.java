package net.linkle.wilder_horizons.mixin;

import dev.emi.trinkets.api.TrinketsApi;
import net.linkle.wilder_horizons.init.init_core.WHArmors;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndermanEntity.class)
abstract class EndermanEntityMixin {
    @Inject(method = "isPlayerStaring", at = @At("HEAD"), cancellable = true)
    void isPlayerStaring(PlayerEntity player, CallbackInfoReturnable<Boolean> info) {
        if (player.getEquippedStack(EquipmentSlot.HEAD).isOf(WHArmors.FRIENDLY_MASK)) {
            info.setReturnValue(false);
        }
    }
}
