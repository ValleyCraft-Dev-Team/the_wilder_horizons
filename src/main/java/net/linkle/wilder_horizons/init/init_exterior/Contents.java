package net.linkle.wilder_horizons.init.init_exterior;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.linkle.wilder_horizons.init.init_core.*;
import net.linkle.wilder_horizons.util.BlockConvertible;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.tag.TagKey;

import static net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry.registerOxidizableBlockPair;
import static net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry.registerWaxableBlockPair;

public class Contents {
    public static void initialize() {
        compost();
        flammable();
        fuels();
        strips();
        oxidizables();
    }
    
    private static void oxidizables() {
        registerOxidizableBlockPair(WHBlocks.SMALL_CANDELABRA.block, WHBlocks.SMALL_CANDELABRA_EXPOSED.block);
        registerOxidizableBlockPair(WHBlocks.SMALL_CANDELABRA_EXPOSED.block, WHBlocks.SMALL_CANDELABRA_WEATHERED.block);
        registerOxidizableBlockPair(WHBlocks.SMALL_CANDELABRA_WEATHERED.block, WHBlocks.SMALL_CANDELABRA_OXIDIZED.block);
        
        registerWaxableBlockPair(WHBlocks.SMALL_CANDELABRA.block, WHBlocks.WAXED_SMALL_CANDELABRA.block);
        registerWaxableBlockPair(WHBlocks.SMALL_CANDELABRA_EXPOSED.block, WHBlocks.WAXED_SMALL_CANDELABRA_EXPOSED.block);
        registerWaxableBlockPair(WHBlocks.SMALL_CANDELABRA_WEATHERED.block, WHBlocks.WAXED_SMALL_CANDELABRA_WEATHERED.block);
        registerWaxableBlockPair(WHBlocks.SMALL_CANDELABRA_OXIDIZED.block, WHBlocks.WAXED_SMALL_CANDELABRA_OXIDIZED.block);
        
        registerOxidizableBlockPair(WHBlocks.MEDIUM_CANDELABRA.block, WHBlocks.MEDIUM_CANDELABRA_EXPOSED.block);
        registerOxidizableBlockPair(WHBlocks.MEDIUM_CANDELABRA_EXPOSED.block, WHBlocks.MEDIUM_CANDELABRA_WEATHERED.block);
        registerOxidizableBlockPair(WHBlocks.MEDIUM_CANDELABRA_WEATHERED.block, WHBlocks.MEDIUM_CANDELABRA_OXIDIZED.block);
        
        registerWaxableBlockPair(WHBlocks.MEDIUM_CANDELABRA.block, WHBlocks.WAXED_MEDIUM_CANDELABRA.block);
        registerWaxableBlockPair(WHBlocks.MEDIUM_CANDELABRA_EXPOSED.block, WHBlocks.WAXED_MEDIUM_CANDELABRA_EXPOSED.block);
        registerWaxableBlockPair(WHBlocks.MEDIUM_CANDELABRA_WEATHERED.block, WHBlocks.WAXED_MEDIUM_CANDELABRA_WEATHERED.block);
        registerWaxableBlockPair(WHBlocks.MEDIUM_CANDELABRA_OXIDIZED.block, WHBlocks.WAXED_MEDIUM_CANDELABRA_OXIDIZED.block);
        
        registerOxidizableBlockPair(WHBlocks.LARGE_CANDELABRA.block, WHBlocks.LARGE_CANDELABRA_EXPOSED.block);
        registerOxidizableBlockPair(WHBlocks.LARGE_CANDELABRA_EXPOSED.block, WHBlocks.LARGE_CANDELABRA_WEATHERED.block);
        registerOxidizableBlockPair(WHBlocks.LARGE_CANDELABRA_WEATHERED.block, WHBlocks.LARGE_CANDELABRA_OXIDIZED.block);
        
        registerWaxableBlockPair(WHBlocks.LARGE_CANDELABRA.block, WHBlocks.WAXED_LARGE_CANDELABRA.block);
        registerWaxableBlockPair(WHBlocks.LARGE_CANDELABRA_EXPOSED.block, WHBlocks.WAXED_LARGE_CANDELABRA_EXPOSED.block);
        registerWaxableBlockPair(WHBlocks.LARGE_CANDELABRA_WEATHERED.block, WHBlocks.WAXED_LARGE_CANDELABRA_WEATHERED.block);
        registerWaxableBlockPair(WHBlocks.LARGE_CANDELABRA_OXIDIZED.block, WHBlocks.WAXED_LARGE_CANDELABRA_OXIDIZED.block);
        
        registerOxidizableBlockPair(WHBlocks.WALL_CANDELABRA.block, WHBlocks.WALL_CANDELABRA_EXPOSED.block);
        registerOxidizableBlockPair(WHBlocks.WALL_CANDELABRA_EXPOSED.block, WHBlocks.WALL_CANDELABRA_WEATHERED.block);
        registerOxidizableBlockPair(WHBlocks.WALL_CANDELABRA_WEATHERED.block, WHBlocks.WALL_CANDELABRA_OXIDIZED.block);
        
        registerWaxableBlockPair(WHBlocks.WALL_CANDELABRA.block, WHBlocks.WAXED_WALL_CANDELABRA.block);
        registerWaxableBlockPair(WHBlocks.WALL_CANDELABRA_EXPOSED.block, WHBlocks.WAXED_WALL_CANDELABRA_EXPOSED.block);
        registerWaxableBlockPair(WHBlocks.WALL_CANDELABRA_WEATHERED.block, WHBlocks.WAXED_WALL_CANDELABRA_WEATHERED.block);
        registerWaxableBlockPair(WHBlocks.WALL_CANDELABRA_OXIDIZED.block, WHBlocks.WAXED_WALL_CANDELABRA_OXIDIZED.block);
        
        registerOxidizableBlockPair(WHBlocks.WASTEBIN.block, WHBlocks.WASTEBIN_EXPOSED.block);
        registerOxidizableBlockPair(WHBlocks.WASTEBIN_EXPOSED.block, WHBlocks.WASTEBIN_WEATHERED.block);
        registerOxidizableBlockPair(WHBlocks.WASTEBIN_WEATHERED.block, WHBlocks.WASTEBIN_OXIDIZED.block);
        
        registerWaxableBlockPair(WHBlocks.WASTEBIN.block, WHBlocks.WAXED_WASTEBIN.block);
        registerWaxableBlockPair(WHBlocks.WASTEBIN_EXPOSED.block, WHBlocks.WAXED_WASTEBIN_EXPOSED.block);
        registerWaxableBlockPair(WHBlocks.WASTEBIN_WEATHERED.block, WHBlocks.WAXED_WASTEBIN_WEATHERED.block);
        registerWaxableBlockPair(WHBlocks.WASTEBIN_OXIDIZED.block, WHBlocks.WAXED_WASTEBIN_OXIDIZED.block);
    }
    
