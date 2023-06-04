package net.linkle.wilder_horizons.gen.feature;

import net.linkle.wilder_horizons.util.IdProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;

/** The configured feature interface. */
public interface ConfigFeature extends IdProvider {
    ConfiguredFeature<?, ?> getConfig();
    RegistryEntry<ConfiguredFeature<?, ?>> getEntry();
}
