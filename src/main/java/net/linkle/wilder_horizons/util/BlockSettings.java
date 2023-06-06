package net.linkle.wilder_horizons.util;

import net.linkle.wilder_horizons.block.materials.BlockMats;
import net.linkle.wilder_horizons.sounds.BlockSounds;
import net.minecraft.block.AbstractBlock.Settings;

public class BlockSettings {
    public static Settings pot() {
        return Settings.of(BlockMats.POT).sounds(BlockSounds.POT.sound).nonOpaque().breakInstantly();
    }
    
    public static Settings urn() {
        return Settings.of(BlockMats.POT).sounds(BlockSounds.POT.sound).nonOpaque().strength(0.2f);
    }
}
