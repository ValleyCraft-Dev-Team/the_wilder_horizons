package net.linkle.wilder_horizons.tags;

import net.linkle.wilder_horizons.Main;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;

public class ModBlockTags {
    public static final TagKey<Block> BIG_FLOWER_POTS = registerMod("big_flower_pots");
    public static final TagKey<Block> DIRT_STONE = registerMod("dirt_stone");
    public static final TagKey<Block> SCARECROWS = registerMod("scarecrows");

    public static void initialize() {
    }

    private static TagKey<Block> registerMod(String id) {
        return TagKey.of(Registry.BLOCK_KEY, Main.makeId(id));
    }
}
