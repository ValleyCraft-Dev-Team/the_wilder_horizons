package net.linkle.wilder_horizons.init.init_core;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.enums.ItemEnum;
import net.linkle.wilder_horizons.init.init_exterior.WHGroups;
import net.linkle.wilder_horizons.item.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

import static net.linkle.wilder_horizons.init.init_exterior.WHGroups.WH_RELICS;


public enum WHMiscItems implements ItemEnum {

    OAK_SEED(new AliasedBlockItem(WHNature.OAK_SEED.block, settings().group(WHGroups.WH_NATURE))),
    APPLE_SEED(new AliasedBlockItem(WHNature.APPLE_SEED.block, settings().group(WHGroups.WH_NATURE))),
    DARK_OAK_SEED(new AliasedBlockItem(WHNature.DARK_OAK_SEED.block, settings().group(WHGroups.WH_NATURE))),
    GOLD_LEAF_MAPLE_SEED(new AliasedBlockItem(WHNature.GOLD_LEAF_MAPLE_SEED.block, settings().group(WHGroups.WH_NATURE))),
    SPRUCE_SEED(new AliasedBlockItem(WHNature.SPRUCE_SEED.block, settings().group(WHGroups.WH_NATURE))),
    BIRCH_SEED(new AliasedBlockItem(WHNature.BIRCH_SEED.block, settings().group(WHGroups.WH_NATURE))),
    WARM_BIRCH_SEED(new AliasedBlockItem(WHNature.WARM_BIRCH_SEED.block, settings().group(WHGroups.WH_NATURE))),
    ACACIA_SEED(new AliasedBlockItem(WHNature.ACACIA_SEED.block, settings().group(WHGroups.WH_NATURE))),
    JUNGLE_SEED(new AliasedBlockItem(WHNature.JUNGLE_SEED.block, settings().group(WHGroups.WH_NATURE))),

    AMETHYSTLE_SEEDS(new AliasedBlockItem(WHNature.AMETHYSTLES.block, settings().group(WHGroups.WH_NATURE))),
    VIBRANTHIA_SEED_BULBS(new AliasedBlockItem(WHNature.ANCIENT_FLOWERS.block, settings().group(WHGroups.WH_NATURE))),
    CAVE_ROOT_SEEDS(new AliasedBlockItem(WHNature.CAVE_ROOT_CROP.block, settings().group(WHGroups.WH_NATURE))),
    FIRE_PEPPER_SEEDS(new AliasedBlockItem(WHNature.FIRE_PEPPERS.block, settings().group(WHGroups.WH_NATURE))),
    ONION_SEEDS(new AliasedBlockItem(WHNature.ONIONS.block, settings().group(WHGroups.WH_NATURE))),
    PUFF_BALL_SEEDS(new AliasedBlockItem(WHNature.PUFF_BALL.block, settings().group(WHGroups.WH_NATURE))),
    RICE_SEEDLINGS(new AliasedBlockItem(WHNature.RICES.block, settings().group(WHGroups.WH_NATURE))),

    FLOUR(new AlphaModItem(settings().group(WHGroups.WH_FOOD))),
    MAIZE_FLOUR(new AlphaModItem(settings().group(WHGroups.WH_FOOD))),

    PLANT_FIBER(new AlphaModItem(settings())),
    PLANT_FIBER_STRING(new AlphaModItem(settings())),
    PLANT_FIBER_CANVAS(new AlphaModItem(settings())),
    ROPE(new RopeItem(settings())),
    ARROW_FLETCHING(new AlphaModItem(settings())),
    ARROW_BUNDLE(new AlphaModItem(settings())),
    BOMB_BAG(new AlphaModItem(relicSettings())),

    PUFF_BALL(new AlphaModItem(settings())),
    CLOTH(new AlphaModItem(settings())),
    SALVAGED_CHAINMAIL(new AlphaModItem(settings())),
    PILLOW(new AlphaModItem(settings())),

    PLANK_ITEM(new AlphaModItem(settings())),
    WOODEN_DOWEL(new AlphaModItem(settings())),
    HANDLE(new AlphaModItem(settings())),
    REINFORCED_HANDLE(new AlphaModItem(settings())),
    //SPECIALIZED_HANDLE(new AlphaModItem(settings())),
    CRAFTING_TOOLS(new AlphaModItem(settings())),
    SMITHING_TOOLS(new AlphaModItem(settings())),
    GEM_CUTTING_TOOLS(new AlphaModItem(settings())),
    PRISMARINE_HANDLE(new AlphaModItem(settings())),

    DAUB(new AlphaModItem(settings())),

