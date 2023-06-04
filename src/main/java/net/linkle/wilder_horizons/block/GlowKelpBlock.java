package net.linkle.wilder_horizons.block;

import net.linkle.wilder_horizons.init.BlocksNatural;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.KelpBlock;

public class GlowKelpBlock extends KelpBlock {

    public GlowKelpBlock() {
        super(Settings.copy(Blocks.KELP).luminance(s -> 10).emissiveLighting((blockState, pos, view) -> true));
    }

    @Override
    protected Block getPlant() {
        return BlocksNatural.GLOW_KELP_PLANT.block;
    }

}