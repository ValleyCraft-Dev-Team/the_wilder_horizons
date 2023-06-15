package net.linkle.wilder_horizons.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.linkle.wilder_horizons.init.init_core.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class CustomTradeRegistry {

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
                            new ItemStack(net.minecraft.item.Items.WHEAT, 20),
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(net.minecraft.item.Items.LEAD, 2),
                            16, 5, 0.08f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.STABLEHAND, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 5),
                            new ItemStack(Items.CARROT_ON_A_STICK, 1),
                            16, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 3),
                            new ItemStack(WHMiscItems.ARROW_BUNDLE, 1),
                            10, 5, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.VEGETABLE_MIX, 3),
                            16, 5, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(net.minecraft.item.Items.APPLE, 8),
                            16, 5, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(Items.CARROT, 4),
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
                            new ItemStack(net.minecraft.item.Items.EMERALD, 12),
                            new ItemStack(WHMiscItems.SHEEPSKIN, 5),
                            new ItemStack(net.minecraft.item.Items.LEATHER_HORSE_ARMOR, 1),
                            1, 20, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 12),
                            new ItemStack(WHMiscItems.PIG_HIDE, 5),
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
                            new ItemStack(net.minecraft.item.Items.GOLD_INGOT, 6),
                            new ItemStack(net.minecraft.item.Items.GOLDEN_HORSE_ARMOR, 1),
                            1, 50, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.HARDTACK, 8),
                            16, 5, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(net.minecraft.item.Items.SUGAR, 16),
                            16, 5, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.BAKED_CARROT, 10),
                            16, 5, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 3),
                            new ItemStack(net.minecraft.item.Items.GOLDEN_CARROT, 1),
                            16, 5, 0.05f)));
                });

        /**innkeeper**/

        TradeOfferHelper.registerVillagerOffers(ModVillagers.INNKEEPER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 2),
                            new ItemStack(WHFoodIngredients.MILK, 1),
                            10, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 3),
                            new ItemStack(WHFoods.COD_GEFILTE, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.HARDTACK, 3),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(Items.BREAD, 2),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.BROTH_VEGETABLE, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.COOKED_PERCH, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 2),
                            new ItemStack(WHFoods.SAVORY_BREAKFAST, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.CHOCOLATE, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.STIR_FRIED_MONSTER_GUTS, 1),
                            16, 2, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.INNKEEPER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.DOG_BISCUIT, 3),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.SUGAR_COOKIE, 4),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.CARROT_JUICE, 1),
                            10, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.HARD_BOILED_EGG, 2),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.CHOCOLATE_CAKE_SLICE, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(Items.MUSHROOM_STEW, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 2),
                            new ItemStack(WHMedicines.HEALING_TEA, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 2),
                            new ItemStack(WHFoods.SALMON_PIE, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 2),
                            new ItemStack(WHFoods.SPICY_POTATOES_AND_BAT, 1),
                            16, 2, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.INNKEEPER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 2),
                            new ItemStack(WHFoods.GOLDEN_WATERMELON_JUICE, 1),
                            10, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.HEARTY_BREAKFAST, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.SWEET_BERRY_PIE_SLICE, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.BAKED_SEEDS, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 2),
                            new ItemStack(WHMedicines.NIGHT_VISION_TEA, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 3),
                            new ItemStack(WHFoods.ALOE_VERA_JUICE, 1),
                            16, 2, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.INNKEEPER, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 2),
                            new ItemStack(Items.COOKED_COD, 1),
                            10, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.SANDWICH_CHICKEN, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.EGGS_ON_TOAST, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            new ItemStack(WHFoods.CLAM_CHOWDER, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 2),
                            new ItemStack(WHMedicines.HEALING_TEA, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(net.minecraft.item.Items.EMERALD, 2),
                            new ItemStack(WHFoods.PUMPKIN_SOUP, 1),
                            16, 2, 0.05f)));
                });
    }
}
