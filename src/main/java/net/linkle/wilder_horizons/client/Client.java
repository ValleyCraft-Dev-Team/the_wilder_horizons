package net.linkle.wilder_horizons.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        RenderLayers.initialize();
    }
}
