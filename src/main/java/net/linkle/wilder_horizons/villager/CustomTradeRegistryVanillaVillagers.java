package net.linkle.wilder_horizons.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.linkle.wilder_horizons.init.init_core.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class CustomTradeRegistryVanillaVillagers {

    public static void setupTrades() {
        RegisterCustomTrades();
    }

    private static void RegisterCustomTrades() {
        /**yes the fletcher trades are repeated an insane amount of times for a reason dw about it**/

        /**librarian**/
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BOOK, 3),
                            new ItemStack(Items.EMERALD, 1),
                            9999, 3, 0.02f)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.WRITTEN_BOOK, 1),
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(Items.BOOK, 2),
                            99, 3, 0.02f)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHArmors.COPPER_MONOCLE, 1),
                            10, 3, 0.02f)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHArmors.COPPER_GLASSES, 1),
                            10, 3, 0.02f)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.WRITTEN_BOOK, 1),
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(Items.BOOK, 2),
                            99, 3, 0.02f)));
                });

        /**cartographer**/
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(Items.FLOWER_BANNER_PATTERN, 1),
                            10, 2, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(Items.SKULL_BANNER_PATTERN, 1),
                            10, 2, 0.02f)));
                });

        /**cleric**/
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.BEAST_CLAW, 8),
                            new ItemStack(Items.EMERALD, 1),
                            10, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.SOUL_GEM, 1),
                            new ItemStack(Items.EMERALD, 2),
                            16, 2, 0.05f)));
                });

        //TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 2,
        //        factories -> {
        //            factories.add(((entity, random) -> new TradeOffer(
        //                    new ItemStack(Items.EMERALD, 4),
        //                    new ItemStack(WHMiscItems.SOUL_GEM),
        //                    new ItemStack(WHMiscItems.ENCHANTED_EMERALD, 1),
        //                    16, 2, 0.05f)));
        //        });

        /**fletcher**/
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ARROW, 16),
                            32, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING),
                            new ItemStack(WHMiscItems.SPOOL_OF_BOW_STRING, 1),
                            12, 5, 0.08f)));
                });
    }
}
