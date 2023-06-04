package net.linkle.wilder_horizons.block;

public interface RopeBlockExt {
    boolean isVertical();
    default boolean isHorizontal() {
        return !isVertical();
    }
}
