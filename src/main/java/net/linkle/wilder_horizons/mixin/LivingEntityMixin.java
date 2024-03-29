package net.linkle.wilder_horizons.mixin;

import net.linkle.wilder_horizons.Debugs;
import net.linkle.wilder_horizons.extension.LivingEntityExt;
import net.linkle.wilder_horizons.init.init_core.WHArmors;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.Predicate;

@Mixin(LivingEntity.class)
abstract class LivingEntityMixin extends Entity implements LivingEntityExt {

    @Unique
    private boolean isAxeClimbing;

    @Unique
    private double lastY;

    LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Override
    public boolean isAxeClimbing() {
        return isAxeClimbing;
    }

    @Override
    public void setIsAxeClimbing(boolean bool) {
        isAxeClimbing = bool;
    }

    @Override
    public boolean isYmoved() {
        return !MathHelper.approximatelyEquals(lastY, getY());
    }

    @Shadow
    abstract boolean isHolding(Predicate<ItemStack> item);

    @Shadow
    abstract void swingHand(Hand hand);

    @Shadow
    abstract ItemStack getMainHandStack();

    @Shadow
    abstract ItemStack getOffHandStack();

    @Inject(method = "tickMovement", at = @At("HEAD"))
    void tickMovement(CallbackInfo info) {
        lastY = getY();
    }

    @Inject(method = "isClimbing", at = @At("HEAD"), cancellable = true)
    void climbingAxe(CallbackInfoReturnable<Boolean> info) {
        Debugs.climbingAxe((LivingEntity)(Object)this, info);
    }

    @Inject(method = "tryUseTotem", at = @At("HEAD"), cancellable = true)
    void tryUseTotem(DamageSource source, CallbackInfoReturnable<Boolean> info) {
    	if (source.isOutOfWorld()) return;
    	var living = (LivingEntity)(Object)this;

        var stack = living.getEquippedStack(EquipmentSlot.CHEST);
		if (stack.isOf(WHArmors.UNDYING_TALISMAN.item)) {
            if (living instanceof ServerPlayerEntity sPlayer) {
                sPlayer.incrementStat(Stats.USED.getOrCreateStat(Items.TOTEM_OF_UNDYING));
                Criteria.USED_TOTEM.trigger(sPlayer, stack);
            }
			living.setHealth(1);
			living.clearStatusEffects();
			living.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 900, 1));
			living.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 100, 1));
			living.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 800, 0));
            world.sendEntityStatus(this, EntityStatuses.USE_TOTEM_OF_UNDYING);
            stack.decrement(1);
            info.setReturnValue(true);
		}
    }
}