    private static void strips() {
        
    }

    @SuppressWarnings("unused")
    private static void compost() {
        Float levelUltraLow = 0.1f; // sticks
        Float levelVeryLow = 0.2f; // pie slices, incredibly small plants
        Float levelLow = 0.3f; // leaves, seeds, saplings, grass, doughs
        Float levelMed = 0.5f; // double plant, vines.
        Float levelHigh = 0.65f; // foods, flowers.
        Float levelHigher = 0.75f; // bugs.
        Float levelVeryHigh = 0.85f; // blocks.
        Float levelUltra = 1.0f; // specials.

        putCompost(Items.STICK, levelUltraLow);
        putCompost(Items.BAMBOO, levelUltraLow);

        putCompost(WHMiscItems.AMETHYSTLE_SEEDS, levelLow);
        putCompost(WHMiscItems.RICE_SEEDLINGS, levelLow);
        putCompost(WHMiscItems.PUFF_BALL_SEEDS, levelLow);
        putCompost(WHMiscItems.ONION_SEEDS, levelLow);
        putCompost(WHMiscItems.FIRE_PEPPER_SEEDS, levelLow);
        putCompost(WHMiscItems.CAVE_ROOT_SEEDS, levelLow);
        putCompost(WHMiscItems.VIBRANTHIA_SEED_BULBS, levelLow);
        putCompost(WHMiscItems.OAK_SEED, levelLow);
        putCompost(WHMiscItems.DARK_OAK_SEED, levelLow);
        putCompost(WHMiscItems.SPRUCE_SEED, levelLow);
        putCompost(WHMiscItems.BIRCH_SEED, levelLow);
        putCompost(WHMiscItems.JUNGLE_SEED, levelLow);
        putCompost(WHMiscItems.ACACIA_SEED, levelLow);
        putCompost(WHMiscItems.APPLE_SEED, levelLow);
        putCompost(WHMiscItems.GOLD_LEAF_MAPLE_SEED, levelLow);
        putCompost(WHMiscItems.WARM_BIRCH_SEED, levelLow);

        putCompost(WHArmors.DRIPLEAF_HAT, levelMed);
        putCompost(WHArmors.AZAELEA_CROWN, levelMed);
        putCompost(WHArmors.VINE_CROWN, levelMed);
        putCompost(WHArmors.BLUE_SHELL_BREASTPLATE, levelHigh);
        putCompost(WHArmors.LILY_PAD_HAT, levelMed);

        putCompost(WHFoodIngredients.RAW_WORM, levelHigher);
        putCompost(WHMiscItems.OVER_SNAIL_SHELL, levelHigher);
        putCompost(WHMiscItems.CAVE_SNAIL_SHELL, levelHigher);
        //putCompost(WHMiscItems.SCULK_SNAIL_SHELL, levelHigher);
        putCompost(WHNature.CLAM_BLOCK, levelHigh);
        putCompost(WHFoods.COOKED_CLAM, levelHigher);

        putCompost(WHNature.CHOCOLATE_CAKE, levelUltra);
        putCompost(WHNature.CHEESE, levelUltra);
        putCompost(WHFoods.CHORUS_FRUIT_PIE, levelUltra);
        putCompost(WHFoods.CHORUS_FRUIT_PIE_SLICE, levelVeryLow);
        putCompost(WHFoods.CHOCOLATE_PIE, levelUltra);
        putCompost(WHFoods.CHOCOLATE_PIE_SLICE, levelVeryLow);
        putCompost(WHFoods.CHOCOLATE_CAKE_SLICE, levelVeryLow);
        putCompost(WHFoods.CAKE_SLICE, levelVeryLow);
        putCompost(WHFoods.GLOW_BERRY_PIE, levelUltra);
        putCompost(WHFoods.GLOW_BERRY_PIE_SLICE, levelVeryLow);
        putCompost(WHFoods.SWEET_BERRY_PIE, levelUltra);
        putCompost(WHFoods.SWEET_BERRY_PIE_SLICE, levelVeryLow);
        putCompost(WHFoods.APPLE_PIE, levelUltra);
        putCompost(WHFoods.APPLE_PIE_SLICE, levelVeryLow);

        putCompost(WHFoods.CHOCOLATE_CHUNK_COOKIE, levelVeryHigh);
        putCompost(WHFoods.PUMPKIN_SPICE_COOKIE, levelVeryHigh);
        putCompost(WHFoods.VANILLA_PUMPKIN_SPICE_COOKIE, levelVeryHigh);
        putCompost(WHFoods.CHOCOLATE_PUMPKIN_SPICE_COOKIE, levelVeryHigh);
        putCompost(WHFoods.SUGAR_COOKIE, levelVeryHigh);

        putCompost(WHMiscItems.FLOUR, levelVeryHigh);
        putCompost(WHMiscItems.MAIZE_FLOUR, levelVeryHigh);

        putCompost(WHMiscItems.SALTPETER, levelHigh);
        putCompost(WHMiscItems.PLANT_FIBER, levelLow);

        putCompost(WHFoodIngredients.STAMINELLA_BERRY, levelVeryHigh);
        putCompost(WHFoodIngredients.ALOE_VERA, levelHigh);
        putCompost(WHFoodIngredients.AMETHYSTLE, levelHigh);
        putCompost(WHFoodIngredients.ENDURA_CARROT, levelVeryHigh);
        putCompost(WHFoodIngredients.HEARTY_BEETROOT, levelVeryHigh);
        putCompost(WHFoodIngredients.ONION, levelHigh);
        putCompost(WHFoodIngredients.FIRE_PEPPER, levelHigh);
        putCompost(WHFoodIngredients.MAIZE, levelHigh);
        putCompost(WHFoodIngredients.ANCIENT_FLOWER, levelHigh);
        putCompost(WHFoodIngredients.CAVE_ROOT, levelHigh);
        putCompost(WHFoodIngredients.MINERS_LETTUCE, levelHigh);
        putCompost(WHFoodIngredients.RAW_RICE, levelHigh);
        putCompost(WHFoodIngredients.PUMPKIN_SLICE, levelLow);
        putCompost(WHFoodIngredients.RAW_TRIPE, levelLow);
        putCompost(WHFoodIngredients.RAW_SILVERFISH, levelLow);
        putCompost(WHFoodIngredients.RAW_ENDERMITE, levelLow);
        //putCompost(WHFoodIngredients.ZOD, levelLow);

        putCompost(WHFoods.BAKED_APPLE, levelVeryHigh);
        putCompost(WHFoods.BAKED_BEETROOT, levelVeryHigh);
        putCompost(WHFoods.BAKED_HEARTY_BEETROOT, levelVeryHigh);
        putCompost(WHFoods.BAKED_CARROT, levelVeryHigh);
        putCompost(WHFoods.BAKED_ENDURA_CARROT, levelVeryHigh);
        putCompost(WHFoods.BAKED_FIRE_PEPPER, levelVeryHigh);
        putCompost(WHFoods.BAKED_PUMPKIN_SLICE, levelVeryHigh);
        putCompost(WHFoods.BAKED_MELON_SLICE, levelVeryHigh);
        putCompost(WHFoods.BAKED_ONION, levelVeryHigh);
        putCompost(WHFoods.BAKED_SWEET_BERRIES, levelVeryHigh);
        putCompost(WHFoods.BAKED_GLOW_BERRIES, levelVeryHigh);
        putCompost(WHFoods.BAKED_SEEDS, levelMed);
        putCompost(WHFoods.COOKED_RICE, levelVeryHigh);
        putCompost(WHFoods.COOKED_CAVE_ROOT, levelVeryHigh);
        putCompost(WHFoods.DRIED_GLOW_KELP, levelLow);
        putCompost(WHFoods.DRIED_ORANGE_KELP, levelLow);
        putCompost(Items.EGG, levelHigh);
        putCompost(WHFoods.FRIED_EGG, levelVeryHigh);
        putCompost(WHFoods.CORN_BREAD, levelVeryHigh);
        putCompost(WHFoods.HARDTACK, levelHigh);

        putCompost(WHFoodIngredients.HARDTACK_DOUGH, levelLow);
        putCompost(WHFoodIngredients.BREAD_DOUGH, levelLow);
        putCompost(WHFoodIngredients.CORN_BREAD_DOUGH, levelLow);
        putCompost(WHFoodIngredients.COOKIE_DOUGH, levelLow);
        putCompost(WHFoodIngredients.SUGAR_COOKIE_DOUGH, levelLow);
        putCompost(WHFoodIngredients.CHOCOLATE_CHUNK_COOKIE_DOUGH, levelLow);
        putCompost(WHFoodIngredients.PUMPKIN_SPICE_COOKIE_DOUGH, levelLow);
        putCompost(WHFoodIngredients.PUMPKIN_PIE_DOUGH, levelLow);
        putCompost(WHFoodIngredients.CHOCOLATE_PIE_DOUGH, levelLow);
        putCompost(WHFoodIngredients.APPLE_PIE_DOUGH, levelLow);
        putCompost(WHFoodIngredients.SWEET_BERRY_PIE_DOUGH, levelLow);
        putCompost(WHFoodIngredients.GLOW_BERRY_PIE_DOUGH, levelLow);
        putCompost(WHFoodIngredients.CHORUS_FRUIT_PIE_DOUGH, levelLow);
        putCompost(WHFoodIngredients.CAKE_DOUGH, levelLow);
        putCompost(WHFoodIngredients.CHOCOLATE_CAKE_DOUGH, levelLow);
        putCompost(WHFoodIngredients.VANILLA_FROSTING, levelLow);

        putCompost(WHNature.FADED_SOUL_ROSE, levelHigh);
        putCompost(WHNature.SOUL_ROSE, levelVeryHigh);
        putCompost(WHNature.BLUE_SOUL_ROSE, levelUltra);
        putCompost(WHNature.ARID_VINES, levelMed);
        putCompost(WHNature.ARID_VINES_PLANT, levelMed);
        putCompost(WHNature.WARM_BIRCH_LEAVES, levelLow);
        putCompost(WHNature.WARM_BIRCH_SAPLING, levelLow);
        putCompost(WHNature.APPLE_LEAVES, levelLow);
        putCompost(WHNature.APPLE_SAPLING, levelLow);
        putCompost(WHNature.APPLE_LEAVES_EMPTY, levelLow);
        putCompost(WHNature.GOLD_LEAF_MAPLE_LEAVES, levelLow);
        putCompost(WHNature.GOLD_LEAF_MAPLE_SAPLING, levelLow);
        putCompost(WHNature.ALGAE, levelVeryLow);
        putCompost(WHNature.SMALLEST_LILYPADS, levelMed);
        putCompost(WHNature.SMALL_LILYPAD, levelLow);
        putCompost(WHNature.SMALL_LILYPADS, levelMed);
        putCompost(WHNature.GLOW_SEAGRASS, levelLow);
        putCompost(WHNature.ORANGE_SEAGRASS, levelLow);
        putCompost(WHNature.GLOW_KELP, levelLow);
        putCompost(WHNature.ORANGE_KELP, levelLow);
        putCompost(WHNature.ORANGE_KELP_PLANT, levelLow);
        putCompost(WHNature.GLOW_KELP_PLANT, levelLow);
        putCompost(WHNature.ICEPLANT, levelLow);
        putCompost(WHNature.BEACH_GRASS, levelLow);
        putCompost(WHNature.NEST, levelLow);
        putCompost(WHNature.YELLOW_FLOWERING_LILYPAD, levelHigh);
        putCompost(WHNature.WHITE_FLOWERING_LILYPAD, levelHigh);
        putCompost(WHNature.RED_FLOWERING_LILYPAD, levelHigh);
        putCompost(WHNature.PURPLE_FLOWERING_LILYPAD, levelHigh);
        putCompost(WHNature.PINK_FLOWERING_LILYPAD, levelHigh);
        putCompost(WHNature.BLUE_FLOWERING_LILYPAD, levelHigh);
        putCompost(WHNature.CATTAILS, levelMed);
        putCompost(WHNature.DESERT_SHRUB, levelLow);
        putCompost(WHNature.BUSH, levelLow);
        putCompost(WHNature.LARGE_BUSH, levelMed);
        putCompost(WHNature.LUSH_BUSH, levelLow);
        putCompost(WHNature.TALL_LIVING_BUSH, levelMed);
        putCompost(WHNature.TALL_DEAD_BUSH, levelMed);
        putCompost(Blocks.DEAD_BUSH, levelLow);
        putCompost(WHNature.MIMIC_FLOWER, levelHigh);
        putCompost(WHNature.WILD_AMETHYSTLE, levelHigh);
        putCompost(WHNature.WILD_BEET, levelHigh);
        putCompost(WHNature.WILD_CARROT, levelHigh);
        putCompost(WHNature.WILD_CAVE_ROOT, levelHigh);
        putCompost(WHNature.WILD_HERBS, levelHigh);
        putCompost(WHNature.WILD_FIRE_PEPPER, levelHigh);
        putCompost(WHNature.WILD_MINERS_LETTUCE, levelHigh);
        putCompost(WHNature.WILD_ONION, levelHigh);
        putCompost(WHNature.WILD_POTATO, levelHigh);
        putCompost(WHNature.WILD_PUFF_BALL, levelHigh);
        putCompost(WHNature.WILD_RICE, levelHigh);
        putCompost(WHNature.WILD_WHEAT, levelHigh);
        putCompost(WHNature.WEEPING_GHOST_WILLOW, levelHigh);
        putCompost(WHNature.MEADOW_FLOWERS, levelHigh);
        putCompost(WHNature.SPROUT, levelMed);
        putCompost(WHNature.MOSS_SPROUTLET, levelLow);
        putCompost(WHNature.SHORT_GRASS, levelLow);
        putCompost(WHNature.SNOWFLOWER, levelHigh);
        putCompost(WHNature.PURPLE_MUSHROOM, levelHigh);
        putCompost(WHNature.TALL_LAVENDER, levelHigh);
        putCompost(WHNature.TALL_ALLIUM, levelHigh);
        putCompost(WHNature.TALL_AZURE_BLUET, levelHigh);
        putCompost(WHNature.SPORE_SPREADER, levelHigh);
        putCompost(WHNature.LAVENDER, levelHigh);
        putCompost(WHNature.GLOW_MUSHROOM, levelHigh);
        putCompost(WHNature.FAN_MOLD, levelMed);
        putCompost(WHNature.WHITE_POPPY, levelHigh);
        putCompost(WHNature.TALL_CORNFLOWER, levelHigh);
        putCompost(WHNature.TALL_OXEYE_DAISY, levelHigh);
        putCompost(WHNature.YELLOW_POPPY, levelHigh);
        putCompost(WHNature.ORANGE_POPPY, levelHigh);
        putCompost(WHNature.LILY_OF_THE_MOUNTAINS, levelHigh);
        putCompost(WHNature.LILY_OF_THE_OCEANS, levelHigh);
        putCompost(WHNature.KNAPWEED, levelHigh);
        putCompost(WHNature.PURPLE_TULIP, levelHigh);
        putCompost(WHNature.YELLOW_TULIP, levelHigh);
        putCompost(WHNature.LIGHT_BLUE_TULIP, levelHigh);
        putCompost(WHNature.LEATHERLEAF_FERN, levelHigh);
        putCompost(WHNature.BIG_FERN, levelVeryHigh);
        putCompost(WHNature.BLACK_TULIP, levelHigh);
        putCompost(WHNature.ORANGE_BEAUTY, levelHigh);
        putCompost(WHNature.HONEYCLUSTER, levelHigh);
        putCompost(WHNature.CLOVER, levelHigh);
        putCompost(WHNature.BLACK_DAHLIA, levelHigh);
        putCompost(WHNature.JUNGLE_BUSH, levelHigh);
        putCompost(WHNature.FOXTAIL_FERN, levelHigh);
        putCompost(WHNature.FLUFFY_DANDELION, levelHigh);
        putCompost(WHNature.THORNY_BUSH, levelHigh);
        putCompost(WHNature.FLOWERING_CACTUS, levelHigh);

        putCompost(WHBlocks.FIBER_BALE, levelHigh);
        putCompost(WHBlocks.SUGARCANE_BALE, levelVeryHigh);
        putCompost(WHBlocks.GLOW_KELP_BLOCK, levelMed);
        putCompost(WHBlocks.ORANGE_KELP_BLOCK, levelMed);
    }
    