    SMALL_BONE(new AlphaModItem(settings())),
    WISH_BONE(new AlphaModItem(settings().rarity(Rarity.RARE))),
    //HOGLIN_TUSK(new AlphaModItem(settings().rarity(Rarity.UNCOMMON))),
    DRAGON_TOOTH(new AlphaModItem(settings().rarity(Rarity.UNCOMMON))),
    SKULL_SHARD(new AlphaModItem(settings())),
    //GIANTS_TOOTH(new AlphaModItem(settings())),

    SMALL_WITHER_BONE(new AlphaModItem(settings())),
    WITHER_BONE(new AlphaModItem(settings())),
    WITHER_SKULL_SHARD(new AlphaModItem(settings())),
    JELLY_BLOB(new AlphaModItem(settings())),
    SLIME_SPORE(new SummonerItem(()->Items.SLIME_SPAWN_EGG, settings().rarity(Rarity.UNCOMMON))),
    //PINK_SLIME_BALL(new AlphaModItem(settings())),
    GLOW_BALL(new GlowBallItem(settings().group(WHGroups.WH_TOOLS))),

    OVER_SNAIL_SHELL(new AlphaModItem(settings())),
    CAVE_SNAIL_SHELL(new AlphaModItem(settings())),
    CROW_FEATHER(new AlphaModItem(settings())),
    SEAGULL_FEATHER(new AlphaModItem(settings())),
    DUCK_FEATHER(new AlphaModItem(settings())),
    IRON_FEATHER(new AlphaModItem(relicSettings().rarity(Rarity.UNCOMMON))),
    //GUARDIAN_SPIKE(new AlphaModItem(settings())),
    ELDER_GUARDIAN_SPIKE(new AlphaModItem(relicSettings().rarity(Rarity.UNCOMMON))),
    PIG_HIDE(new AlphaModItem(settings())),
    HIDE(new AlphaModItem(settings())),
    //ROTTEN_LEATHER(new AlphaModItem(settings())),
    //BEETLE_CARAPACE(new AlphaModItem(settings().rarity(Rarity.UNCOMMON))),

    BEAST_CLAW(new AlphaModItem(settings())),
    BONEFIN_SKELETON(new AlphaModItem(settings())),
    //SOUL_GEM(new LifeGemItem(settings())),
    SOUL_POWDER(new LifeGemItem(settings().rarity(Rarity.UNCOMMON))),
    CRACKING_SOUL_GEM(new LifeGemItem(settings().rarity(Rarity.UNCOMMON))),
    SOUL_GEM(new LifeGemItem(settings().rarity(Rarity.RARE))),
    //GOLEM_SOUL_GEM(new LifeGemItem(settings().rarity(Rarity.RARE))),
    SOUL_OF_AN_ELDER_GUARDIAN(new LifeGemItem(settings().rarity(Rarity.EPIC))),
    SOUL_OF_A_WARDEN(new LifeGemItem(settings().rarity(Rarity.EPIC))),
    SOUL_OF_A_WITHER(new LifeGemItem(settings().rarity(Rarity.EPIC))),
    SOUL_OF_AN_ENDER_DRAGON(new LifeGemItem(settings().rarity(Rarity.EPIC))),
    //SOUL_OF_A_LICH(new LifeGemItem(settings().rarity(Rarity.EPIC))),

    //STRONG_SOUL_GEM(new AlphaModItem(settings())),
    BOBBING_LURE(new AlphaModItem(settings())),
    COPPER_FISHING_HOOK(new AlphaModItem(settings())),
    LUCKY_HOOK(new AlphaModItem(relicSettings().maxCount(1).rarity(Rarity.UNCOMMON))),
    //BAITED_LUCKY_HOOK(new AlphaModItem(settings().maxCount(1).rarity(Rarity.UNCOMMON))),

    GEODE_CORE_CRACKED(new AlphaModItem(settings())),
    GEODE_CORE_ENRICHED(new AlphaModItem(settings())),
    BRIMSTONE_CRYSTAL_ITEM(new AlphaModItem(settings())),
    SALT(new AlphaModItem(settings())),
    SALTPETER(new AlphaModItem(settings())),
    CHARCOAL_NUGGET(new AlphaModItem(settings())),
    COAL_NUGGET(new AlphaModItem(settings())),
    ANTHRACITE_NUGGET(new AlphaModItem(settings())),
    ANTHRACITE(new AlphaModItem(settings())),
    RAW_COPPER_NUGGET(new AlphaModItem(settings())),
    COPPER_NUGGET(new AlphaModItem(settings())),
    COPPER_SCRAP(new AlphaModItem(settings())),
    RAW_GOLD_NUGGET(new AlphaModItem(settings())),
    GOLD_SCRAP(new AlphaModItem(settings())),
    RAW_IRON_NUGGET(new AlphaModItem(settings())),
    IRON_SCRAP(new AlphaModItem(settings())),
    BRASIUM_INGOT(new AlphaModItem(settings())),
    BRASIUM_SCRAP(new AlphaModItem(settings())),
    BRASIUM_NUGGET(new AlphaModItem(settings())),
    RAW_BRASIUM(new AlphaModItem(settings())),

