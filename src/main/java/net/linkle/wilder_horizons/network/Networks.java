package net.linkle.wilder_horizons.network;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.util.IdProvider;
import net.minecraft.util.Identifier;

import java.util.Locale;

public enum Networks implements IdProvider {
    
    FLOATING_ITEM;
    
    public final Identifier id;
    private Networks() {
        id = Main.makeId(name().toLowerCase(Locale.ROOT));
    }
    @Override
    public Identifier getId() {
        return id;
    }
}
