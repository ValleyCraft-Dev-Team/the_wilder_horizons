package net.linkle.wilder_horizons.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.item.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WHMiscItems {
    public static final Item PLANT_FIBER = registerItem("plant_fiber",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item PLANT_FIBER_STRING = registerItem("plant_fiber_string",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item PLANT_FIBER_CANVAS = registerItem("plant_fiber_canvas",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));

    public static final Item PUFF_BALL = registerItem("puff_ball",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item CLOTH = registerItem("cloth",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));

    public static final Item PLANK_ITEM = registerItem("plank_item",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item HANDLE = registerItem("handle",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item REINFORCED_HANDLE = registerItem("reinforced_handle",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item SPECIALIZED_HANDLE = registerItem("specialized_handle",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));

    public static final Item DAUB = registerItem("daub",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));

    public static final Item SMALL_BONE = registerItem("small_bone",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item DRAGON_TOOTH = registerItem("dragon_tooth",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item SKULL_SHARD = registerItem("skull_shard",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item WITHER_SKULL_SHARD = registerItem("wither_skull_shard",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item JELLY_BLOB = registerItem("jelly_blob",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item OVER_SNAIL_SHELL = registerItem("over_snail_shell",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item CAVE_SNAIL_SHELL = registerItem("cave_snail_shell",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item CROW_FEATHER = registerItem("crow_feather",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item SEAGULL_FEATHER = registerItem("seagull_feather",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item DUCK_FEATHER = registerItem("duck_feather",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item IRON_FEATHER = registerItem("iron_feather",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item GUARDIAN_SPIKE = registerItem("guardian_spike",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item ELDER_GUARDIAN_SPIKE = registerItem("elder_guardian_spike",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item PIG_HIDE = registerItem("pig_hide",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item SHEEPSKIN = registerItem("sheepskin",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));

    public static final Item BEAST_CLAW = registerItem("beast_claw",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item BONEFIN_SKELETON = registerItem("bonefin_skeleton",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item LIFE_GEM = registerItem("life_gem",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item BRIMSTONE_CRYSTAL = registerItem("brimstone_crystal",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item COAL_NUGGET = registerItem("coal_nugget",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item ANTHRACITE_NUGGET = registerItem("anthracite_nugget",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item ANTHRACITE = registerItem("anthracite",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item COPPER_SCRAP = registerItem("copper_scrap",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item GOLD_SCRAP = registerItem("gold_scrap",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item IRON_SCRAP = registerItem("iron_scrap",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item DIAMOND_FRAGMENTS = registerItem("diamond_fragments",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item RAW_NETHERITE_NUGGET = registerItem("raw_netherite_nugget",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item SALTPETER = registerItem("saltpeter",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));

    public static final Item GEODE_CORE_CRACKED = registerItem("geode_core_cracked",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item GEODE_CORE_ENRICHED = registerItem("geode_core_enriched",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));

    public static final Item SEED_BAG = registerItem("seed_bag",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item SPOOL_OF_STRING = registerItem("spool_of_string",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item SPOOL_OF_PLANT_FIBER_STRING = registerItem("spool_of_plant_fiber_string",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item ARROW_BUNDLE = registerItem("arrow_bundle",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item BOMB_BAG = registerItem("bomb_bag",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item BOTTLE_OF_GHAST_TEARS = registerItem("bottle_of_ghast_tears",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item BOTTLE_OF_ALLAY = registerItem("bottle_of_allay",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item BOTTLE_OF_INK = registerItem("bottle_of_ink",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item QUILL = registerItem("quill",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item RUNECASTING_QUILL = registerItem("runecasting_quill",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item BOOK_OF_RUNECALLING = registerItem("book_of_runecalling",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));

    public static final Item BOW_STRING = registerItem("bow_string",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item TRIGGER_MECHANISM = registerItem("trigger_mechanism",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));

    public static final Item ROSEGOLD_ALLOY = registerItem("rosegold_alloy",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item BRASIUM_ALLOY = registerItem("brasium_alloy",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item ECHOCHALCUM = registerItem("echochalcum",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));

    public static final Item AMETHYST_LENS = registerItem("amethyst_lens",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item REDSTONE_AGITATOR = registerItem("redstone_agitator",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item THERMAL_BLAZE_CORE = registerItem("thermal_blaze_core",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item CONDUCTIVE_STONE_PLATE = registerItem("conductive_stone_plate",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item NETHER_CORE = registerItem("nether_core",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));

    public static final Item SHROOMLEATHER = registerItem("shroomleather",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item DRIED_SHROOMLEATHER = registerItem("dried_shroomleather",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item TREATED_SHROOMLEATHER = registerItem("treated_shroomleather",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item TREATED_LEATHER = registerItem("treated_leather",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item TREATED_LEATHER_STRAP = registerItem("treated_leather_strap",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));

    public static final Item TOTEM_OF_KNOWLEDGE = registerItem("totem_of_knowledge",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));
    public static final Item TOTEM_OF_PACIFISM = registerItem("totem_of_pacifism",
            new SLModItem(new FabricItemSettings().maxCount(64).group(WHItemGroups.WH_MISCELLANEOUS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }
    public static void registerItems() {
    }
}
