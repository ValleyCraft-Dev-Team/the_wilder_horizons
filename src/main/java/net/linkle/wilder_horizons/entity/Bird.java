package net.linkle.wilder_horizons.entity;

import net.minecraft.entity.Flutterer;

public interface Bird extends Flutterer {
    float prevFlapProgress();
    float flapProgress();
    float prevMaxWingDeviation();
    float maxWingDeviation();
}
