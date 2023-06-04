package net.linkle.wilder_horizons.util;

import net.minecraft.entity.effect.StatusEffect;

/** Status Effect Setting */
public record EffectSetting(StatusEffect effect, int amplifier) {
	public EffectSetting(StatusEffect effect) {
		this(effect, 0);
	}
}