    private static void flammable() {
        
    }
    
    private static void fuels() {
        putFuels(WHBlocks.CHARCOAL_BLOCK, 16000);
        putFuels(WHNature.GLOW_MUSHROOM, 800);
        putFuels(WHNature.CATTAILS, 100);
        putFuels(WHMiscItems.PUFF_BALL, 100);
        putFuels(WHMiscItems.CLOTH, 100);
        putFuels(WHMiscItems.PLANT_FIBER_CANVAS, 200);
        putFuels(WHMiscItems.PLANT_FIBER_STRING, 100);
        putFuels(WHMiscItems.SPOOL_OF_PLANT_FIBER_STRING, 300);
        putFuels(WHMiscItems.PLANT_FIBER, 100);
        putFuels(WHMiscItems.PLANK_ITEM, 150);
        putFuels(WHFoodIngredients.FIRE_PEPPER, 50);
        putFuels(WHMiscItems.HANDLE, 250);
        putFuels(WHMiscItems.REINFORCED_HANDLE, 250);
        putFuels(WHMiscItems.SPECIALIZED_HANDLE, 250);
        putFuels(WHMiscItems.COAL_NUGGET, 400);
        putFuels(WHMiscItems.ANTHRACITE, 1600);
        putFuels(WHBlocks.ANTHRACITE_BLOCK, 16000);
        putFuels(WHMiscItems.BRIMSTONE_CRYSTAL, 800);
        putFuels(Items.BLAZE_POWDER, 1200);
        putFuels(Items.NETHER_STAR, 32000);
        putFuels(WHMiscItems.NETHER_CORE, 32000);
        putFuels(WHMiscItems.THERMAL_BLAZE_CORE, 4000);

        putFuels(WHTools.KNIFE_WOODEN, 200);
        putFuels(WHTools.TRAVELER_WOODEN, 200);
        putFuels(WHTools.SCYTHE_WOODEN, 200);
        putFuels(WHTools.WOODCUTTER_AXE_WOODEN, 200);
        putFuels(WHTools.HATCHET_WOODEN, 200);
        putFuels(WHTools.WOODEN_OAR, 200);
        putFuels(WHTools.BRANCH, 400);
        putFuels(WHTools.DRIFTWOOD_BRANCH, 400);
        putFuels(WHTools.WOODEN_STAFF, 300);
        putFuels(WHTools.BAMBOO_STAFF, 300);

        putFuels(WHNature.OAK_SEED, 100);
        putFuels(WHNature.BIRCH_SEED, 100);
        putFuels(WHNature.SPRUCE_SEED, 100);
        putFuels(WHNature.ACACIA_SEED, 100);
        putFuels(WHNature.DARK_OAK_SEED, 100);
        putFuels(WHNature.JUNGLE_SEED, 100);
        putFuels(WHNature.APPLE_SEED, 100);
        putFuels(WHNature.GOLD_LEAF_MAPLE_SEED, 100);
        putFuels(WHNature.WARM_BIRCH_SEED, 100);
    }
    
    private static void putStrip(BlockConvertible input, BlockConvertible stripped) {
        StrippableBlockRegistry.register(input.asBlock(), stripped.asBlock());
    }
    
    private static void putCompost(ItemConvertible item, Float chance) {
        CompostingChanceRegistry.INSTANCE.add(item, chance);
    }
    
    private static void putFlammable(BlockConvertible block, int burn, int spread) {
        FlammableBlockRegistry.getDefaultInstance().add(block.asBlock(), burn, spread);;
    }
    
    private static void putFuels(ItemConvertible item, Integer tick) {
        FuelRegistry.INSTANCE.add(item, tick);
    }
    
    private static void putFuels(TagKey<Item> tag, Integer tick) {
        FuelRegistry.INSTANCE.add(tag, tick);
    }
}
