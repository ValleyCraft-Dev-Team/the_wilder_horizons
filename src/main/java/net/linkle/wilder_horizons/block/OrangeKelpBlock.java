package net.linkle.wilder_horizons.block;

import net.linkle.wilder_horizons.init.BlocksNatural;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.KelpBlock;

public class OrangeKelpBlock extends KelpBlock {

    public OrangeKelpBlock() {
        super(Settings.copy(Blocks.KELP));
    }

    @Override
    protected Block getPlant() {
        return BlocksNatural.ORANGE_KELP_PLANT.block;
    }

}