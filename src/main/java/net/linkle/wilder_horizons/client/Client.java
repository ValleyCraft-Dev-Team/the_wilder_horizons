package net.linkle.wilder_horizons.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.linkle.wilder_horizons.client.armor.ArmorRenderers;
import net.linkle.wilder_horizons.client.trinket.TrinketRenderers;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        RenderLayers.initialize();
        Sprites.initialize();
        ColorProvider.initialize();
        Particles.initializeClient();
        Entities.initializeClient();
        FluidRenders.initialize();
        BlockEntities.initializeClient();
        ArmorRenderers.initialize();
        TrinketRenderers.initialize();
        ClientNetwork.initialize();

        ModModelPredicateProvider.registerModModels();
    }
}
