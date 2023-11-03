package net.linkle.wilder_horizons.mixin;

import net.linkle.wilder_horizons.init.init_core.WHBlocks;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.screen.AbstractRecipeScreenHandler;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;

@Mixin(CraftingScreenHandler.class)
abstract class CraftingScreenHandlerMixin extends AbstractRecipeScreenHandler<CraftingInventory> {

    @Shadow
    private @Final ScreenHandlerContext context;

    public CraftingScreenHandlerMixin(ScreenHandlerType<?> screenHandlerType, int i) {
        super(screenHandlerType, i);
    }

    @Inject(method = "canUse", at = @At("HEAD"), cancellable = true)
    void canUse(PlayerEntity player, CallbackInfoReturnable<Boolean> info) {
        if (CraftingScreenHandler.canUse(context, player, WHBlocks.CRAFTING_MAT.block)) {
            info.setReturnValue(true);
        }
        if (CraftingScreenHandler.canUse(context, player, WHBlocks.IMPROVISED_CRAFTING_TABLE.block)) {
            info.setReturnValue(true);
        }
    }
}