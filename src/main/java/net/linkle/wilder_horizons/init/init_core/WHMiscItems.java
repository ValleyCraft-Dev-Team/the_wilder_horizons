package net.linkle.wilder_horizons.init.init_core;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.enums.ItemEnum;
import net.linkle.wilder_horizons.init.init_exterior.WHGroups;
import net.linkle.wilder_horizons.item.*;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

import static net.linkle.wilder_horizons.init.init_core.WHTools.GEM_CUTTING_TOOLS;

public enum WHMiscItems implements ItemEnum {

    ROPE(new RopeItem(settings().group(WHGroups.WH_BLOCKS))),
    OAK_SEED(new AliasedBlockItem(WHNature.OAK_SEED.block, settings().group(WHGroups.WH_NATURE))),
    APPLE_SEED(new AliasedBlockItem(WHNature.OAK_SEED.block, settings().group(WHGroups.WH_NATURE))),
    DARK_OAK_SEED(new AliasedBlockItem(WHNature.OAK_SEED.block, settings().group(WHGroups.WH_NATURE))),
    GOLD_LEAF_MAPLE_SEED(new AliasedBlockItem(WHNature.OAK_SEED.block, settings().group(WHGroups.WH_NATURE))),
    SPRUCE_SEED(new AliasedBlockItem(WHNature.OAK_SEED.block, settings().group(WHGroups.WH_NATURE))),
    BIRCH_SEED(new AliasedBlockItem(WHNature.OAK_SEED.block, settings().group(WHGroups.WH_NATURE))),
    WARM_BIRCH_SEED(new AliasedBlockItem(WHNature.OAK_SEED.block, settings().group(WHGroups.WH_NATURE))),
    ACACIA_SEED(new AliasedBlockItem(WHNature.OAK_SEED.block, settings().group(WHGroups.WH_NATURE))),
    JUNGLE_SEED(new AliasedBlockItem(WHNature.OAK_SEED.block, settings().group(WHGroups.WH_NATURE))),

    AMETHYSTLE_SEEDS(new AliasedBlockItem(WHNature.AMETHYSTLES.block, settings().group(WHGroups.WH_NATURE))),
    VIBRANTHIA_SEED_BULBS(new AliasedBlockItem(WHNature.ANCIENT_FLOWERS.block, settings().group(WHGroups.WH_NATURE))),
    CAVE_ROOT_SEEDS(new AliasedBlockItem(WHNature.CAVE_ROOT_CROP.block, settings().group(WHGroups.WH_NATURE))),
    FIRE_PEPPER_SEEDS(new AliasedBlockItem(WHNature.FIRE_PEPPERS.block, settings().group(WHGroups.WH_NATURE))),
    ONION_SEEDS(new AliasedBlockItem(WHNature.CAVE_ROOT_CROP.block, settings().group(WHGroups.WH_NATURE))),
    PUFF_BALL_SEEDS(new AliasedBlockItem(WHNature.PUFF_BALL.block, settings().group(WHGroups.WH_NATURE))),
    RICE_SEEDLINGS(new AliasedBlockItem(WHNature.RICES.block, settings().group(WHGroups.WH_NATURE))),

    FLOUR(new AlphaModItem(settings().group(WHGroups.WH_FOOD))),
    MAIZE_FLOUR(new AlphaModItem(settings().group(WHGroups.WH_FOOD))),

    PLANT_FIBER(new AlphaModItem(settings())),
    PLANT_FIBER_STRING(new AlphaModItem(settings())),
    PLANT_FIBER_CANVAS(new AlphaModItem(settings())),
    ARROW_FLETCHING(new AlphaModItem(settings())),

    PUFF_BALL(new AlphaModItem(settings())),
    CLOTH(new AlphaModItem(settings())),

    PLANK_ITEM(new AlphaModItem(settings())),
    WOODEN_DOWEL(new AlphaModItem(settings())),
    HANDLE(new AlphaModItem(settings())),
    REINFORCED_HANDLE(new AlphaModItem(settings())),
    SPECIALIZED_HANDLE(new AlphaModItem(settings())),
    CRAFTING_TOOLS(new AlphaModItem(settings())),
    SMITHING_TOOLS(new AlphaModItem(settings())),

    DAUB(new AlphaModItem(settings())),

    SMALL_BONE(new AlphaModItem(settings())),
    DRAGON_TOOTH(new AlphaModItem(settings())),
    SKULL_SHARD(new AlphaModItem(settings())),
    SMALL_WITHER_BONE(new AlphaModItem(settings())),
    WITHER_BONE(new AlphaModItem(settings())),
    WITHER_SKULL_SHARD(new AlphaModItem(settings())),
    JELLY_BLOB(new AlphaModItem(settings())),
    SLIME_SPORE(new AlphaModItem(settings())),
    GLOW_BALL(new GlowBallItem(settings().group(WHGroups.WH_TOOLS))),

    OVER_SNAIL_SHELL(new AlphaModItem(settings())),
    CAVE_SNAIL_SHELL(new AlphaModItem(settings())),
    CROW_FEATHER(new AlphaModItem(settings())),
    SEAGULL_FEATHER(new AlphaModItem(settings())),
    DUCK_FEATHER(new AlphaModItem(settings())),
    IRON_FEATHER(new AlphaModItem(settings())),
    GUARDIAN_SPIKE(new AlphaModItem(settings())),
    ELDER_GUARDIAN_SPIKE(new AlphaModItem(settings())),
    PIG_HIDE(new AlphaModItem(settings())),
    SHEEPSKIN(new AlphaModItem(settings())),
    ROTTEN_LEATHER(new AlphaModItem(settings())),

