package net.linkle.wilder_horizons.block.sapling;

import net.linkle.wilder_horizons.environment.gen.feature.TreeConfigs;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class AppleSaplingGen extends SaplingGenerator {
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return TreeConfigs.APPLE_TREE.getEntry();
    }
}
