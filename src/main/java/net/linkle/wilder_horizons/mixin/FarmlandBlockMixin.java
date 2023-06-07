package net.linkle.wilder_horizons.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.linkle.wilder_horizons.block.SprinklerBlock;
import net.linkle.wilder_horizons.init.init_core.WHBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

@Mixin(FarmlandBlock.class)
abstract class FarmlandBlockMixin extends Block {

    FarmlandBlockMixin(Settings settings) {
        super(settings);
    }

    @Inject(method = "isWaterNearby", at = @At("HEAD"), cancellable = true)
    private static void isSprinklerNearby(WorldView world, BlockPos pos, CallbackInfoReturnable<Boolean> info) {
        for (var p : BlockPos.iterate(pos.add(-8, -1, -8), pos.add(8, 1, 8))) {
            var state = world.getBlockState(p);
            if (state.isOf(WHBlocks.SPRINKLER.block) && state.get(SprinklerBlock.POWERED)) {
                info.setReturnValue(true);
            }
        }
    }
}
