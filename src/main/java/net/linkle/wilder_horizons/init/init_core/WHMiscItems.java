package net.linkle.wilder_horizons.init.init_core;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.init.init_exterior.WHGroups;
import net.linkle.wilder_horizons.item.*;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WHMiscItems {
    public static final Item FLOUR = registerItem("flour",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_FOOD)));
    public static final Item MAIZE_FLOUR = registerItem("maize_flour",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_FOOD)));

    public static final Item PLANT_FIBER = registerItem("plant_fiber",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item PLANT_FIBER_STRING = registerItem("plant_fiber_string",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item PLANT_FIBER_CANVAS = registerItem("plant_fiber_canvas",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));

    public static final Item PUFF_BALL = registerItem("puff_ball",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item CLOTH = registerItem("cloth",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));

    public static final Item PLANK_ITEM = registerItem("plank_item",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item HANDLE = registerItem("handle",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item REINFORCED_HANDLE = registerItem("reinforced_handle",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item SPECIALIZED_HANDLE = registerItem("specialized_handle",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));

    public static final Item DAUB = registerItem("daub",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));

    public static final Item SMALL_BONE = registerItem("small_bone",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item DRAGON_TOOTH = registerItem("dragon_tooth",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item SKULL_SHARD = registerItem("skull_shard",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item WITHER_SKULL_SHARD = registerItem("wither_skull_shard",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item JELLY_BLOB = registerItem("jelly_blob",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item OVER_SNAIL_SHELL = registerItem("over_snail_shell",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item CAVE_SNAIL_SHELL = registerItem("cave_snail_shell",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item CROW_FEATHER = registerItem("crow_feather",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item SEAGULL_FEATHER = registerItem("seagull_feather",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item DUCK_FEATHER = registerItem("duck_feather",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item IRON_FEATHER = registerItem("iron_feather",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item GUARDIAN_SPIKE = registerItem("guardian_spike",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item ELDER_GUARDIAN_SPIKE = registerItem("elder_guardian_spike",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item PIG_HIDE = registerItem("pig_hide",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item SHEEPSKIN = registerItem("sheepskin",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));

    public static final Item CLAY_JAR = registerItem("clay_jar",
            new ClayJarItemEmpty(new FabricItemSettings().maxCount(8).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item WATER_FILLED_CLAY_JAR = registerItem("water_clay_jar",
            new ClayJarItemWater(new FabricItemSettings().maxCount(8).group(WHGroups.WH_MISCELLANEOUS), 0,0));
    public static final Item PURIFIED_WATER_FILLED_CLAY_JAR = registerItem("purified_water_clay_jar",
            new ClayJarItemPurifiedWater(new FabricItemSettings().maxCount(8).group(WHGroups.WH_MISCELLANEOUS), 0,0));

    public static final Item BEAST_CLAW = registerItem("beast_claw",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item BONEFIN_SKELETON = registerItem("bonefin_skeleton",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item LIFE_GEM = registerItem("life_gem",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item LUCKY_HOOK = registerItem("lucky_hook",
            new AlphaModItem(new FabricItemSettings().maxCount(1).group(WHGroups.WH_MISCELLANEOUS)));

    public static final Item GEODE_CORE_CRACKED = registerItem("geode_core_cracked",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item GEODE_CORE_ENRICHED = registerItem("geode_core_enriched",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item BRIMSTONE_CRYSTAL = registerItem("brimstone_crystal",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item SALTPETER = registerItem("saltpeter",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item CHARCOAL_NUGGET = registerItem("charcoal_nugget",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item COAL_NUGGET = registerItem("coal_nugget",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item ANTHRACITE_NUGGET = registerItem("anthracite_nugget",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item ANTHRACITE = registerItem("anthracite",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item COPPER_SCRAP = registerItem("copper_scrap",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item GOLD_SCRAP = registerItem("gold_scrap",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item IRON_SCRAP = registerItem("iron_scrap",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item BRASIUM_NUGGET = registerItem("brasium_nugget",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item BRASIUM_SCRAP = registerItem("brasium_scrap",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    //public static final Item ROSEGOLD_ALLOY = registerItem("rosegold_alloy",
    //        new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item BRASIUM_ALLOY = registerItem("brasium_alloy",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item DIAMOND_FRAGMENTS = registerItem("diamond_fragments",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item ECHOCHALCUM = registerItem("echochalcum",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item RAW_NETHERITE_NUGGET = registerItem("raw_netherite_nugget",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));

    public static final Item SEED_BAG = registerItem("seed_bag",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item SPOOL_OF_PLANT_FIBER_STRING = registerItem("spool_of_plant_fiber_string",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item SPOOL_OF_STRING = registerItem("spool_of_string",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item SPOOL_OF_BOW_STRING = registerItem("spool_of_bow_string",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item ARROW_BUNDLE = registerItem("arrow_bundle",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item BOMB_BAG = registerItem("bomb_bag",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item BOTTLE_OF_GHAST_TEARS = registerItem("bottle_of_ghast_tears",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item BOTTLE_OF_ALLAY = registerItem("bottle_of_allay",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item BOTTLE_OF_INK = registerItem("bottle_of_ink",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item QUILL = registerItem("quill",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item RUNECASTING_QUILL = registerItem("runecasting_quill",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item BOOK_OF_RUNECALLING = registerItem("book_of_runecalling",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));

    public static final Item BOW_STRING = registerItem("bow_string",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item TRIGGER_MECHANISM = registerItem("trigger_mechanism",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item IRON_RAIL = registerItem("iron_rail",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));

    public static final Item AMETHYST_LENS = registerItem("amethyst_lens",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item REDSTONE_AGITATOR = registerItem("redstone_agitator",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item THERMAL_BLAZE_CORE = registerItem("thermal_blaze_core",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item CONDUCTIVE_STONE_PLATE = registerItem("conductive_stone_plate",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item NETHER_CORE = registerItem("nether_core",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));

    public static final Item SHROOMLEATHER = registerItem("shroomleather",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item DRIED_SHROOMLEATHER = registerItem("dried_shroomleather",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    //public static final Item TREATED_LEATHER = registerItem("treated_leather",
    //        new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item TREATED_LEATHER_STRAP = registerItem("treated_leather_strap",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));

    public static final Item TOTEM_OF_KNOWLEDGE = registerItem("totem_of_knowledge",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));
    public static final Item TOTEM_OF_PACIFISM = registerItem("totem_of_pacifism",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));

    public static final Item SLUDGE_BUCKET = registerItem("bucket_of_sludge",
            new BucketItem(WHFluids.SLUDGE_STILL.fluid, new FabricItemSettings().maxCount(1).recipeRemainder(Items.BUCKET).group(WHGroups.WH_MISCELLANEOUS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }
    public static void registerItems() {
    }
}
