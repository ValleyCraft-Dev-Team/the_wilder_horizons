package net.linkle.wilder_horizons;

import net.fabricmc.api.ModInitializer;
import net.linkle.wilder_horizons.environment.gen.feature.Features;
import net.linkle.wilder_horizons.environment.gen.feature.TreeConfigs;
import net.linkle.wilder_horizons.environment.gen.feature.VegetationPlaced;
import net.linkle.wilder_horizons.environment.sounds.WHSounds;
import net.linkle.wilder_horizons.init.init_core.*;
import net.linkle.wilder_horizons.init.init_exterior.GensModded;
import net.linkle.wilder_horizons.init.init_exterior.WHLootTables;
import net.linkle.wilder_horizons.init.init_exterior.WHParticles;
import net.linkle.wilder_horizons.tags.ModBlockTags;
import net.linkle.wilder_horizons.tags.ModItemTags;
import net.linkle.wilder_horizons.villager.CustomTradeRegistryModdedVillagers;
import net.linkle.wilder_horizons.villager.CustomTradeRegistryVanillaVillagers;
import net.linkle.wilder_horizons.villager.CustomTradeRegistryWanderingTrader;
import net.linkle.wilder_horizons.villager.ModVillagers;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
    public static final String ID = "wilder_horizons";
    public static final Logger LOGGER = LoggerFactory.getLogger(ID);

    @Override
    public void onInitialize() {
        Config.initialize();
        WHEffects.initialize();
        WHEntities.initialize();
        WHMiscItems.registerItems();
        WHMedicines.registerItems();
        WHFishItems.initialize();
        WHFoodIngredients.initialize();
        WHFoods.initialize();
        WHFoodsSpecial.initialize();
        WHTools.initialize();
        WHArmors.initialize();
        WHParticles.initialize();
        WHFluids.initialize();
        WHNature.initialize();
        WHBlocks.initialize();
        WHPotions.initialize();
        ModVillagers.registerVillagers();
        CustomTradeRegistryModdedVillagers.setupTrades();
        CustomTradeRegistryWanderingTrader.setupTrades();
        CustomTradeRegistryVanillaVillagers.setupTrades();
        WHSounds.initialize();
        Features.initialize();
        TreeConfigs.initialize();
        VegetationPlaced.initialize();
        //DungeonRemover.init();
        ModBlockTags.initialize();
        ModItemTags.initialize();
        WHLootTables.initialize();

        GensModded.initialize();
    }

    public static Identifier makeId(String id) {
        return new Identifier(ID, id);
    }

    public static String toId(String id) {
        return ID + ':' + id;
    }
}
