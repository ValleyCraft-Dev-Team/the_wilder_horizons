package net.linkle.wilder_horizons.item;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ArrowBundleItem extends AlphaModItem {
    public ArrowBundleItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof PlayerEntity player && !player.getAbilities().creativeMode) {
            if (player instanceof ServerPlayerEntity serverPlayer)
                Criteria.CONSUME_ITEM.trigger(serverPlayer, stack);
            player.incrementStat(Stats.USED.getOrCreateStat(this));

            stack.decrement(1);
            var inventory = player.getInventory();

            if (stack.isEmpty()) {
                return new ItemStack(Items.ARROW, 8);
            }

            inventory.insertStack(new ItemStack(Items.ARROW, 8));
            return stack;
        }

        return stack;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 1;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }
}