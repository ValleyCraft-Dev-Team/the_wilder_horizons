package net.linkle.wilder_horizons.item;

import net.linkle.wilder_horizons.init.Tools;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class DriftwoodBranchItem extends Item {
    public DriftwoodBranchItem(Settings settings) {
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
                inventory.insertStack(new ItemStack(Items.STICK, MathHelper.nextInt(world.random, 1, 3)));
            }

            inventory.insertStack(new ItemStack(Items.STICK, MathHelper.nextInt(world.random, 1, 3)));
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