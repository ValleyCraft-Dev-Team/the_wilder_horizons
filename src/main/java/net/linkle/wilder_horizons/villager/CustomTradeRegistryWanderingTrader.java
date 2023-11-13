package net.linkle.wilder_horizons.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.linkle.wilder_horizons.init.init_core.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class CustomTradeRegistryWanderingTrader {

    public static void setupTrades() {
        RegisterCustomTrades();
    }

    private static void RegisterCustomTrades() {
        /**wandering trader**/
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    /**emeralds for items**/
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BREAD, 5),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BOOK, 5),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 5),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.QUILL, 5),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoods.BAKED_APPLE, 9),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoods.CURED_FISH, 5),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoods.MEAT_JERKY, 5),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.HONEY_BOTTLE, 3),
                            new ItemStack(Items.EMERALD, 2),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoods.MEAT_JERKY, 4),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 3),
                            new ItemStack(Items.EMERALD, 4),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.SOUL_GEM, 1),
                            new ItemStack(Items.EMERALD, 2),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.SMALL_BONE, 16),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BONE, 8),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));

                    /**items for currency exchanges**/
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.BRASIUM_COIN, 1),
                            new ItemStack(Items.EMERALD, 5),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.PILVER_COIN, 1),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));

                    /**items for emeralds**/
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.HIDE, 3),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.CRAFTING_TOOLS, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SMITHING_TOOLS, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.LEAD, 2),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.RABBIT_HIDE, 5),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(Items.MAP, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(Items.CREEPER_HEAD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SHROOMLEATHER, 4),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.WRITABLE_BOOK, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHMiscItems.BOMB_BAG, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(Items.GLOBE_BANNER_PATTERN, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(Items.CLOCK, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.CHAINMAIL_HELMET, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(Items.CHAINMAIL_LEGGINGS, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.CHAINMAIL_BOOTS, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.GLASS_BOTTLE, 6),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.REDSTONE, 4),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHTools.TRAVELER_IRON, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHTools.SCYTHE_IRON, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHTools.HATCHET_IRON, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHTools.KNIFE_IRON, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHTools.WOODCUTTER_AXE_IRON, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.IRON_PICKAXE, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.IRON_SHOVEL, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.IRON_AXE, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.IRON_HOE, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(WHTools.CHAMPIONS_BOW, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHArmors.TUNIC, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHArmors.CLOAK, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHArmors.HOOD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHArmors.COPPER_GLASSES, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHArmors.COPPER_MONOCLE, 1),
                            16, 2, 0.05f)));

                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHNature.PURPLE_MUSHROOM, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHNature.GOLD_LEAF_MAPLE_SAPLING, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHNature.WARM_BIRCH_SAPLING, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHNature.APPLE_SAPLING, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHNature.FIREFERN, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHNature.FOXTAIL_FERN, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHNature.CLOVER, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHNature.JELLYCAP, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHMiscItems.BEAST_CLAW, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.COBWEB, 3),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHMiscItems.BOBBING_LURE, 3),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHMiscItems.COPPER_FISHING_HOOK, 3),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHFishItems.SARDINE_BUCKET, 3),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHFishItems.PERCH_BUCKET, 3),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHFishItems.RED_PORGY_BUCKET, 3),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHFishItems.STONEROLLER_MINNOW_BUCKET, 3),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.ARROW_BUNDLE, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(WHMiscItems.SLIME_SPORE, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(WHMiscItems.SCROLL_CHICKEN, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(WHMiscItems.BOTTLE_OF_ALLAY, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHMedicines.SOAP, 3),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHMedicines.BOLUS_POISON, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHMedicines.SALVE_HEALING, 3),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.REINFORCED_HANDLE, 2),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.BOOK, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.QUILL, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHMiscItems.ROPE, 32),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHMiscItems.FLOUR, 16),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.COCOA_BEANS, 3),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.BAMBOO, 3),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.MILK_BUCKET, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(WHArmors.ALLAGER_GARMENTS, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHFoods.APPLE_JUICE, 3),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHFoods.HARDTACK, 16),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHFoods.CREEPER_SOUP, 1),
                            16, 2, 0.05f)));
                });
    }
}
