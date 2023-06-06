package net.linkle.wilder_horizons.network;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.util.IdProvider;
import net.minecraft.util.Identifier;

public enum Networks implements IdProvider {
    
    FLOATING_ITEM;
    
    public final Identifier id;
    private Networks() {
        id = Main.makeId(name().toLowerCase());
    }
    @Override
    public Identifier getId() {
        return id;
    }
}
