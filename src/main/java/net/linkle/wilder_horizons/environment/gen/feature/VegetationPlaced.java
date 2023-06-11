package net.linkle.wilder_horizons.environment.gen.feature;

import java.util.List;
import java.util.Locale;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.init.init_core.WHNature;
import net.minecraft.block.Block;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

/** Known as {@link VegetationPlacedFeatures} */
public enum VegetationPlaced {
    PATCH_PUMPKIN(VegetationConfigs.PATCH_PUMPKIN, RarityFilterPlacementModifier.of(64), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()),
    WARM_BIRCH_PLACED(TreeConfigs.WARM_BIRCH_TREE, tree(RarityFilterPlacementModifier.of(4), WHNature.WARM_BIRCH_SAPLING.block)),
    GOLD_LEAF_MAPLE_VEGETATION(TreeConfigs.AMBER_TREE, tree(CountPlacementModifier.of(16), WHNature.GOLD_LEAF_MAPLE_SAPLING.block));
    
    public static List<PlacementModifier> tree(PlacementModifier modifier, Block block) {
        return VegetationPlacedFeatures.modifiersWithWouldSurvive(modifier, block);
    }
    
    
    // Enum
    
    public static void initialize() {
        VegetationConfigs.initialize();
    }
    
    public final RegistryEntry<PlacedFeature> entry;
    
    private VegetationPlaced(ConfigFeature config, PlacementModifier... modifiers) {
        this(config, List.of(modifiers));
    }
    
    private VegetationPlaced(ConfigFeature config, List<PlacementModifier> modifiers) {
        entry = PlacedFeatures.register(Main.toId(name().toLowerCase(Locale.ROOT)), config.getEntry(), modifiers);
    }
}
