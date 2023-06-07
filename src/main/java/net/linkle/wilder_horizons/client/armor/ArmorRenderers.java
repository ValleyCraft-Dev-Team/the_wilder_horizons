package net.linkle.wilder_horizons.client.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.linkle.wilder_horizons.client.armor.renderer.CowPokeHatRenderer;
import net.linkle.wilder_horizons.client.armor.renderer.StrawHatRenderer;
import net.linkle.wilder_horizons.init.init_core.init_core.WHArmors;
import net.minecraft.item.ItemConvertible;

/** Armor Renderers */
@Environment(EnvType.CLIENT)
public class ArmorRenderers {
    
    public static void initialize() {
        register(new StrawHatRenderer(), WHArmors.STRAW_HAT);
        register(new CowPokeHatRenderer(), WHArmors.COWPOKE_HAT);
    }
    
    private static void register(ArmorRenderer renderer, ItemConvertible... items) {
        ArmorRenderer.register(renderer, items);
    }
}
