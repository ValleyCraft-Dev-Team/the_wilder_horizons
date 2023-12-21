package net.linkle.wilder_horizons.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.linkle.wilder_horizons.init.init_core.WHBlocks;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;

import java.util.function.Consumer;

import static net.linkle.wilder_horizons.init.init_core.WHBlocks.*;
import static net.linkle.wilder_horizons.init.init_core.WHNature.*;

public class Recipe extends FabricRecipeProvider {

    public Recipe(FabricDataGenerator generator) {
        super(generator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {

        stoneStairsSlabWall(exporter, ANDESITE_BRICKS, ANDESITE_BRICK_STAIRS, ANDESITE_BRICK_SLAB, ANDESITE_BRICK_WALL);
        //stoneStairsSlabWall(exporter, APPLE_PLANKS, );
        //stoneStairsSlabWall(exporter, CANVAS_BLOCK, );
        stoneStairsSlabWall(exporter, CARMINE, CARMINE_STAIRS,  CARMINE_SLAB, CARMINE_WALL);
        stairsSlab(exporter, THATCH_BLOCK, THATCH_STAIRS, THATCH_SLAB);
        stairsSlab(exporter, WEAVED_THATCH_BLOCK, WEAVED_THATCH_STAIRS, WEAVED_THATCH_SLAB);
        stairsSlab(exporter, TIGHTLY_WEAVED_THATCH_BLOCK, TIGHTLY_WEAVED_THATCH_STAIRS, TIGHTLY_WEAVED_THATCH_SLAB);
        stoneStairsSlabWall(exporter, CARMINE_BRICKS, CARMINE_BRICK_STAIRS, CARMINE_BRICK_SLAB, CARMINE_BRICK_WALL);
        stoneStairsSlabWall(exporter, CARMINE_COBBLESTONE, CARMINE_COBBLESTONE_STAIRS, CARMINE_COBBLESTONE_SLAB, CARMINE_COBBLESTONE_WALL);
        stoneStairsSlabWall(exporter, CARMINE_SMOOTH, CARMINE_SMOOTH_STAIRS, CARMINE_SMOOTH_SLAB, CARMINE_SMOOTH_WALL);
        stoneStairsSlabWall(exporter, COBBLED_SHALE, COBBLED_SHALE_STAIRS, COBBLED_SHALE_SLAB, COBBLED_SHALE_WALL);
        stoneStairsSlabWall(exporter, COBBLESTONE_BRICKS, COBBLESTONE_BRICK_STAIRS, COBBLESTONE_BRICK_SLAB, COBBLESTONE_BRICK_WALL);
        stoneStairsSlabWall(exporter, CRACKED_SANDSTONE_BRICKS, CRACKED_SANDSTONE_BRICK_STAIRS, CRACKED_SANDSTONE_BRICK_SLAB, CRACKED_SANDSTONE_BRICK_WALL);
        stoneStairsSlabWall(exporter, CRACKED_RED_SANDSTONE_BRICKS, CRACKED_RED_SANDSTONE_BRICK_STAIRS, CRACKED_RED_SANDSTONE_BRICK_SLAB, CRACKED_RED_SANDSTONE_BRICK_WALL);
        stoneStairsSlabWall(exporter, BLOCK_DAUB, DAUB_STAIRS, DAUB_SLAB, DAUB_WALL);
        stoneStairsSlabWall(exporter, DIORITE_BRICKS, DIORITE_BRICK_STAIRS, DIORITE_BRICK_SLAB, DIORITE_BRICK_WALL);
        stoneStairsSlabWall(exporter, DRIPSTONE_BRICKS, DRIPSTONE_BRICK_STAIRS, DRIPSTONE_BRICK_SLAB, DRIPSTONE_BRICK_WALL);
        stoneStairsSlab(exporter, DRIPSTONE_MOSAIC, DRIPSTONE_MOSAIC_STAIRS, DRIPSTONE_MOSAIC_SLAB);
        stoneStairsSlabWall(exporter, DRIPSTONE_TILES, DRIPSTONE_TILE_STAIRS, DRIPSTONE_TILE_SLAB, DRIPSTONE_TILE_WALL);
        //stoneStairsSlabWall(exporter, GOLD_LEAF_MAPLE_PLANKS, );
        stoneStairsSlabWall(exporter, GRANITE_BRICKS, GRANITE_BRICK_STAIRS, GRANITE_BRICK_SLAB, GRANITE_BRICK_WALL);
        stairsSlab(exporter, IRON_CUT_BLOCK, IRON_CUT_STAIRS, IRON_CUT_SLAB);
        stairsSlab(exporter, IRON_PLATE_BLOCK, IRON_PLATE_STAIRS, IRON_PLATE_SLAB);
        stoneStairsSlabWall(exporter, MARBLE_BRICKS, MARBLE_BRICK_STAIRS, MARBLE_BRICK_SLAB, MARBLE_BRICK_WALL);
        stoneStairsSlab(exporter, MOSAIC_BRICK, MOSAIC_BRICK_STAIRS, MOSAIC_BRICK_SLAB);
        stoneStairsSlabWall(exporter, MARBLE, MARBLE_STAIRS, MARBLE_SLAB, MARBLE_WALL);
        stoneStairsSlabWall(exporter, MOSSY_COBBLESTONE_BRICKS, MOSSY_COBBLESTONE_BRICK_STAIRS, MOSSY_COBBLESTONE_BRICK_SLAB, MOSSY_COBBLESTONE_BRICK_WALL);
        stoneStairsSlabWall(exporter, MOSSY_DRIPSTONE_BRICKS, MOSSY_DRIPSTONE_BRICK_STAIRS, MOSSY_DRIPSTONE_BRICK_SLAB, MOSSY_DRIPSTONE_BRICK_WALL);
        stoneStairsSlabWall(exporter, MOSSY_SANDSTONE_BRICKS, MOSSY_SANDSTONE_BRICK_STAIRS, MOSSY_SANDSTONE_BRICK_SLAB, MOSSY_SANDSTONE_BRICK_WALL);
        stoneStairsSlabWall(exporter, MOSSY_RED_SANDSTONE_BRICKS, MOSSY_RED_SANDSTONE_BRICK_STAIRS, MOSSY_RED_SANDSTONE_BRICK_SLAB, MOSSY_RED_SANDSTONE_BRICK_WALL);
        //stoneStairsSlabWall(exporter, PACKED_MUD, );
        stairsSlabWall(exporter, PACKED_SNOW, PACKED_SNOW_STAIRS, PACKED_SNOW_SLAB, PACKED_SNOW_WALL);
        stairsSlabWall(exporter, PACKED_SNOW_POLISHED, PACKED_SNOW_POLISHED_STAIRS, PACKED_SNOW_POLISHED_SLAB, PACKED_SNOW_POLISHED_WALL);
        stoneStairsSlabWall(exporter, PACKED_SNOW_BRICKS_SMALL, PACKED_SNOW_BRICKS_SMALL_STAIRS, PACKED_SNOW_BRICKS_SMALL_SLAB, PACKED_SNOW_BRICKS_SMALL_WALL);
        stoneStairsSlabWall(exporter, SHALE, SHALE_STAIRS, SHALE_SLAB, SHALE_WALL);
        stoneStairsSlabWall(exporter, POLISHED_SHALE, POLISHED_SHALE_STAIRS, POLISHED_SHALE_SLAB, POLISHED_SHALE_WALL);
        stoneStairsSlabWall(exporter, SHALE_BRICKS, SHALE_BRICK_STAIRS, SHALE_BRICK_SLAB, SHALE_BRICK_WALL);
        stoneStairsSlabWall(exporter, POLISHED_MARBLE, POLISHED_MARBLE_STAIRS, POLISHED_MARBLE_SLAB, POLISHED_MARBLE_WALL);
        stoneStairsSlabWall(exporter, SERPENTINITE, SERPENTINITE_STAIRS, SERPENTINITE_SLAB, SERPENTINITE_WALL);
        stoneStairsSlabWall(exporter, SERPENTINITE_SMOOTH, SERPENTINITE_SMOOTH_STAIRS, SERPENTINITE_SMOOTH_SLAB, SERPENTINITE_SMOOTH_WALL);
        stoneStairsSlab(exporter, SERPENTINITE_BRICKS, SERPENTINITE_BRICK_STAIRS, SERPENTINITE_BRICK_SLAB);
        stairsSlabWall(exporter, PACKED_SNOW_BRICKS_LARGE, PACKED_SNOW_BRICKS_LARGE_STAIRS, PACKED_SNOW_BRICKS_LARGE_SLAB, PACKED_SNOW_BRICKS_LARGE_WALL);
        stoneStairsSlabWall(exporter, POLISHED_PRISMARINE, POLISHED_PRISMARINE_STAIRS, POLISHED_PRISMARINE_SLAB, POLISHED_PRISMARINE_WALL);
        stoneStairsSlabWall(exporter, POLISHED_DRIPSTONE, POLISHED_DRIPSTONE_STAIRS, POLISHED_DRIPSTONE_SLAB, POLISHED_DRIPSTONE_WALL);
        stoneStairsSlab(exporter, PATTERNED_DRIPSTONE, PATTERNED_DRIPSTONE_STAIRS, PATTERNED_DRIPSTONE_SLAB);
        stoneStairsSlabWall(exporter, POLISHED_SALT_BLOCK, POLISHED_SALT_BLOCK_STAIRS, POLISHED_SALT_BLOCK_SLAB, POLISHED_SALT_BLOCK_WALL);
        stoneStairsSlabWall(exporter, SALT_BRICKS, SALT_BRICK_STAIRS, SALT_BRICK_SLAB, SALT_BRICK_WALL);
        stoneStairsSlabWall(exporter, POLISHED_BASALT, POLISHED_BASALT_STAIRS, POLISHED_BASALT_SLAB, POLISHED_BASALT_WALL);
        stoneStairsSlabWall(exporter, POLISHED_BASALT_BRICKS, POLISHED_BASALT_BRICK_STAIRS, POLISHED_BASALT_BRICK_SLAB, POLISHED_BASALT_BRICK_WALL);
        stoneStairsSlab(exporter, POLISHED_BASALT_PATTERNED, POLISHED_BASALT_PATTERNED_STAIRS, POLISHED_BASALT_PATTERNED_SLAB);
        stoneStairsSlabWall(exporter, ROUGH_SANDSTONE, ROUGH_SANDSTONE_STAIRS, ROUGH_SANDSTONE_SLAB, ROUGH_SANDSTONE_WALL);
        stoneStairsSlabWall(exporter, ROUGH_RED_SANDSTONE, ROUGH_RED_SANDSTONE_STAIRS, ROUGH_RED_SANDSTONE_SLAB, ROUGH_RED_SANDSTONE_WALL);
        stoneStairsSlabWall(exporter, STRATIFIED_SANDSTONE, STRATIFIED_SANDSTONE_STAIRS, STRATIFIED_SANDSTONE_SLAB, STRATIFIED_SANDSTONE_WALL);
        stoneStairsSlabWall(exporter, STRATIFIED_RED_SANDSTONE, STRATIFIED_RED_SANDSTONE_STAIRS, STRATIFIED_RED_SANDSTONE_SLAB, STRATIFIED_RED_SANDSTONE_WALL);
        stoneStairsSlabWall(exporter, SANDSTONE_BRICKS, SANDSTONE_BRICK_STAIRS, SANDSTONE_BRICK_SLAB, SANDSTONE_BRICK_WALL);
        stoneStairsSlabWall(exporter, RED_SANDSTONE_BRICKS, RED_SANDSTONE_BRICK_STAIRS, RED_SANDSTONE_BRICK_SLAB, RED_SANDSTONE_BRICK_WALL);
        stoneStairsSlabWall(exporter, POLISHED_PACKED_MUD, POLISHED_PACKED_MUD_STAIRS, POLISHED_PACKED_MUD_SLAB, POLISHED_PACKED_MUD_WALL);
        stoneStairsSlabWall(exporter, SMOOTH_BRICK, SMOOTH_BRICK_STAIRS, SMOOTH_BRICK_SLAB, SMOOTH_BRICK_WALL);
        stoneStairsSlab(exporter, STONE_TILES, STONE_TILE_STAIRS, STONE_TILE_SLAB);
        stoneStairsSlabWall(exporter, POLISHED_STONE, POLISHED_STONE_STAIRS, POLISHED_STONE_SLAB, POLISHED_STONE_WALL);
        stoneStairsSlab(exporter, SMOOTH_STONE_TILES, SMOOTH_STONE_TILE_STAIRS, SMOOTH_STONE_TILE_SLAB);
    }

    protected void stoneStairsSlabWall(Consumer<RecipeJsonProvider> exporter, ItemConvertible stone, ItemConvertible stoneStairs, ItemConvertible stoneSlab, ItemConvertible wall) {
        createStairsRecipe(stoneStairs, Ingredient.ofItems(stone)).criterion(RecipeProvider.hasItem(stone), RecipeProvider.conditionsFromItem(stone)).offerTo(exporter);
        offerStonecuttingRecipe(exporter, stoneStairs, stone);

        offerSlabRecipe(exporter, stoneSlab, stone);
        offerStonecuttingRecipe(exporter, stoneSlab, stone, 2);

        offerWallRecipe(exporter, wall, stone);
        offerStonecuttingRecipe(exporter, wall, stone);
    }

    protected void stairsSlabWall(Consumer<RecipeJsonProvider> exporter, ItemConvertible stone, ItemConvertible stoneStairs, ItemConvertible stoneSlab, ItemConvertible wall) {
        createStairsRecipe(stoneStairs, Ingredient.ofItems(stone)).criterion(RecipeProvider.hasItem(stone), RecipeProvider.conditionsFromItem(stone)).offerTo(exporter);

        offerSlabRecipe(exporter, stoneSlab, stone);

        offerWallRecipe(exporter, wall, stone);
    }

    protected void stoneStairsSlab(Consumer<RecipeJsonProvider> exporter, ItemConvertible stone, ItemConvertible stoneStairs, ItemConvertible stoneSlab) {
        createStairsRecipe(stoneStairs, Ingredient.ofItems(stone)).criterion(RecipeProvider.hasItem(stone), RecipeProvider.conditionsFromItem(stone)).offerTo(exporter);
        offerStonecuttingRecipe(exporter, stoneStairs, stone);

        offerSlabRecipe(exporter, stoneSlab, stone);
        offerStonecuttingRecipe(exporter, stoneSlab, stone, 2);
    }

    protected void stairsSlab(Consumer<RecipeJsonProvider> exporter, ItemConvertible stone, ItemConvertible stoneStairs, ItemConvertible stoneSlab) {
        createStairsRecipe(stoneStairs, Ingredient.ofItems(stone)).criterion(RecipeProvider.hasItem(stone), RecipeProvider.conditionsFromItem(stone)).offerTo(exporter);

        offerSlabRecipe(exporter, stoneSlab, stone);
    }
}
