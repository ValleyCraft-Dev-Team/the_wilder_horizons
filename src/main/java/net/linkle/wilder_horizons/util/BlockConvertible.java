package net.linkle.wilder_horizons.util;

import net.minecraft.block.Block;

/** Represents an object that has a block form. */
public interface BlockConvertible {
    /** Gets this object in its block form. */
    Block asBlock();

    static BlockConvertible of(Block block) {
        return () -> block;
    }
}