    CLAY_JAR(new ClayJarItemEmpty(settings().maxCount(8))),
    WATER_FILLED_CLAY_JAR(new ClayJarItemWater(settings().maxCount(8), 0,0)),
    PURIFIED_WATER_FILLED_CLAY_JAR(new ClayJarItemPurifiedWater(settings().maxCount(8), 0,0)),

    BEAST_CLAW(new AlphaModItem(settings())),
    BONEFIN_SKELETON(new AlphaModItem(settings())),
    LIFE_GEM(new AlphaModItem(settings())),
    LUCKY_HOOK(new AlphaModItem(settings().maxCount(1))),

    GEODE_CORE_CRACKED(new AlphaModItem(settings())),
    GEODE_CORE_ENRICHED(new AlphaModItem(settings())),
    BRIMSTONE_CRYSTAL_ITEM(new AlphaModItem(settings())),
    SALT(new AlphaModItem(settings())),
    SALTPETER(new AlphaModItem(settings())),
    CHARCOAL_NUGGET(new AlphaModItem(settings())),
    COAL_NUGGET(new AlphaModItem(settings())),
    ANTHRACITE_NUGGET(new AlphaModItem(settings())),
    ANTHRACITE(new AlphaModItem(settings())),
    COPPER_NUGGET(new AlphaModItem(settings())),
    COPPER_SCRAP(new AlphaModItem(settings())),
    GOLD_SCRAP(new AlphaModItem(settings())),
    IRON_SCRAP(new AlphaModItem(settings())),
    BRASIUM_INGOT(new AlphaModItem(settings())),
    BRASIUM_NUGGET(new AlphaModItem(settings())),
    BRASIUM_SCRAP(new AlphaModItem(settings())),
    //ROSEGOLD_ALLOY = registerItem("rosegold_alloy",
    //        new AlphaModItem(settings())),
    BRASIUM_ALLOY(new AlphaModItem(settings())),
    ROUGH_EMERALD(new AlphaModItem(settings().recipeRemainder(GEM_CUTTING_TOOLS.asItem()))),
    ROUGH_DIAMOND(new AlphaModItem(settings().recipeRemainder(GEM_CUTTING_TOOLS.asItem()))),
    DIAMOND_FRAGMENTS(new AlphaModItem(settings())),
    ECHOCHALCUM(new AlphaModItem(settings())),
    RAW_NETHERITE_NUGGET(new AlphaModItem(settings())),

    SEED_BAG(new AlphaModItem(settings())),
    SPOOL_OF_PLANT_FIBER_STRING(new AlphaModItem(settings())),
    SPOOL_OF_STRING(new AlphaModItem(settings())),
    SPOOL_OF_BOW_STRING(new AlphaModItem(settings())),
    ARROW_BUNDLE(new AlphaModItem(settings())),
    BOMB_BAG(new AlphaModItem(settings())),
    BOTTLE_OF_GHAST_TEARS(new AlphaModItem(settings())),
    BOTTLE_OF_LIVING_SLIME(new AlphaModItem(settings())),
    BOTTLE_OF_ALLAY(new AlphaModItem(settings())),
    BOTTLE_OF_INK(new AlphaModItem(settings())),
    QUILL(new AlphaModItem(settings())),
    RUNECASTING_QUILL(new AlphaModItem(settings())),
    BOOK_OF_RUNECALLING(new AlphaModItem(settings())),

    BOW_STRING(new AlphaModItem(settings())),
    TRIGGER_MECHANISM(new AlphaModItem(settings())),
    IRON_RAIL(new AlphaModItem(settings())),

    AMETHYST_LENS(new AlphaModItem(settings())),
    REDSTONE_AGITATOR(new AlphaModItem(settings())),
    THERMAL_BLAZE_CORE(new AlphaModItem(settings())),
    CONDUCTIVE_STONE_PLATE(new AlphaModItem(settings())),
    NETHER_CORE(new AlphaModItem(settings())),

    SHROOMLEATHER(new AlphaModItem(settings())),
    DRIED_SHROOMLEATHER(new AlphaModItem(settings())),
    //TREATED_LEATHER = registerItem("treated_leather",
    //        new AlphaModItem(settings())),
    TREATED_LEATHER_STRAP(new AlphaModItem(settings())),

    TOTEM_OF_KNOWLEDGE(new AlphaModItem(settings())),
    TOTEM_OF_PACIFISM(new AlphaModItem(settings())),

    SLUDGE_BUCKET(new BucketItem(WHFluids.SLUDGE_STILL.fluid, settings().maxCount(1).recipeRemainder(Items.BUCKET)));
    
    private static FabricItemSettings settings() {
        return new FabricItemSettings().group(WHGroups.WH_MISCELLANEOUS);
    }
    
    public static void registerItems() {
    }

    // ### Enum Codes ###

    public final Item item;
    public final Identifier id;

    WHMiscItems(Item item) {
        this.id = Main.makeId(name().toLowerCase(Locale.ROOT));
        this.item = Registry.register(Registry.ITEM, id, item);
    }

    @Override
    public Item asItem() {
        return item;
    }

    @Override
    public Identifier getId() {
        return id;
    }
}
