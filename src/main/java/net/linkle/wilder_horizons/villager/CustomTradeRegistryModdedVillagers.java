package net.linkle.wilder_horizons.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.linkle.wilder_horizons.init.init_core.*;
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
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.HARDTACK, 8),
                            16, 5, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.STABLEHAND, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.WHEAT, 20),
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            16, 10, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(net.minecraft.item.Items.APPLE, 8),
                            16, 10, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 12),
                            new ItemStack(net.minecraft.item.Items.LEATHER, 5),
                            new ItemStack(net.minecraft.item.Items.LEATHER_HORSE_ARMOR, 1),
                            1, 10, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.STABLEHAND, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 3),
                            new ItemStack(WHMiscItems.ARROW_BUNDLE, 1),
                            10, 20, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 5),
                            new ItemStack(WHTools.CLIMBING_AXE, 1),
                            5, 20, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.APPLE_JUICE, 1),
                            16, 10, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.PUMPKIN_SOUP, 1),
                            16, 10, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.STABLEHAND, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 24),
                            new ItemStack(Items.IRON_INGOT, 7),
                            new ItemStack(Items.IRON_HORSE_ARMOR, 1),
                            1, 50, 0.05f)));
                });

        /**innkeeper**/

        TradeOfferHelper.registerVillagerOffers(ModVillagers.INNKEEPER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
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
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.COD_GEFILTE, 1),
                            16, 2, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.INNKEEPER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.SALMON_PIE, 1),
                            16, 5, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.SPICY_POTATOES_AND_BAT, 1),
                            16, 5, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoodIngredients.MILK, 1),
                            10, 5, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.APPLE_JUICE, 1),
                            10, 5, 0.02f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.INNKEEPER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(Items.MUSHROOM_STEW, 1),
                            16, 10, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.SWEET_BERRY_PIE_SLICE, 1),
                            16, 10, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.ALOE_VERA_JUICE, 1),
                            16, 10, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.SALMON_PIE, 1),
                            16, 10, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.INNKEEPER, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 3),
                            new ItemStack(WHFoodsSpecial.CARROT_SALAD, 1),
                            16, 20, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 3),
                            new ItemStack(WHFoodsSpecial.DRIED_SPICY_GLOW_BERRIES, 1),
                            16, 20, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 3),
                            new ItemStack(WHFoodsSpecial.HEARTY_SKEWER, 1),
                            16, 20, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 3),
                            new ItemStack(WHFoodsSpecial.HONEYED_APPLE, 1),
                            16, 20, 0.05f)));
                });

        /**hunter**/

        TradeOfferHelper.registerVillagerOffers(ModVillagers.HUNTER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ROTTEN_FLESH, 32),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.BEAST_CLAW, 8),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BONE, 16),
                            new ItemStack(Items.EMERALD, 1),
                            16, 1, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.SMALL_BONE, 32),
                            new ItemStack(Items.EMERALD, 1),
                            16, 1, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.HUNTER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.SKULL_SHARD, 4),
                            new ItemStack(Items.EMERALD, 1),
                            16, 10, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.MONSTER_HEART, 1),
                            new ItemStack(Items.EMERALD, 1),
                            16, 10, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.MONSTER_LIVER, 4),
                            new ItemStack(Items.EMERALD, 1),
                            16, 5, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.MONSTER_GUTS, 8),
                            new ItemStack(Items.EMERALD, 1),
                            16, 5, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.HUNTER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PHANTOM_MEMBRANE, 3),
                            new ItemStack(Items.EMERALD, 1),
                            16, 20, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.SOUL_GEM, 1),
                            new ItemStack(Items.EMERALD, 1),
                            16, 20, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHNature.SCULK_BLOSSOM, 1),
                            new ItemStack(Items.EMERALD, 1),
                            16, 10, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.LAPIS_LAZULI, 16),
                            new ItemStack(Items.EMERALD, 1),
                            16, 20, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.HUNTER, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 9),
                            new ItemStack(WHTools.KNIFE_BRASIUM, 1),
                            16, 15, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 9),
                            new ItemStack(WHTools.SCYTHE_BRASIUM, 1),
                            16, 15, 0.05f)));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HUNTER, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(Items.SKELETON_SKULL, 1),
                            16, 30, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(WHNature.VILLAGER_SKULL, 1),
                            16, 30, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(WHNature.PIGLIN_SKULL, 1),
                            16, 30, 0.05f)));
                });

        /**clothier**/
        TradeOfferHelper.registerVillagerOffers(ModVillagers.CLOTHIER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.PUFF_BALL, 22),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.SHROOMLEATHER, 9),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.CLOTHIER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHArmors.TUNIC, 1),
                            16, 10, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHArmors.ALLAGER_GARMENTS, 3),
                            16, 10, 0.05f)));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.CLOTHIER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHArmors.SANDALS, 1),
                            16, 20, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHArmors.STRAW_HAT, 1),
                            16, 30, 0.05f)));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.CLOTHIER, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHArmors.MINING_HELMET, 1),
                            16, 20, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(WHArmors.COWPOKE_HAT, 1),
                            16, 30, 0.05f)));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.CLOTHIER, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(WHArmors.PLAINS_SHOES, 1),
                            16, 20, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(WHArmors.TAIGA_BOOTS, 1),
                            16, 20, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(WHArmors.SAVANNA_LAUREL, 1),
                            16, 20, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(WHArmors.SNOWY_CAP, 1),
                            16, 20, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(WHArmors.DESERT_HAT, 1),
                            16, 20, 0.05f)));
                });
    }
}
