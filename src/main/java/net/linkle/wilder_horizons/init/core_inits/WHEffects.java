package net.linkle.wilder_horizons.init.core_inits;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.effect.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.registry.Registry;

public class WHEffects {
    public static void initialize() {
    }

    public static StatusEffect CLEANSED = register("cleansed", new Cleansed());
    public static StatusEffect ROT_BLIGHT = register("rot_blight", new RotBlight());
    public static StatusEffect SOUL_FADING = register("soul_fading", new SoulFading());

    public static StatusEffect register(String name, StatusEffect effect) {
        return Registry.register(Registry.STATUS_EFFECT, Main.makeId(name), effect);
    }
}
