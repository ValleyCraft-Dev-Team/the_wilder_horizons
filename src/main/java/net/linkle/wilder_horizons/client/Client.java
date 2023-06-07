package net.linkle.wilder_horizons.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.linkle.wilder_horizons.client.armor.ArmorRenderers;
import net.linkle.wilder_horizons.client.trinket.TrinketRenderers;
import net.linkle.wilder_horizons.init.init_core.WHEntities;
import net.linkle.wilder_horizons.init.init_exterior.WHBlockEntities;
import net.linkle.wilder_horizons.init.init_exterior.WHParticles;
import net.linkle.wilder_horizons.network.ClientNetwork;
import net.linkle.wilder_horizons.util.ModModelPredicateProvider;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        RenderLayers.initialize();
        Sprites.initialize();
        ColorProvider.initialize();
        WHParticles.initializeClient();
        WHEntities.initializeClient();
        FluidRenders.initialize();
        WHBlockEntities.initializeClient();
        ArmorRenderers.initialize();
        TrinketRenderers.initialize();
        ClientNetwork.initialize();

        ModModelPredicateProvider.registerModModels();
    }
}
