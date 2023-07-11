package net.linkle.wilder_horizons.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Instrument;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.World;

import java.util.Optional;

public class WardenAntlerItem extends AlphaModItem {
    public WardenAntlerItem(Settings settings) {
        super(settings);
    }

    //public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
    //    ItemStack itemStack = user.getStackInHand(hand);
    //    world.playSound((PlayerEntity)null, user.getX(), user.getY(), user.getZ(),
    //            SoundEvents.ENTITY_WARDEN_SONIC_BOOM, SoundCategory.NEUTRAL,
    //            0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));

    //    int tick = getCooldownTick();
    //    if (tick > 0) {
    //        user.getItemCooldownManager().set(this, tick);
    //    }
    //    return TypedActionResult.success();
    //}

    //public UseAction getUseAction(ItemStack stack) {
    //    return UseAction.BLOCK;
    //}

    //protected int getCooldownTick() {
    //    return 20 * 60;
    //}
}
