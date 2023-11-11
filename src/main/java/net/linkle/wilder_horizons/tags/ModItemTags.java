package net.linkle.wilder_horizons.tags;

import net.linkle.wilder_horizons.Main;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItemTags {
    public static final TagKey<Item> CORAL_KNIFE = registerC("coral_knife");
    public static final TagKey<Item> LARGE_SOULS = registerC("large_souls");
    public static final TagKey<Item> SEEDS = registerC("seeds");

    public static void initialize() {
    }

    private static TagKey<Item> registerMod(String id) {
        return TagKey.of(Registry.ITEM_KEY, Main.makeId(id));
    }
    
    private static TagKey<Item> registerC(String id) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier("c", id));
    }
}
