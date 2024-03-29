package net.linkle.wilder_horizons.environment.gen.feature;

import net.linkle.wilder_horizons.Main;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.Locale;

/** Known as {@link VegetationConfiguredFeatures} */
public enum VegetationConfigs implements ConfigFeature {
    
    PATCH_PUMPKIN(Feature.RANDOM_PATCH, cratePatch(50, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, simpleBlock(Blocks.PUMPKIN), BlockPredicate.bothOf(BlockPredicate.replaceable(), BlockPredicate.matchingBlockTag(Direction.DOWN.getVector(), BlockTags.DIRT)))));
    
    public static void initialize() {}
    
    // Utilities
    
    private static RandomPatchFeatureConfig cratePatch(int tries, RegistryEntry<PlacedFeature> entry) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries, entry);
    }
    
    private static SimpleBlockFeatureConfig simpleBlock(Block block) {
        return simpleBlock(block.getDefaultState());
    }
    
    private static SimpleBlockFeatureConfig simpleBlock(BlockState state) {
        return new SimpleBlockFeatureConfig(BlockStateProvider.of(state));
    }

    // ### Enum Codes ###
    
    private final ConfiguredFeature<?, ?> config;
    private final RegistryEntry<ConfiguredFeature<?, ?>> entry;
    private final Identifier id;

    <T extends FeatureConfig> VegetationConfigs(Feature<T> feature, T config) {
        this.config = new ConfiguredFeature<>(feature, config);
        entry = BuiltinRegistries.add(BuiltinRegistries.CONFIGURED_FEATURE, id = Main.makeId(name().toLowerCase(Locale.ROOT)), this.config);
    }

    @Override
    public ConfiguredFeature<?, ?> getConfig() {
        return config;
    }

    @Override
    public RegistryEntry<ConfiguredFeature<?, ?>> getEntry() {
        return entry;
    }

    @Override
    public Identifier getId() {
        return id;
    }
}
