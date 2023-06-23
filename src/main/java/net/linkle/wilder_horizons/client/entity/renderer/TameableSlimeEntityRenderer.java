package net.linkle.wilder_horizons.client.entity.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.linkle.wilder_horizons.Main;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.SlimeEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class TameableSlimeEntityRenderer extends SlimeEntityRenderer {
    private static final Identifier TEXTURE = Main.makeId("textures/entity/slimes/friendly_slime.png");

    public TameableSlimeEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

}
