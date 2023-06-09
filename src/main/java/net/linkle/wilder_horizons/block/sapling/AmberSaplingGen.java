package net.linkle.wilder_horizons.block.sapling;

import net.linkle.wilder_horizons.environment.gen.feature.TreeConfigs;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class AmberSaplingGen extends LargeTreeSaplingGenerator {

    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random) {
        return TreeConfigs.AMBER_TREE.getEntry();
    }

    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random var1, boolean var2) {
        return null;
    }
    
}
