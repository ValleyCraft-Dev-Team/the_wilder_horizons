package net.linkle.wilder_horizons.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.linkle.wilder_horizons.init.init_core.WHBlocks;

import static net.linkle.wilder_horizons.init.init_core.WHBlocks.*;
import static net.linkle.wilder_horizons.init.init_core.WHNature.*;

public class LootTable extends FabricBlockLootTableProvider {
    protected LootTable(FabricDataGenerator generator) {
        super(generator);
    }

    @Override
    protected void generateBlockLootTables() {
        addDrop(ANDESITE_BRICK_SLAB.block, slabDrops(ANDESITE_BRICK_SLAB.block));
        addDrop(APPLE_SLAB.block, slabDrops(APPLE_SLAB.block));
        addDrop(CANVAS_SLAB.block, slabDrops(CANVAS_SLAB.block));
        addDrop(CARMINE_SLAB.block, slabDrops(CARMINE_SLAB.block));
        addDrop(THATCH_SLAB.block, slabDrops(THATCH_SLAB.block));
        addDrop(WEAVED_THATCH_SLAB.block, slabDrops(WEAVED_THATCH_SLAB.block));
        addDrop(TIGHTLY_WEAVED_THATCH_SLAB.block, slabDrops(TIGHTLY_WEAVED_THATCH_SLAB.block));
        addDrop(CARMINE_BRICK_SLAB.block, slabDrops(CARMINE_BRICK_SLAB.block));
        addDrop(CARMINE_COBBLESTONE_SLAB.block, slabDrops(CARMINE_COBBLESTONE_SLAB.block));
        addDrop(CARMINE_SMOOTH_SLAB.block, slabDrops(CARMINE_SMOOTH_SLAB.block));
        addDrop(COBBLED_SHALE_SLAB.block, slabDrops(COBBLED_SHALE_SLAB.block));
        addDrop(COBBLESTONE_BRICK_SLAB.block, slabDrops(COBBLESTONE_BRICK_SLAB.block));
        addDrop(CRACKED_SANDSTONE_BRICK_SLAB.block, slabDrops(CRACKED_SANDSTONE_BRICK_SLAB.block));
        addDrop(CRACKED_RED_SANDSTONE_BRICK_SLAB.block, slabDrops(CRACKED_RED_SANDSTONE_BRICK_SLAB.block));
        addDrop(DAUB_SLAB.block, slabDrops(DAUB_SLAB.block));
        addDrop(DIORITE_BRICK_SLAB.block, slabDrops(DIORITE_BRICK_SLAB.block));
        addDrop(DRIPSTONE_BRICK_SLAB.block, slabDrops(DRIPSTONE_BRICK_SLAB.block));
        addDrop(DRIPSTONE_MOSAIC_SLAB.block, slabDrops(DRIPSTONE_MOSAIC_SLAB.block));
        addDrop(DRIPSTONE_TILE_SLAB.block, slabDrops(DRIPSTONE_TILE_SLAB.block));
        addDrop(GOLD_LEAF_MAPLE_SLAB.block, slabDrops(GOLD_LEAF_MAPLE_SLAB.block));
        addDrop(GRANITE_BRICK_SLAB.block, slabDrops(GRANITE_BRICK_SLAB.block));
        addDrop(IRON_CUT_SLAB.block, slabDrops(IRON_CUT_SLAB.block));
        addDrop(IRON_PLATE_SLAB.block, slabDrops(IRON_PLATE_SLAB.block));
        addDrop(MARBLE_BRICK_SLAB.block, slabDrops(MARBLE_BRICK_SLAB.block));
        addDrop(MOSAIC_BRICK_SLAB.block, slabDrops(MOSAIC_BRICK_SLAB.block));
        addDrop(MARBLE_SLAB.block, slabDrops(MARBLE_SLAB.block));
        addDrop(MOSSY_COBBLESTONE_BRICK_SLAB.block, slabDrops(MOSSY_COBBLESTONE_BRICK_SLAB.block));
        addDrop(MOSSY_DRIPSTONE_BRICK_SLAB.block, slabDrops(MOSSY_DRIPSTONE_BRICK_SLAB.block));
        addDrop(MOSSY_SANDSTONE_BRICK_SLAB.block, slabDrops(MOSSY_SANDSTONE_BRICK_SLAB.block));
        addDrop(MOSSY_RED_SANDSTONE_BRICK_SLAB.block, slabDrops(MOSSY_RED_SANDSTONE_BRICK_SLAB.block));
        addDrop(PACKED_MUD_SLAB.block, slabDrops(PACKED_MUD_SLAB.block));
        addDrop(PACKED_SNOW_SLAB.block, slabDrops(PACKED_SNOW_SLAB.block));
        addDrop(PACKED_SNOW_POLISHED_SLAB.block, slabDrops(PACKED_SNOW_POLISHED_SLAB.block));
        addDrop(PACKED_SNOW_BRICKS_SMALL_SLAB.block, slabDrops(PACKED_SNOW_BRICKS_SMALL_SLAB.block));
        addDrop(SHALE_SLAB.block, slabDrops(SHALE_SLAB.block));
        addDrop(POLISHED_SHALE_SLAB.block, slabDrops(POLISHED_SHALE_SLAB.block));
        addDrop(SHALE_BRICK_SLAB.block, slabDrops(SHALE_BRICK_SLAB.block));
        addDrop(POLISHED_MARBLE_SLAB.block, slabDrops(POLISHED_MARBLE_SLAB.block));
        addDrop(SERPENTINITE_SLAB.block, slabDrops(SERPENTINITE_SLAB.block));
        addDrop(SERPENTINITE_SMOOTH_SLAB.block, slabDrops(SERPENTINITE_SMOOTH_SLAB.block));
        addDrop(SERPENTINITE_BRICK_SLAB.block, slabDrops(SERPENTINITE_BRICK_SLAB.block));
        addDrop(PACKED_SNOW_BRICKS_LARGE_SLAB.block, slabDrops(PACKED_SNOW_BRICKS_LARGE_SLAB.block));
        addDrop(POLISHED_PRISMARINE_SLAB.block, slabDrops(POLISHED_PRISMARINE_SLAB.block));
        addDrop(POLISHED_DRIPSTONE_SLAB.block, slabDrops(POLISHED_DRIPSTONE_SLAB.block));
        addDrop(PATTERNED_DRIPSTONE_SLAB.block, slabDrops(PATTERNED_DRIPSTONE_SLAB.block));
        addDrop(POLISHED_SALT_BLOCK_SLAB.block, slabDrops(POLISHED_SALT_BLOCK_SLAB.block));
        addDrop(SALT_BRICK_SLAB.block, slabDrops(SALT_BRICK_SLAB.block));
        addDrop(POLISHED_BASALT_SLAB.block, slabDrops(POLISHED_BASALT_SLAB.block));
        addDrop(POLISHED_BASALT_BRICK_SLAB.block, slabDrops(POLISHED_BASALT_BRICK_SLAB.block));
        addDrop(POLISHED_BASALT_PATTERNED_SLAB.block, slabDrops(POLISHED_BASALT_PATTERNED_SLAB.block));
        addDrop(ROUGH_SANDSTONE_SLAB.block, slabDrops(ROUGH_SANDSTONE_SLAB.block));
        addDrop(ROUGH_RED_SANDSTONE_SLAB.block, slabDrops(ROUGH_RED_SANDSTONE_SLAB.block));
        addDrop(STRATIFIED_SANDSTONE_SLAB.block, slabDrops(STRATIFIED_SANDSTONE_SLAB.block));
        addDrop(STRATIFIED_RED_SANDSTONE_SLAB.block, slabDrops(STRATIFIED_RED_SANDSTONE_SLAB.block));
        addDrop(SANDSTONE_BRICK_SLAB.block, slabDrops(SANDSTONE_BRICK_SLAB.block));
        addDrop(RED_SANDSTONE_BRICK_SLAB.block, slabDrops(RED_SANDSTONE_BRICK_SLAB.block));
        addDrop(POLISHED_PACKED_MUD_SLAB.block, slabDrops(POLISHED_PACKED_MUD_SLAB.block));
        addDrop(SMOOTH_BRICK_SLAB.block, slabDrops(SMOOTH_BRICK_SLAB.block));
        addDrop(STONE_TILE_SLAB.block, slabDrops(STONE_TILE_SLAB.block));
        addDrop(POLISHED_STONE_SLAB.block, slabDrops(POLISHED_STONE_SLAB.block));
        addDrop(SMOOTH_STONE_TILE_SLAB.block, slabDrops(SMOOTH_STONE_TILE_SLAB.block));

        addDrop(ANDESITE_BRICK_STAIRS.block, ANDESITE_BRICK_STAIRS.block);
        addDrop(APPLE_STAIRS.block, APPLE_STAIRS.block);
        addDrop(CANVAS_STAIRS.block, CANVAS_STAIRS.block);
        addDrop(CARMINE_STAIRS.block, CARMINE_STAIRS.block);
        addDrop(THATCH_STAIRS.block, THATCH_STAIRS.block);
        addDrop(WEAVED_THATCH_STAIRS.block, WEAVED_THATCH_STAIRS.block);
        addDrop(TIGHTLY_WEAVED_THATCH_STAIRS.block, TIGHTLY_WEAVED_THATCH_STAIRS.block);
        addDrop(CARMINE_BRICK_STAIRS.block, CARMINE_BRICK_STAIRS.block);
        addDrop(CARMINE_COBBLESTONE_STAIRS.block, CARMINE_COBBLESTONE_STAIRS.block);
        addDrop(CARMINE_SMOOTH_STAIRS.block, CARMINE_SMOOTH_STAIRS.block);
        addDrop(COBBLED_SHALE_STAIRS.block, COBBLED_SHALE_STAIRS.block);
        addDrop(COBBLESTONE_BRICK_STAIRS.block, COBBLESTONE_BRICK_STAIRS.block);
        addDrop(CRACKED_SANDSTONE_BRICK_STAIRS.block, CRACKED_SANDSTONE_BRICK_STAIRS.block);
        addDrop(CRACKED_RED_SANDSTONE_BRICK_STAIRS.block, CRACKED_RED_SANDSTONE_BRICK_STAIRS.block);
        addDrop(DAUB_STAIRS.block, DAUB_STAIRS.block);
        addDrop(DIORITE_BRICK_STAIRS.block, DIORITE_BRICK_STAIRS.block);
        addDrop(DRIPSTONE_BRICK_STAIRS.block, DRIPSTONE_BRICK_STAIRS.block);
        addDrop(DRIPSTONE_MOSAIC_STAIRS.block, DRIPSTONE_MOSAIC_STAIRS.block);
        addDrop(DRIPSTONE_TILE_STAIRS.block, DRIPSTONE_TILE_STAIRS.block);
        addDrop(GOLD_LEAF_MAPLE_STAIRS.block, GOLD_LEAF_MAPLE_STAIRS.block);
        addDrop(GRANITE_BRICK_STAIRS.block, GRANITE_BRICK_STAIRS.block);
        addDrop(IRON_CUT_STAIRS.block, IRON_CUT_STAIRS.block);
        addDrop(IRON_PLATE_STAIRS.block, IRON_PLATE_STAIRS.block);
        addDrop(MARBLE_BRICK_STAIRS.block, MARBLE_BRICK_STAIRS.block);
        addDrop(MOSAIC_BRICK_STAIRS.block, MOSAIC_BRICK_STAIRS.block);
        addDrop(MARBLE_STAIRS.block, MARBLE_STAIRS.block);
        addDrop(MOSSY_COBBLESTONE_BRICK_STAIRS.block, MOSSY_COBBLESTONE_BRICK_STAIRS.block);
        addDrop(MOSSY_DRIPSTONE_BRICK_STAIRS.block, MOSSY_DRIPSTONE_BRICK_STAIRS.block);
        addDrop(MOSSY_SANDSTONE_BRICK_STAIRS.block, MOSSY_SANDSTONE_BRICK_STAIRS.block);
        addDrop(MOSSY_RED_SANDSTONE_BRICK_STAIRS.block, MOSSY_RED_SANDSTONE_BRICK_STAIRS.block);
        addDrop(PACKED_MUD_STAIRS.block, PACKED_MUD_STAIRS.block);
        addDrop(PACKED_SNOW_STAIRS.block, PACKED_SNOW_STAIRS.block);
        addDrop(PACKED_SNOW_POLISHED_STAIRS.block, PACKED_SNOW_POLISHED_STAIRS.block);
        addDrop(PACKED_SNOW_BRICKS_SMALL_STAIRS.block, PACKED_SNOW_BRICKS_SMALL_STAIRS.block);
        addDrop(SHALE_STAIRS.block, SHALE_STAIRS.block);
        addDrop(POLISHED_SHALE_STAIRS.block, POLISHED_SHALE_STAIRS.block);
        addDrop(SHALE_BRICK_STAIRS.block, SHALE_BRICK_STAIRS.block);
        addDrop(POLISHED_MARBLE_STAIRS.block, POLISHED_MARBLE_STAIRS.block);
        addDrop(SERPENTINITE_STAIRS.block, SERPENTINITE_STAIRS.block);
        addDrop(SERPENTINITE_SMOOTH_STAIRS.block, SERPENTINITE_SMOOTH_STAIRS.block);
        addDrop(SERPENTINITE_BRICK_STAIRS.block, SERPENTINITE_BRICK_STAIRS.block);
        addDrop(PACKED_SNOW_BRICKS_LARGE_STAIRS.block, PACKED_SNOW_BRICKS_LARGE_STAIRS.block);
        addDrop(POLISHED_PRISMARINE_STAIRS.block, POLISHED_PRISMARINE_STAIRS.block);
        addDrop(POLISHED_DRIPSTONE_STAIRS.block, POLISHED_DRIPSTONE_STAIRS.block);
        addDrop(PATTERNED_DRIPSTONE_STAIRS.block, PATTERNED_DRIPSTONE_STAIRS.block);
        addDrop(POLISHED_SALT_BLOCK_STAIRS.block, POLISHED_SALT_BLOCK_STAIRS.block);
        addDrop(SALT_BRICK_STAIRS.block, SALT_BRICK_STAIRS.block);
        addDrop(POLISHED_BASALT_STAIRS.block, POLISHED_BASALT_STAIRS.block);
        addDrop(POLISHED_BASALT_BRICK_STAIRS.block, POLISHED_BASALT_BRICK_STAIRS.block);
        addDrop(POLISHED_BASALT_PATTERNED_STAIRS.block, POLISHED_BASALT_PATTERNED_STAIRS.block);
        addDrop(ROUGH_SANDSTONE_STAIRS.block, ROUGH_SANDSTONE_STAIRS.block);
        addDrop(ROUGH_RED_SANDSTONE_STAIRS.block, ROUGH_RED_SANDSTONE_STAIRS.block);
        addDrop(STRATIFIED_SANDSTONE_STAIRS.block, STRATIFIED_SANDSTONE_STAIRS.block);
        addDrop(STRATIFIED_RED_SANDSTONE_STAIRS.block, STRATIFIED_RED_SANDSTONE_STAIRS.block);
        addDrop(SANDSTONE_BRICK_STAIRS.block, SANDSTONE_BRICK_STAIRS.block);
        addDrop(RED_SANDSTONE_BRICK_STAIRS.block, RED_SANDSTONE_BRICK_STAIRS.block);
        addDrop(POLISHED_PACKED_MUD_STAIRS.block, POLISHED_PACKED_MUD_STAIRS.block);
        addDrop(SMOOTH_BRICK_STAIRS.block, SMOOTH_BRICK_STAIRS.block);
        addDrop(STONE_TILE_STAIRS.block, STONE_TILE_STAIRS.block);
        addDrop(POLISHED_STONE_STAIRS.block, POLISHED_STONE_STAIRS.block);
        addDrop(SMOOTH_STONE_TILE_STAIRS.block, SMOOTH_STONE_TILE_STAIRS.block);

        addDrop(ANDESITE_BRICK_WALL.block, ANDESITE_BRICK_WALL.block);
        addDrop(CARMINE_WALL.block, CARMINE_WALL.block);
        addDrop(CARMINE_BRICK_WALL.block, CARMINE_BRICK_WALL.block);
        addDrop(CARMINE_COBBLESTONE_WALL.block, CARMINE_COBBLESTONE_WALL.block);
        addDrop(CARMINE_SMOOTH_WALL.block, CARMINE_SMOOTH_WALL.block);
        addDrop(COBBLED_SHALE_WALL.block, COBBLED_SHALE_WALL.block);
        addDrop(COBBLESTONE_BRICK_WALL.block, COBBLESTONE_BRICK_WALL.block);
        addDrop(CRACKED_SANDSTONE_BRICK_WALL.block, CRACKED_SANDSTONE_BRICK_WALL.block);
        addDrop(CRACKED_RED_SANDSTONE_BRICK_WALL.block, CRACKED_RED_SANDSTONE_BRICK_WALL.block);
        addDrop(DAUB_WALL.block, DAUB_WALL.block);
        addDrop(DIORITE_BRICK_WALL.block, DIORITE_BRICK_WALL.block);
        addDrop(DRIPSTONE_BRICK_WALL.block, DRIPSTONE_BRICK_WALL.block);
        addDrop(DRIPSTONE_TILE_WALL.block, DRIPSTONE_TILE_WALL.block);
        addDrop(GRANITE_BRICK_WALL.block, GRANITE_BRICK_WALL.block);
        addDrop(MARBLE_BRICK_WALL.block, MARBLE_BRICK_WALL.block);
        addDrop(MARBLE_WALL.block, MARBLE_WALL.block);
        addDrop(MOSSY_COBBLESTONE_BRICK_WALL.block, MOSSY_COBBLESTONE_BRICK_WALL.block);
        addDrop(MOSSY_DRIPSTONE_BRICK_WALL.block, MOSSY_DRIPSTONE_BRICK_WALL.block);
        addDrop(MOSSY_SANDSTONE_BRICK_WALL.block, MOSSY_SANDSTONE_BRICK_WALL.block);
        addDrop(MOSSY_RED_SANDSTONE_BRICK_WALL.block, MOSSY_RED_SANDSTONE_BRICK_WALL.block);
        addDrop(PACKED_MUD_WALL.block, PACKED_MUD_WALL.block);
        addDrop(PACKED_SNOW_WALL.block, PACKED_SNOW_WALL.block);
        addDrop(PACKED_SNOW_POLISHED_WALL.block, PACKED_SNOW_POLISHED_WALL.block);
        addDrop(PACKED_SNOW_BRICKS_SMALL_WALL.block, PACKED_SNOW_BRICKS_SMALL_WALL.block);
        addDrop(SHALE_WALL.block, SHALE_WALL.block);
        addDrop(POLISHED_SHALE_WALL.block, POLISHED_SHALE_WALL.block);
        addDrop(SHALE_BRICK_WALL.block, SHALE_BRICK_WALL.block);
        addDrop(POLISHED_MARBLE_WALL.block, POLISHED_MARBLE_WALL.block);
        addDrop(SERPENTINITE_WALL.block, SERPENTINITE_WALL.block);
        addDrop(SERPENTINITE_SMOOTH_WALL.block, SERPENTINITE_SMOOTH_WALL.block);
        addDrop(SERPENTINITE_BRICK_WALL.block, SERPENTINITE_BRICK_WALL.block);
        addDrop(PACKED_SNOW_BRICKS_LARGE_WALL.block, PACKED_SNOW_BRICKS_LARGE_WALL.block);
        addDrop(POLISHED_PRISMARINE_WALL.block, POLISHED_PRISMARINE_WALL.block);
        addDrop(POLISHED_DRIPSTONE_WALL.block, POLISHED_DRIPSTONE_WALL.block);
        addDrop(POLISHED_SALT_BLOCK_WALL.block, POLISHED_SALT_BLOCK_WALL.block);
        addDrop(SALT_BRICK_WALL.block, SALT_BRICK_WALL.block);
        addDrop(POLISHED_BASALT_WALL.block, POLISHED_BASALT_WALL.block);
        addDrop(POLISHED_BASALT_BRICK_WALL.block, POLISHED_BASALT_BRICK_WALL.block);
        addDrop(ROUGH_SANDSTONE_WALL.block, ROUGH_SANDSTONE_WALL.block);
        addDrop(ROUGH_RED_SANDSTONE_WALL.block, ROUGH_RED_SANDSTONE_WALL.block);
        addDrop(STRATIFIED_SANDSTONE_WALL.block, STRATIFIED_SANDSTONE_WALL.block);
        addDrop(STRATIFIED_RED_SANDSTONE_WALL.block, STRATIFIED_RED_SANDSTONE_WALL.block);
        addDrop(SANDSTONE_BRICK_WALL.block, SANDSTONE_BRICK_WALL.block);
        addDrop(RED_SANDSTONE_BRICK_WALL.block, RED_SANDSTONE_BRICK_WALL.block);
        addDrop(POLISHED_PACKED_MUD_WALL.block, POLISHED_PACKED_MUD_WALL.block);
        addDrop(SMOOTH_BRICK_WALL.block, SMOOTH_BRICK_WALL.block);
        addDrop(POLISHED_STONE_WALL.block, POLISHED_STONE_WALL.block);
    }
}