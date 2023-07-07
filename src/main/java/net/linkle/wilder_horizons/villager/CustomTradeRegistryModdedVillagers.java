package net.linkle.wilder_horizons.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.linkle.wilder_horizons.init.init_core.*;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class CustomTradeRegistryModdedVillagers {

    public static void setupTrades() {
        RegisterCustomTrades();
    }

    private static void RegisterCustomTrades() {
        /**stablehand**/

        TradeOfferHelper.registerVillagerOffers(ModVillagers.STABLEHAND, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 8),
                            new ItemStack(net.minecraft.item.Items.SADDLE, 1),
                            10, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(net.minecraft.item.Items.LEAD, 2),
                            16, 5, 0.08f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.STABLEHAND, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.WHEAT, 20),
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 3),
                            new ItemStack(WHMiscItems.ARROW_BUNDLE, 1),
                            10, 5, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(net.minecraft.item.Items.APPLE, 8),
                            16, 5, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.STABLEHAND, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 12),
                            new ItemStack(net.minecraft.item.Items.LEATHER, 5),
                            new ItemStack(net.minecraft.item.Items.LEATHER_HORSE_ARMOR, 1),
                            1, 20, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 5),
                            new ItemStack(WHTools.CLIMBING_AXE, 1),
                            5, 20, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.STABLEHAND, 4,
                factories -> {
                       factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 16),
                            new ItemStack(net.minecraft.item.Items.GOLD_INGOT, 7),
                            new ItemStack(net.minecraft.item.Items.GOLDEN_HORSE_ARMOR, 1),
                            1, 50, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.HARDTACK, 8),
                            16, 5, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.STABLEHAND, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 32),
                            new ItemStack(Items.IRON_INGOT, 7),
                            new ItemStack(Items.IRON_HORSE_ARMOR, 1),
                            1, 50, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.HARDTACK, 8),
                            16, 5, 0.05f)));
                });

        /**innkeeper**/

        TradeOfferHelper.registerVillagerOffers(ModVillagers.INNKEEPER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 2),
                            new ItemStack(WHFoods.PUMPKIN_SOUP, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.SANDWICH_FISH, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.BROTH_VEGETABLE, 1),
                            16, 2, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.INNKEEPER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 2),
                            new ItemStack(WHFoods.SALMON_PIE, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 2),
                            new ItemStack(WHFoods.SPICY_POTATOES_AND_BAT, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 2),
                            new ItemStack(WHFoodIngredients.MILK, 1),
                            10, 2, 0.02f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.INNKEEPER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(Items.MUSHROOM_STEW, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.SWEET_BERRY_PIE_SLICE, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 3),
                            new ItemStack(WHFoods.ALOE_VERA_JUICE, 1),
                            16, 2, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.INNKEEPER, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.SANDWICH_BEEF, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.CLAM_CHOWDER, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.CHICKEN_SOUP, 1),
                            16, 2, 0.05f)));
                });


        TradeOfferHelper.registerVillagerOffers(ModVillagers.INNKEEPER, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.SANDWICH_CHICKEN, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.CAKE_SLICE, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.FISH_PLATTER, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.GRILLED_CHEESE, 1),
                            16, 2, 0.05f)));
                });

        /**hunter**/

        TradeOfferHelper.registerVillagerOffers(ModVillagers.HUNTER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ROTTEN_FLESH, 32),
                            new ItemStack(Items.EMERALD, 1),
                            10, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.ROTTEN_LEATHER, 8),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.HUNTER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BONE, 16),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.SMALL_BONE, 32),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.SKULL_SHARD, 4),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.HUNTER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(WHMiscItems.SOUL_GEM),
                            new ItemStack(WHMiscItems.ENCHANTED_EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.SOUL_GEM, 1),
                            new ItemStack(Items.EMERALD, 2),
                            16, 2, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.HUNTER, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHTools.KNIFE_IRON, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.EXPERIENCE_BOTTLE, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(Items.SKELETON_SKULL, 1),
                            16, 2, 0.05f)));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HUNTER, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(WHTools.KNIFE_DIAMOND, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(WHNature.VILLAGER_SKULL, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(WHNature.PIGLIN_SKULL, 1),
                            16, 2, 0.05f)));
                });
    }
}
