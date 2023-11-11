package net.linkle.wilder_horizons.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.function.Supplier;

public class SummonerItem extends ModItem {

    private final Supplier<Item> spawnEgg;
    public SummonerItem(Supplier<Item> spawnEgg, Settings settings) {
        super(settings);
        this.spawnEgg = spawnEgg;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return spawnEgg.get().useOnBlock(context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return spawnEgg.get().use(world, user, hand);
    }
}
