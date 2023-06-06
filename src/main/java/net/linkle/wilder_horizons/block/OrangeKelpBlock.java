package net.linkle.wilder_horizons.block;

import net.linkle.wilder_horizons.init.core_inits.WHNature;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.KelpBlock;

public class OrangeKelpBlock extends KelpBlock {

    public OrangeKelpBlock() {
        super(Settings.copy(Blocks.KELP));
    }

    @Override
    protected Block getPlant() {
        return WHNature.ORANGE_KELP_PLANT.block;
    }

}