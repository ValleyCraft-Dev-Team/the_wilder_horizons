package net.linkle.wilder_horizons.util;

import java.util.function.Predicate;

import net.linkle.wilder_horizons.init.core_inits.WHNature;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;

/** Block Predicates */
public enum PlantGroundPredicates implements Predicate<BlockState> {
    DIRT(state -> state.isIn(BlockTags.DIRT) || state.isOf(Blocks.FARMLAND)),
    SAND(state -> state.isIn(BlockTags.SAND)),
    TERRACOTTA(state -> state.isIn(BlockTags.TERRACOTTA)),
    STONE(state -> state.isIn(BlockTags.BASE_STONE_OVERWORLD)),
    ENDSTONE(state -> state.isOf(Blocks.END_STONE)),
    ARID_DESERT_CROP(state -> state.isOf(Blocks.PACKED_MUD) || state.isOf(Blocks.GRAVEL) || state.isOf(Blocks.SAND) || state.isOf(Blocks.RED_SAND) || state.isOf(WHNature.SANDY_GRAVEL.asBlock()) || state.isOf(WHNature.SHELL_GRAVEL.asBlock()) || state.isOf(Blocks.COARSE_DIRT) || state.isOf(WHNature.DRY_DIRT.asBlock())),
    END_PLANTS(state -> state.isOf(Blocks.END_STONE)),
    ARID_DESERT_PLANT(state -> state.isIn(BlockTags.DEAD_BUSH_MAY_PLACE_ON));


    private final Predicate<BlockState> predicate;
    
    PlantGroundPredicates(Predicate<BlockState> predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean test(BlockState state) {
        return predicate.test(state);
    }
}
