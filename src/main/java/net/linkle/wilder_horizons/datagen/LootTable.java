package net.linkle.wilder_horizons.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.linkle.wilder_horizons.init.init_core.WHBlocks;
import net.minecraft.block.Blocks;

public class LootTable extends FabricBlockLootTableProvider {
    protected LootTable(FabricDataGenerator generator) {
        super(generator);
    }

    @Override
    protected void generateBlockLootTables() {
        slabDrops(WHBlocks.ANDESITE_BRICK_SLAB.block);
        slabDrops(WHBlocks.APPLE_SLAB.block);
        slabDrops(WHBlocks.CANVAS_SLAB.block);
        slabDrops(WHBlocks.CARMINE_SLAB.block);
        slabDrops(WHBlocks.CARMINE_BRICK_SLAB.block);
        slabDrops(WHBlocks.CARMINE_COBBLESTONE_SLAB.block);
        slabDrops(WHBlocks.CARMINE_SMOOTH_SLAB.block);
        slabDrops(WHBlocks.COBBLED_SHALE_SLAB.block);
        slabDrops(WHBlocks.COBBLESTONE_BRICK_SLAB.block);
        slabDrops(WHBlocks.CRACKED_SANDSTONE_BRICK_SLAB.block);
        slabDrops(WHBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB.block);
        slabDrops(WHBlocks.DAUB_SLAB.block);
        slabDrops(WHBlocks.DIORITE_BRICK_SLAB.block);
        slabDrops(WHBlocks.DRIPSTONE_BRICK_SLAB.block);
        slabDrops(WHBlocks.DRIPSTONE_MOSAIC_SLAB.block);
        slabDrops(WHBlocks.DRIPSTONE_TILE_SLAB.block);
        slabDrops(WHBlocks.GOLD_LEAF_MAPLE_SLAB.block);
        slabDrops(WHBlocks.GRANITE_BRICK_SLAB.block);
        slabDrops(WHBlocks.IRON_CUT_SLAB.block);
        slabDrops(WHBlocks.IRON_PLATE_SLAB.block);
        slabDrops(WHBlocks.MARBLE_BRICK_SLAB.block);
        slabDrops(WHBlocks.MOSAIC_BRICK_SLAB.block);
        slabDrops(WHBlocks.MARBLE_SLAB.block);
        slabDrops(WHBlocks.MOSSY_COBBLESTONE_BRICK_SLAB.block);
        slabDrops(WHBlocks.MOSSY_DRIPSTONE_BRICK_SLAB.block);
        slabDrops(WHBlocks.MOSSY_SANDSTONE_BRICK_SLAB.block);
        slabDrops(WHBlocks.MOSSY_RED_SANDSTONE_BRICK_SLAB.block);
        slabDrops(WHBlocks.PACKED_MUD_SLAB.block);
        slabDrops(WHBlocks.PACKED_SNOW_SLAB.block);
        slabDrops(WHBlocks.PACKED_SNOW_POLISHED_SLAB.block);
        slabDrops(WHBlocks.PACKED_SNOW_BRICKS_SMALL_SLAB.block);
    }
}
