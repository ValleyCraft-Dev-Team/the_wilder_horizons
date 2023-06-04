package net.linkle.wilder_horizons.block;

import net.linkle.wilder_horizons.util.BlockConvertible;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;

public class PotBlock extends FlowerPotBlock {

    public PotBlock(BlockConvertible content) {
        super(content.asBlock(), Settings.copy(Blocks.POTTED_POPPY));
    }

}
