package net.linkle.wilder_horizons.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.item.SLModItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WHFoods {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }
    public static void registerItems() {
    }
}
