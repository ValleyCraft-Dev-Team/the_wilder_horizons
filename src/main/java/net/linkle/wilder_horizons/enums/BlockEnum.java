package net.linkle.wilder_horizons.enums;

import net.linkle.wilder_horizons.util.BlockConvertible;
import net.linkle.wilder_horizons.util.IdProvider;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

/** For Enum classes that contains blocks. This interface adds common methods. */
public interface BlockEnum extends BlockConvertible, IdProvider {
    /** Get block default state. */
    default BlockState getState() {
        return asBlock().getDefaultState();
    }
    /** upcast to
     * @throws ClassCastException */
    @SuppressWarnings("unchecked")
    default <T extends Block> T to(Class<T> type) {
        return (T) asBlock();
    }
}
