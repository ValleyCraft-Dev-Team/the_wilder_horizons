package net.linkle.wilder_horizons.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import net.linkle.wilder_horizons.extension.FallingBlockEntityExt;
import net.minecraft.entity.FallingBlockEntity;

@Mixin(FallingBlockEntity.class)
abstract class FallingBlockEntityMixin implements FallingBlockEntityExt {
    
    @Shadow
    private boolean destroyedOnLanding;
    
    @Override
    public void setDestroyedOnLanding() {
        destroyedOnLanding = true;
    }
}
