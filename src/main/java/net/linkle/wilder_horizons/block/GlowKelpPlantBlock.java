package net.linkle.wilder_horizons.block;

import net.linkle.wilder_horizons.init.core_inits.WHNature;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.KelpPlantBlock;

public class GlowKelpPlantBlock extends KelpPlantBlock {

    public GlowKelpPlantBlock() {
        super(Settings.copy(Blocks.KELP_PLANT).luminance(s -> 10).emissiveLighting((blockState, pos, view) -> true));
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) WHNature.GLOW_KELP.block;
    }

}