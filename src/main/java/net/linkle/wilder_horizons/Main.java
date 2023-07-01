package net.linkle.wilder_horizons;

import net.linkle.wilder_horizons.environment.gen.feature.TreeConfigs;
import net.linkle.wilder_horizons.environment.gen.feature.VegetationConfigs;
import net.linkle.wilder_horizons.environment.gen.feature.VegetationPlaced;
import net.linkle.wilder_horizons.environment.sounds.WHSounds;
import net.linkle.wilder_horizons.init.init_core.*;
import net.linkle.wilder_horizons.init.init_exterior.WHBlockEntities;
import net.linkle.wilder_horizons.init.init_exterior.WHParticles;
import net.linkle.wilder_horizons.villager.ModVillagers;
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
        WHEntities.initialize();
        WHMiscItems.registerItems();
        WHFishItems.initialize();
        WHFoodIngredients.initialize();
        WHFoods.initialize();
        WHMedicines.registerItems();
        WHFoodsSpecial.initialize();
        WHTools.initialize();
        WHArmors.initialize();
        WHParticles.initialize();
        WHFluids.initialize();
        WHNature.initialize();
        WHBlocks.initialize();
        ModVillagers.registerVillagers();
        WHEntities.initialize();
        WHSounds.initialize();
        TreeConfigs.initialize();
        VegetationPlaced.initialize();
    }

    public static Identifier makeId(String id) {
        return new Identifier(ID, id);
    }

    public static String toId(String id) {
        return ID + ':' + id;
    }
}
