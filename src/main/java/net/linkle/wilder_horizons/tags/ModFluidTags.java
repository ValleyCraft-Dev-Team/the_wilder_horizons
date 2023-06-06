package net.linkle.wilder_horizons.tags;

import net.linkle.wilder_horizons.Main;
import net.minecraft.fluid.Fluid;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;

public class ModFluidTags {
    public static final TagKey<Fluid> SLUDGE = registerMod("sludge");

    public static void initialize() {
    }

    private static TagKey<Fluid> registerMod(String id) {
        return TagKey.of(Registry.FLUID_KEY, Main.makeId(id));
    }
}
