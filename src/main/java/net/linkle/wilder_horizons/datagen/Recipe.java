package net.linkle.wilder_horizons.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.linkle.wilder_horizons.init.init_core.WHBlocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;

import java.util.function.Consumer;

public class Recipe extends FabricRecipeProvider {

    public Recipe(FabricDataGenerator generator) {
        super(generator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        stoneRecipes(exporter, WHBlocks.POLISHED_STONE, WHBlocks.POLISHED_STONE_STAIRS, WHBlocks.POLISHED_STONE_SLAB);
        stoneRecipes(exporter, WHBlocks.CARMINE_BRICKS, WHBlocks.CARMINE_BRICK_STAIRS, WHBlocks.CARMINE_BRICK_SLAB);
        stoneRecipes(exporter, WHBlocks.PATTERNED_DRIPSTONE, WHBlocks.PATTERNED_DRIPSTONE_STAIRS, WHBlocks.PATTERNED_DRIPSTONE_SLAB);
        stoneRecipes(exporter, WHBlocks.STONE_TILES, WHBlocks.STONE_TILE_STAIRS, WHBlocks.STONE_TILE_SLAB);
        stoneRecipes(exporter, WHBlocks.SMOOTH_STONE_TILES, WHBlocks.SMOOTH_STONE_TILE_STAIRS, WHBlocks.SMOOTH_STONE_TILE_SLAB);
    }

    protected void stoneRecipes(Consumer<RecipeJsonProvider> exporter, ItemConvertible stone, ItemConvertible stoneStairs, ItemConvertible stoneSlab) {
        var ingredient = Ingredient.ofItems(stone);

        createStairsRecipe(stoneStairs, ingredient);
        offerStonecuttingRecipe(exporter, stoneStairs, stone);

        createSlabRecipe(stoneSlab, ingredient);
        offerStonecuttingRecipe(exporter, stoneSlab, stone, 2);
    }
}
