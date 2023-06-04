package net.linkle.wilder_horizons.util;

import net.minecraft.util.Identifier;

/** Identifier Provider Interface */
public interface IdProvider {
    Identifier getId();
    
    static IdProvider of(Identifier id) {
        return () -> id;
    }
}
