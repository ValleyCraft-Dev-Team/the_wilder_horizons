package net.linkle.wilder_horizons.init.init_exterior;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalBiomeTags;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.enums.BlockEnum;
import net.linkle.wilder_horizons.init.init_core.WHNature;
import net.linkle.wilder_horizons.tags.ModBlockTags;
import net.linkle.wilder_horizons.util.MoreBiomeSelectors;
import net.linkle.wilder_horizons.util.Reg;
import net.minecraft.block.BlockState;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

import java.util.List;
import java.util.stream.Stream;

public class GensModded {

    /** Currently disabled in {@link Main} */
    public static void initialize() {
        plants();
        blobs();
    }

    private static void plants() {
        RegistryEntry<PlacedFeature> placed;
        RegistryEntry<ConfiguredFeature<?, ?>> config;
        List<PlacementModifier> list;
        var vegetal = GenerationStep.Feature.VEGETAL_DECORATION;
        
        placed = registerPlant(createConfig("black_dahlia", 60, WHNature.BLACK_DAHLIA), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.FLOWER_FORESTS), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("flowering_cactus", 60, WHNature.FLOWERING_CACTUS), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.tag(ConventionalBiomeTags.DESERT), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("thorny_bush", 60, WHNature.THORNY_BUSH), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.tag(ConventionalBiomeTags.BADLANDS), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("fluffy_dandelion", 60, WHNature.FLUFFY_DANDELION), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.FOREST, ConventionalBiomeTags.PLAINS), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("foxtail_fern", 60, WHNature.FOXTAIL_FERN), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.TAIGA), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("jungle_bush", 60, WHNature.JUNGLE_BUSH), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.JUNGLE), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("clover", 60, WHNature.CLOVER), 20);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("honeycluster", 60, WHNature.HONEYCLUSTER), 20);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("lavender", 60, WHNature.LAVENDER, WHNature.TALL_LAVENDER), 20);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST, BiomeKeys.MANGROVE_SWAMP), vegetal, placed.getKey().get());
    
        placed = registerPlant(createConfig("mossweed", 60, WHNature.MOSS_SPROUTLET), 20);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("orange_beauty", 60, WHNature.ORANGE_BEAUTY), 20);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("tulips_forests", 60, WHNature.BLACK_TULIP, WHNature.LIGHT_BLUE_TULIP, WHNature.PURPLE_TULIP, WHNature.YELLOW_TULIP), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.FLOWER_FORESTS), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("tulips_plains", 60, WHNature.BLACK_TULIP, WHNature.LIGHT_BLUE_TULIP, WHNature.PURPLE_TULIP, WHNature.YELLOW_TULIP), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.PLAINS), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("bracken_fern", 60, WHNature.BIG_FERN), 20);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("lily_of_the_mountains", 60, WHNature.LILY_OF_THE_MOUNTAINS), 20);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.MOUNTAIN), vegetal, placed.getKey().get());

        placed = registerPlant(createConfig("lily_of_the_oceans", 60, WHNature.LILY_OF_THE_OCEANS), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.OCEAN, ConventionalBiomeTags.BEACH), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("knapweed_forest", 60, WHNature.KNAPWEED), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.FOREST, ConventionalBiomeTags.FLOWER_FORESTS), vegetal, placed.getKey().get());

        placed = registerPlant(createConfig("poppy_forest", 60, WHNature.ORANGE_POPPY, WHNature.YELLOW_POPPY, WHNature.WHITE_POPPY), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.FOREST, ConventionalBiomeTags.FLOWER_FORESTS), vegetal, placed.getKey().get());
    
        placed = registerPlant(createConfig("poppy_plain", 60, WHNature.ORANGE_POPPY, WHNature.YELLOW_POPPY, WHNature.WHITE_POPPY), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.PLAINS), vegetal, placed.getKey().get());
    
        placed = registerPlant(createConfig("lush_creosote_bush", 60, WHNature.LUSH_BUSH), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.SAVANNA, ConventionalBiomeTags.BADLANDS), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("lush_creosote_bush_tall", 60, WHNature.TALL_LIVING_BUSH), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.SAVANNA, ConventionalBiomeTags.BADLANDS), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("lush_creosote_bush_tall", 60, WHNature.TALL_LIVING_BUSH), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.SAVANNA, ConventionalBiomeTags.BADLANDS), vegetal, placed.getKey().get());
    
        placed = registerPlant(createConfig("tall_cornflower", 60, WHNature.TALL_CORNFLOWER), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.FOREST, ConventionalBiomeTags.FLOWER_FORESTS, ConventionalBiomeTags.PLAINS), vegetal, placed.getKey().get());
    
        placed = registerPlant(createConfig("tall_oxeye_daisy", 60, WHNature.TALL_OXEYE_DAISY), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.FOREST, ConventionalBiomeTags.FLOWER_FORESTS, ConventionalBiomeTags.PLAINS), vegetal, placed.getKey().get());
    
        placed = registerPlant(createConfig("tall_allium", 60, WHNature.TALL_ALLIUM), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.FLOWER_FORESTS), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("snowflower", 60, WHNature.SNOWFLOWER), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.SNOWY, ConventionalBiomeTags.SNOWY_PLAINS), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("meadow_flowers", 60, WHNature.MEADOW_FLOWERS), 20);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW, BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST), vegetal, placed.getKey().get());
    
        placed = registerPlant(createConfig("wild_herbs", 60, WHNature.WILD_HERBS), 20);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("wild_rice", 60, WHNature.WILD_RICE), 20);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("wild_spicy_pepper", 60, WHNature.WILD_FIRE_PEPPER), 20);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("wild_onion", 60, WHNature.WILD_ONION), 20);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FOREST), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("wild_onion", 60, WHNature.WILD_ONION), 20);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FOREST), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("wild_wheat", 60, WHNature.WILD_WHEAT), 20);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.PLAINS), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("wild_miners_lettuce", 60, WHNature.WILD_MINERS_LETTUCE), 20);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_BIRCH_FOREST, BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA), vegetal, placed.getKey().get());
    
        placed = registerPlant(createConfig("wild_beet", 60, WHNature.WILD_BEET), 20);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("wild_carrot", 60, WHNature.WILD_CARROT), 20);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("wild_potato", 60, WHNature.WILD_POTATO), 20);
        BiomeModifications.addFeature(MoreBiomeSelectors.includeByTag(ConventionalBiomeTags.MOUNTAIN), vegetal, placed.getKey().get());
	}
	
	public static final RuleTest BASE_STONE_OVERWORLD = OreConfiguredFeatures.BASE_STONE_OVERWORLD;
	public static final RuleTest DIRT_STONE = new TagMatchRuleTest(ModBlockTags.DIRT_STONE);
    public static final RuleTest STONE_ORE_REPLACEABLES = OreConfiguredFeatures.STONE_ORE_REPLACEABLES;
    public static final RuleTest DEEPSLATE_ORE_REPLACEABLES = OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES;
    public static final RuleTest NETHERRACK = OreConfiguredFeatures.NETHERRACK;
    public static final RuleTest BASE_STONE_NETHER = OreConfiguredFeatures.BASE_STONE_NETHER;
	
	private static void blobs() {
	    RegistryEntry<PlacedFeature> placed;
        RegistryEntry<ConfiguredFeature<?, ?>> config;
        List<PlacementModifier> list;
        var ores = GenerationStep.Feature.UNDERGROUND_ORES;
        
        //config = createOreConfig("primsteel_rich_dirt", BASE_STONE_OVERWORLD, 33, BlocksNatural.IRON_RICH_DIRT.getState());
        //placed = registerOre(config, modifiersWithCount(14, HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.getTop())));
        //BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), ores, placed.getKey().get());
        
        config = createOreConfig("arid_dirt", DIRT_STONE, 33, WHNature.DRY_DIRT.getState());
        placed = registerOre(config, modifiersWithCount(5, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.getTop())));
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld().and(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_DRY).negate()), ores, placed.getKey().get());
        
        config = createOreConfig("arid_dirt", DIRT_STONE, 33, WHNature.DRY_DIRT.getState());
        placed = registerOre(config, modifiersWithCount(5, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.getTop())));
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld().and(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_DRY).negate()), ores, placed.getKey().get());
	}
	
	/** Create a random patch feature config. */
    public static RegistryEntry<ConfiguredFeature<?, ?>> createConfig(String id, int tries, BlockEnum... blocks) {
        return createConfig(id, tries, Stream.of(blocks).map(BlockEnum::getState).toArray(BlockState[]::new));
    }
    
    /** Create a random patch feature config. */
    public static RegistryEntry<ConfiguredFeature<?, ?>> createConfig(String id, int tries, BlockState... blocks) {
        SimpleBlockFeatureConfig config;
        if (blocks.length > 1) {
            var data = new DataPool.Builder<BlockState>();
            for (var block : blocks) {
                data.add(block, 1);
            }
            config = new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(data));
        } else {
            config = new SimpleBlockFeatureConfig(BlockStateProvider.of(blocks[0]));
        }
        var entry = PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, config);
        var configured = ConfiguredFeatures.createRandomPatchFeatureConfig(tries, entry);
        return Reg.register(id, Feature.RANDOM_PATCH, configured);
    }
    
    public static RegistryEntry<PlacedFeature> registerPlant(RegistryEntry<ConfiguredFeature<?, ?>> config, int rarity) {
        return registerPlant(config.getKey().get().getValue().getPath(), config, rarity);
    }
    
    public static RegistryEntry<PlacedFeature> registerPlant(String id, RegistryEntry<ConfiguredFeature<?, ?>> config, int rarity) {
        return Reg.register(id, config, RarityFilterPlacementModifier.of(rarity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    }
    
    /** Create a ore feature config. */
    public static RegistryEntry<ConfiguredFeature<?, ?>> createOreConfig(String id, RuleTest test, int size, BlockState state) {
        return createOreConfig(id, test, size, 0, state);
    }
    
    /** Create a ore feature config.
     * @param DOAC discardOnAirChance */
    public static RegistryEntry<ConfiguredFeature<?, ?>> createOreConfig(String id, RuleTest test, int size, float DOAC, BlockState state) {
        var config = new OreFeatureConfig(test, state, size, DOAC);
        return Reg.register(id, Feature.ORE, config);
    }
    
    public static RegistryEntry<PlacedFeature> registerOre(RegistryEntry<ConfiguredFeature<?, ?>> config, List<PlacementModifier> mods) {
        return registerOre(config.getKey().get().getValue().getPath(), config, mods);
    }
    
    public static RegistryEntry<PlacedFeature> registerOre(String id, RegistryEntry<ConfiguredFeature<?, ?>> config, List<PlacementModifier> mods) {
        return Reg.register(id, config, mods);
    }
    
    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
