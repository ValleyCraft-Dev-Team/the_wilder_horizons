package net.linkle.wilder_horizons.block;

import net.linkle.wilder_horizons.init.core_inits.WHNature;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.KelpPlantBlock;

public class OrangeKelpPlantBlock extends KelpPlantBlock {

    public OrangeKelpPlantBlock() {
        super(Settings.copy(Blocks.KELP_PLANT));
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) WHNature.ORANGE_KELP.block;
    }

}