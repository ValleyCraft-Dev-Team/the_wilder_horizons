package net.linkle.wilder_horizons.block;

import net.linkle.wilder_horizons.init.BlocksNatural;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.KelpPlantBlock;

public class GlowKelpPlantBlock extends KelpPlantBlock {

    public GlowKelpPlantBlock() {
        super(Settings.copy(Blocks.KELP_PLANT).luminance(s -> 10).emissiveLighting((blockState, pos, view) -> true));
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) BlocksNatural.GLOW_KELP.block;
    }

}