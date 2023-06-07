package net.linkle.wilder_horizons;

import net.linkle.wilder_horizons.init.init_core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {
    public static final String ID = "wilder_horizons";
    public static final Logger LOGGER = LoggerFactory.getLogger(ID);

    @Override
    public void onInitialize() {
        Config.initialize();
        WHEffects.initialize();
        WHMiscItems.registerItems();
        WHFoodIngredients.initialize();
        WHFoods.initialize();
        WHFoodsSpecial.initialize();
        WHTools.initialize();
        WHArmors.registerItems();
        WHMedicines.registerItems();
        WHNature.initialize();
        WHBlocks.initialize();
    }

    public static Identifier makeId(String id) {
        return new Identifier(ID, id);
    }

    public static String toId(String id) {
        return ID + ':' + id;
    }
}
