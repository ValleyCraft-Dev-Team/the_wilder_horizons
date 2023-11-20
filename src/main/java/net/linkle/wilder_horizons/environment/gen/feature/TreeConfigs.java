package net.linkle.wilder_horizons.environment.gen.feature;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.environment.gen.Trees;
import net.linkle.wilder_horizons.init.init_core.WHNature;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.Locale;

/** Known as {@link TreeConfiguredFeatures} */
public enum TreeConfigs implements ConfigFeature {

    APPLE_TREE(Trees.appleTree()),
    AMBER_TREE(Trees.amberTree()),
    WARM_BIRCH_TREE(Trees.warmBirchTree()),
    WARM_BIRCH_TREE_SUPER(Trees.warmBirchTreeSuper()),
    HUGE_PURPLE_MUSHROOM(Features.HUGE_PURPLE_MUSHROOM.feature(), new HugeMushroomFeatureConfig(BlockStateProvider.of(WHNature.PURPLE_MUSHROOM_BLOCK.block), BlockStateProvider.of(Blocks.MUSHROOM_STEM), 2));

    public static void initialize() {
        
    }



    // ### Enum Codes ###
    
    private final ConfiguredFeature<?, ?> config;
    private final RegistryEntry<ConfiguredFeature<?, ?>> entry;
    private final Identifier id;
    
    TreeConfigs(TreeFeatureConfig config) {
        this(Feature.TREE, config);
    }

    <T extends FeatureConfig> TreeConfigs(Feature<T> feature, T config) {
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
