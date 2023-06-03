package net.linkle.wilder_horizons.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.linkle.wilder_horizons.util.BlockConvertible;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.registry.Registry;

import java.util.HashSet;

@Environment(EnvType.CLIENT)
public class RenderLayers {
    @SuppressWarnings("unused")
    static void initialize() {
        // Only use cullout if the block's texture contains empty pixels (fully transparent).
        var cullout = RenderLayer.getCutout();
        // Only use translucent if the block's texture contains translucent pixels.
        var translucent = RenderLayer.getTranslucent();
    }

    private static final HashSet<Block> BLOCKS = new HashSet<>(1000);


    private static void put(BlockConvertible block, RenderLayer layer) {
        put(block.asBlock(), layer);
    }

    private static void put(Block block, RenderLayer layer) {
        // To developers, please remove the block that has registered twice or more.
        if (!BLOCKS.add(block)) {
            var id = Registry.BLOCK.getId(block);
        }

        BlockRenderLayerMap.INSTANCE.putBlock(block, layer);
    }
}
