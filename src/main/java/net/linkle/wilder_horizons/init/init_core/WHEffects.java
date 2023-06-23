package net.linkle.wilder_horizons.init.init_core;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.effect.*;
import net.linkle.wilder_horizons.util.IdProvider;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

public enum WHEffects implements IdProvider {

    CLEANSED(new Cleansed()),
    ROT_BLIGHT(new RotBlight()),
    SOUL_FADING(new SoulFading()),
    RADIANT_HEALING(new RadiantHealing());

    public static void initialize() {

    }

    // ### Enum Codes ###

    public final StatusEffect effect;
    public final Identifier id;

    WHEffects(StatusEffect effect) {
        this.id = Main.makeId(name().toLowerCase(Locale.ROOT));
        this.effect = Registry.register(Registry.STATUS_EFFECT, id, effect);
    }

    @Override
    public Identifier getId() {
        return id;
    }
}
