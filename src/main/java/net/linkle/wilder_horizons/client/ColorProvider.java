package net.linkle.wilder_horizons.client;

import java.util.stream.Stream;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.linkle.wilder_horizons.init.init_core.init_core.WHBlocks;
import net.linkle.wilder_horizons.init.init_core.init_core.WHNature;
import net.linkle.wilder_horizons.util.BlockConvertible;
import net.minecraft.block.Block;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.item.ItemConvertible;

@Environment(EnvType.CLIENT)
@SuppressWarnings("unused")
class ColorProvider {

    static void initialize() {
        BlockColorProvider blockProvider;
        ItemColorProvider itemProvider;
        
        blockColor((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) return -1;
            return BiomeColors.getGrassColor(world, pos);
        }, WHNature.SHORT_GRASS);
        
        blockColor((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) return -1;
            return BiomeColors.getWaterColor(world, pos);
        }, WHBlocks.LEVELED_RAIN_COLLECTOR);
        
        /*
        blockColor((state, world, pos, tintIndex) -> {
            int i = state.get(StemBlock.AGE);
            int j = i * 32;
            int k = 255 - i * 8;
            int l = i * 4;
            return j << 16 | k << 8 | l;
        }, ModNaturalBlocks.GHOST_PUMPKIN_STEM); */
        
        blockColor((state, view, pos, tintIndex) -> tintIndex == 0 ? BiomeColors.getFoliageColor(view, pos) : -1, WHNature.APPLE_LEAVES);
        itemColor((stack, tintIndex) -> tintIndex == 0 ? 4764952 : -1, WHNature.APPLE_LEAVES);
        blockColor((state, view, pos, tintIndex) -> tintIndex == 0 ? BiomeColors.getFoliageColor(view, pos) : -1, WHNature.APPLE_LEAVES_EMPTY);
        itemColor((stack, tintIndex) -> tintIndex == 0 ? 4764952 : -1, WHNature.APPLE_LEAVES_EMPTY);
        blockColor((state, view, pos, tintIndex) -> tintIndex == 0 ? BiomeColors.getFoliageColor(view, pos) : -1, WHNature.BUSH);
        itemColor((stack, tintIndex) -> tintIndex == 0 ? 4764952 : -1, WHNature.BUSH);
        blockColor((state, view, pos, tintIndex) -> tintIndex == 0 ? BiomeColors.getFoliageColor(view, pos) : -1, WHNature.LARGE_BUSH);
        itemColor((stack, tintIndex) -> tintIndex == 0 ? 4764952 : -1, WHNature.LARGE_BUSH);
        
        itemColor((stack, tintIndex) -> tintIndex == 0 ? GrassColors.getColor(0.5, 1.0) : -1, WHNature.SHORT_GRASS);
    }
    
    private static void blockColor(BlockColorProvider provider, BlockConvertible... blocks) {
        blockColor(provider, Stream.of(blocks).map(BlockConvertible::asBlock).toArray(Block[]::new));
    }
    
    private static void blockColor(BlockColorProvider provider, Block... blocks) {
        ColorProviderRegistry.BLOCK.register(provider, blocks);
    }
    
    private static void itemColor(ItemColorProvider provider, ItemConvertible... items) {
        ColorProviderRegistry.ITEM.register(provider, items);
    }
}
