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

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHBlocks.EMPTY_BOOKSHELF, 3),
                            9999, 3, 0.02f)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.WRITABLE_BOOK, 2),
                            99, 10, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 3),
                            new ItemStack(Items.EMERALD, 1),
                            99, 10, 0.02f)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHArmors.COPPER_MONOCLE, 1),
                            10, 10, 0.02f)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHArmors.COPPER_GLASSES, 1),
                            10, 10, 0.02f)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.WRITTEN_BOOK, 1),
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(Items.BOOK, 2),
                            99, 50, 0.02f)));
                });

        /**mason**/
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHMiscItems.DAUB, 20),
                            9999, 5, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHBlocks.CHISELED_COBBLESTONE_BRICKS, 4),
                            9999, 10, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHBlocks.PLANTER, 2),
                            9999, 10, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHBlocks.BRICK_CHIMNEY, 3),
                            9999, 10, 0.02f)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHBlocks.SHALE_GRAVESTONE_SPIRIT, 1),
                            9999, 15, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHBlocks.SHALE_GRAVESTONE, 1),
                            9999, 15, 0.02f)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHBlocks.DRIPSTONE_EARTH, 4),
                            9999, 20, 0.02f)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHBlocks.MARBLE_AIR, 4),
                            9999, 20, 0.02f)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHBlocks.SHIVERSTONE_WATER, 4),
                            9999, 20, 0.02f)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHBlocks.SHALE_RUNE_BRICKS, 4),
                            9999, 20, 0.02f)));
                });

        /**armorer**/
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.AMETHYST_SHARD, 16),
                            new ItemStack(Items.EMERALD, 1),
                            12, 1, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(WHArmors.IRON_MASKED_HELMET, 1),
                            12, 1, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(WHArmors.IRON_BREASTPLATE, 1),
                            12, 1, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 7),
                            new ItemStack(WHArmors.IRON_HAUBERK, 1),
                            12, 1, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(WHArmors.IRON_THIGH_GUARDS, 1),
                            12, 1, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(WHArmors.IRON_SANDALS, 1),
                            12, 1, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(WHArmors.SMITHING_MASK, 1),
                            12, 1, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 18),
                            new ItemStack(WHArmors.DIAMOND_MASKED_HELMET, 1),
                            12, 20, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 18),
                            new ItemStack(WHArmors.DIAMOND_BREASTPLATE, 1),
                            12, 20, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 18),
                            new ItemStack(WHArmors.DIAMOND_HAUBERK, 1),
                            12, 20, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(WHArmors.DIAMOND_THIGH_GUARDS, 1),
                            12, 20, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(WHArmors.DIAMOND_SANDALS, 1),
                            12, 20, 0.2f)));
                });
        /**toolsmith**/
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHTools.HATCHET_STONE, 1),
                            12, 1, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHTools.KNIFE_STONE, 1),
                            12, 1, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHTools.SCYTHE_STONE, 1),
                            12, 1, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(WHMiscItems.SMITHING_TOOLS, 1),
                            12, 1, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHTools.ICE_TONGS, 1),
                            12, 1, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.SHEARS, 1),
                            12, 1, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(WHTools.SCYTHE_IRON, 1),
                            3, 1, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(WHTools.KNIFE_IRON, 1),
                            3, 1, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(WHTools.HATCHET_IRON, 1),
                            3, 1, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 17),
                            new ItemStack(WHTools.SCYTHE_DIAMOND, 1),
                            3, 1, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(WHTools.KNIFE_DIAMOND, 1),
                            3, 1, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(WHTools.HATCHET_DIAMOND, 1),
                            3, 1, 0.2f)));
                });
        /**weaponsmith**/
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHTools.WOODEN_STAFF, 1),
                            12, 1, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(WHTools.WOODCUTTER_AXE_IRON, 1),
                            12, 1, 0.2f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(WHTools.TRAVELER_IRON, 1),
                            3, 1, 0.05f)));
                });
        /**cartographer**/
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(WHArmors.BELT, 1),
                            10, 2, 0.02f)));
                });
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
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHArmors.COPPER_MONOCLE, 1),
                            10, 10, 0.02f)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHArmors.COPPER_GLASSES, 1),
                            10, 10, 0.02f)));
                });

        /**farmer**/
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.ONION, 22),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 7),
                            new ItemStack(WHMiscItems.SEED_BAG, 1),
                            16, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHArmors.STRAW_HAT, 1),
                            16, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.BONE_MEAL, 13),
                            16, 2, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 9,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(WHFoods.GOLDEN_PUMPKIN_SLICE, 3),
                            12, 30, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHFoods.GOLDEN_ONION, 3),
                            12, 30, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHFoods.GOLDEN_POTATO, 3),
                            12, 30, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHFoods.GOLDEN_BEETROOT, 3),
                            12, 30, 0.02f)));
                });

        /**shepherd**/
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHMiscItems.CLOTH, 9),
                            10, 10, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING, 3),
                            10, 10, 0.02f)));
                });

        /**fisherman**/
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.SPOOL_OF_STRING, 6),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHBlocks.NET, 6),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHFishItems.PERCH_BUCKET, 1),
                            16, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHFoodIngredients.RAW_PERCH, 6),
                            new ItemStack(WHFoods.COOKED_PERCH, 6),
                            16, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(WHFishItems.SARDINE_BUCKET, 1),
                            16, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHFoodIngredients.RAW_SARDINE, 6),
                            new ItemStack(WHFoods.COOKED_PERCH, 6),
                            16, 2, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHFoodIngredients.RAW_STONEROLLER_MINNOW, 6),
                            8, 1, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.RAW_PERCH, 14),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.RAW_SARDINE, 13),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHFoods.COD_GEFILTE, 1),
                            16, 2, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 6,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.RAW_GLOWSQUID_TENTACLE, 7),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.RAW_SQUID_TENTACLE, 7),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 7,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.RAW_ABYSSWATCHER, 4),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.RAW_TRANSLUCENT_LIONFISH, 4),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.RAW_GOLDFIN, 4),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.02f)));
                });
        /**cleric**/
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.BEAST_CLAW, 8),
                            new ItemStack(Items.EMERALD, 1),
                            10, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.SOUL_POWDER, 3),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.SALT, 16),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PHANTOM_MEMBRANE, 3),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLDEN_APPLE, 1),
                            new ItemStack(Items.EMERALD, 1),
                            10, 7, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.MONSTER_HEART, 1),
                            new ItemStack(Items.EMERALD, 1),
                            16, 7, 0.05f)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoods.COOKED_PHANTOM, 2),
                            new ItemStack(Items.EMERALD, 1),
                            16, 14, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.FERMENTED_SPIDER_EYE, 2),
                            new ItemStack(Items.EMERALD, 1),
                            16, 14, 0.05f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.RAW_ENDERMITE, 1),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f)));
                });

        /**leatherworker**/
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.SHROOMLEATHER, 9),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.HIDE, 6),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHMiscItems.PIG_HIDE, 6),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(WHArmors.COWPOKE_HAT, 1),
                            16, 2, 0.02f)));
                });
        /**butcher**/
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.RAW_FROG_LEGS, 14),
                            new ItemStack(Items.EMERALD, 1),
                            10, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.RAW_CANID, 7),
                            new ItemStack(Items.EMERALD, 1),
                            10, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.RAW_BEAST_HEART, 1),
                            new ItemStack(Items.EMERALD, 1),
                            10, 2, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHFoodIngredients.RAW_BEAST_LIVER, 4),
                            new ItemStack(Items.EMERALD, 1),
                            10, 2, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHFoods.BEEF_STEW, 1),
                            10, 5, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(WHFoods.CREEPER_SOUP, 1),
                            10, 5, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(WHFoodsSpecial.CREAMY_HEART_STEW, 1),
                            10, 5, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(WHMiscItems.SOUL_POWDER, 6),
                            10, 20, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 6,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHBlocks.GLOW_KELP_BLOCK, 10),
                            new ItemStack(Items.EMERALD, 1),
                            10, 30, 0.02f)));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(WHBlocks.ORANGE_KELP_BLOCK, 10),
                            new ItemStack(Items.EMERALD, 1),
                            10, 30, 0.02f)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 7,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GLOW_BERRIES, 10),
                            new ItemStack(Items.EMERALD, 1),
                            10, 30, 0.02f)));
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