    //ROSEGOLD_ALLOY = registerItem("rosegold_alloy",
    //        new AlphaModItem(settings())),
    //BRASIUM_ALLOY(new AlphaModItem(settings())),
    BRASIUM_COIN(new AlphaModItem(settings().rarity(Rarity.RARE))),
    COPPER_COIN(new AlphaModItem(settings().rarity(Rarity.UNCOMMON))),
    PILVER_COIN(new AlphaModItem(settings().rarity(Rarity.COMMON))),
    //DRIPSTONE_COIN(new AlphaModItem(settings().rarity(Rarity.RARE))),

    ROUGH_EMERALD(new AlphaModItem(settings().recipeRemainder(GEM_CUTTING_TOOLS.asItem()))),
    //ENCHANTED_EMERALD(new EnchantedEmeraldItem(settings().rarity(Rarity.UNCOMMON))),
    ROUGH_DIAMOND(new AlphaModItem(settings().recipeRemainder(GEM_CUTTING_TOOLS.asItem()))),
    //DIAMOND_FRAGMENTS(new AlphaModItem(settings())),
    ECHOCHALCUM_INGOT(new AlphaModItem(settings())),
    RAW_NETHERITE_NUGGET(new AlphaModItem(settings())),
    FLINT_ARROWHEAD(new AlphaModItem(settings())),
    OBSIDIAN_ARROWHEAD(new AlphaModItem(settings())),

    SEED_BAG(new AlphaModItem(relicSettings().rarity(Rarity.UNCOMMON))),
    SPOOL_OF_PLANT_FIBER_STRING(new AlphaModItem(settings())),
    SPOOL_OF_STRING(new AlphaModItem(settings())),
    SPOOL_OF_BOW_STRING(new AlphaModItem(settings())),

    BOTTLE_OF_GHAST_TEARS(new AlphaModItem(relicSettings().rarity(Rarity.UNCOMMON))),
    //BOTTLE_OF_LIVING_SLIME(new AlphaModItem(settings().rarity(Rarity.EPIC))),
    BOTTLE_OF_ALLAY(new SummonerItem(()->Items.ALLAY_SPAWN_EGG, relicSettings().rarity(Rarity.EPIC))),
    WITCH_SCROLL_CAT(new SummonerItem(()->Items.CAT_SPAWN_EGG, relicSettings().rarity(Rarity.EPIC))),
    SCROLL_CHICKEN(new SummonerItem(()->Items.CHICKEN_SPAWN_EGG, relicSettings().rarity(Rarity.EPIC))),
    EVOKER_SCROLL_VEX(new SummonerItem(()->Items.VEX_SPAWN_EGG, relicSettings().rarity(Rarity.EPIC))),
    BOTTLE_OF_INK(new AlphaModItem(settings())),
    QUILL(new AlphaModItem(settings())),
    EMPTY_BOOK(new AlphaModItem(settings())),
    //RUNECASTING_QUILL(new AlphaModItem(settings())),
    BOOK_OF_RUNECALLING(new AlphaModItem(settings().rarity(Rarity.RARE).fireproof())),

    BOW_STRING(new AlphaModItem(settings())),
    TRIGGER_MECHANISM(new AlphaModItem(settings())),
    IRON_RAIL(new AlphaModItem(settings())),

    AMETHYST_LENS(new AlphaModItem(settings())),
    REDSTONE_AGITATOR(new AlphaModItem(settings())),
    THERMAL_BLAZE_CORE(new AlphaModItem(settings())),
    CONDUCTIVE_STONE_PLATE(new AlphaModItem(settings())),
    //NETHER_CORE(new AlphaModItem(settings())),

    SHROOMLEATHER(new AlphaModItem(settings())),
    //DRIED_SHROOMLEATHER(new AlphaModItem(settings())),
    //TREATED_LEATHER = registerItem("treated_leather",
    //        new AlphaModItem(settings())),
    TREATED_LEATHER_STRAP(new AlphaModItem(settings())),

    //TOTEM_OF_KNOWLEDGE(new AlphaModItem(settings().rarity(Rarity.UNCOMMON))),
    //TOTEM_OF_PEACE(new AlphaModItem(settings().rarity(Rarity.UNCOMMON))),

