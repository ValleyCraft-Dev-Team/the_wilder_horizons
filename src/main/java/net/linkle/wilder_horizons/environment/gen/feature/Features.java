package net.linkle.wilder_horizons.environment.gen.feature;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.util.IdProvider;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.HugeMushroomFeatureConfig;

import java.util.Locale;

public enum Features implements IdProvider {
    HUGE_PURPLE_MUSHROOM(new HugePurpleMushroomFeature(HugeMushroomFeatureConfig.CODEC));


    // ### Enum Codes ###

    private Feature<?> feature;
    private final Identifier id;

    public static void initialize() {}

    Features(Feature<?> feature) {
        this.feature = feature;
        Registry.register(Registry.FEATURE, id = Main.makeId(name().toLowerCase(Locale.ROOT)), feature);
    }

    @SuppressWarnings("unchecked")
    public <T extends FeatureConfig> Feature<T> feature() {
        return (Feature<T>) feature;
    }

    @Override
    public Identifier getId() {
        return id;
    }
}