    PUPKIN_SPAWN_EGG(new SpawnEggItem(WHEntities.PUPKIN.type(), 0xe38a1d, 0x603607, settings().rarity(Rarity.EPIC))),
    DAIRY_COW_SPAWN_EGG(new SpawnEggItem(WHEntities.DAIRY_COW.type(), 0xf2f2f2, 0x202020, settings().rarity(Rarity.EPIC))),
    DUCK_SPAWN_EGG(new SpawnEggItem(WHEntities.DUCK.type(), 0x553100, 0x405821, settings().rarity(Rarity.EPIC))),
    CHICKEN_SPAWN_EGG(new SpawnEggItem(WHEntities.CHICKEN.type(), 0xf5deab, 0xfd1010, settings().rarity(Rarity.EPIC))),
    MOSSY_SHEEP_SPAWN_EGG(new SpawnEggItem(WHEntities.MOSSY_SHEEP.type(), 0x71872f, 0x6a5227, settings().rarity(Rarity.EPIC))),
    COLLIE_SPAWN_EGG(new SpawnEggItem(WHEntities.COLLIE.type(), 0x18181c, 0xe6e6e6, settings().rarity(Rarity.EPIC))),
    RETRIEVER_SPAWN_EGG(new SpawnEggItem(WHEntities.RETRIEVER.type(), 0xe6d081, 0xb38650, settings().rarity(Rarity.EPIC))),
    //BROWN_BEAR_SPAWN_EGG(new SpawnEggItem(WHEntities.BROWN_BEAR.type(), 0x492f17, 0x301e0e, settings().rarity(Rarity.EPIC))),
    SNAIL_SPAWN_EGG(new SpawnEggItem(WHEntities.SNAIL.type(), 0x8c7461, 0xd9a757, settings().rarity(Rarity.EPIC))),
    CAVE_SNAIL_SPAWN_EGG(new SpawnEggItem(WHEntities.CAVE_SNAIL.type(), 0x836356, 0x6b4e4b, settings().rarity(Rarity.EPIC))),
    BONEFIN_SPAWN_EGG(new SpawnEggItem(WHEntities.BONEFIN.type(), 0xe8e6d8, 0x999173, settings().rarity(Rarity.EPIC))),
    STONEROLLER_MINNOW_SPAWN_EGG(new SpawnEggItem(WHEntities.STONEROLLER_MINNOW.type(), 0x70a39b, 0xcccccc, settings().rarity(Rarity.EPIC))),
    ABYSSWATCHER_SPAWN_EGG(new SpawnEggItem(WHEntities.ABYSSWATCHER.type(), 0x08505e, 0x2dedf7, settings().rarity(Rarity.EPIC))),
    SARDINE_SPAWN_EGG(new SpawnEggItem(WHEntities.SARDINE.type(), 0x2e4359, 0xa1b2cc, settings().rarity(Rarity.EPIC))),
    PERCH_SPAWN_EGG(new SpawnEggItem(WHEntities.PERCH.type(), 0xb58a1f, 0x523500, settings().rarity(Rarity.EPIC))),
    RED_PORGY(new SpawnEggItem(WHEntities.RED_PORGY.type(), 0xf689ac, 0xe6dadd, settings().rarity(Rarity.EPIC))),
    GOLDFISH_SPAWN_EGG(new SpawnEggItem(WHEntities.GOLDFISH.type(), 0xeccb45, 0xb36619, settings().rarity(Rarity.EPIC))),
    GUARDIAN_SENTRY_SPAWN_EGG(new SpawnEggItem(WHEntities.GUARDIAN_SENTRY.type(), 0x6b7284, 0x3d5ee3, settings().rarity(Rarity.EPIC))),
    CROW_SPAWN_EGG(new SpawnEggItem(WHEntities.CROW.type(), 0x090d12, 0x27272e, settings().rarity(Rarity.EPIC))),
    SEAGULL_SPAWN_EGG(new SpawnEggItem(WHEntities.SEAGULL.type(), 0xe9eaea, 0x4d5155, settings().rarity(Rarity.EPIC))),
    ZOMBIFIED_PIG_SPAWN_EGG(new SpawnEggItem(WHEntities.ZOMBIFIED_PIG.type(), 0xea9a99, 0x5c6b28, settings().rarity(Rarity.EPIC))),
    CAVE_SLIME_SPAWN_EGG(new SpawnEggItem(WHEntities.CAVE_SLIME.type(), 0x494a4c, 0x322d36, settings().rarity(Rarity.EPIC))),

    SLUDGE_BUCKET(new BucketItem(WHFluids.SLUDGE_STILL.fluid, settings().maxCount(1).recipeRemainder(Items.BUCKET)));



    private static FabricItemSettings settings() {
        return new FabricItemSettings().group(WHGroups.WH_MISCELLANEOUS);
    }

    private static FabricItemSettings relicSettings() {
        return new FabricItemSettings().group(WH_RELICS);
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
