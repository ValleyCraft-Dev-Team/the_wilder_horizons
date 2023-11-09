package net.linkle.wilder_horizons.client.entity.renderer;

import net.linkle.wilder_horizons.Main;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.SlimeEntityRenderer;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.util.Identifier;

public class SlimeRenderer extends SlimeEntityRenderer {
    private final Identifier texture;

    public SlimeRenderer(EntityRendererFactory.Context context, Identifier texture) {
        super(context);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture(SlimeEntity entity) {
        return texture;
    }

    /** @param texture file name of the slime texture. */
    public static EntityRendererFactory<SlimeEntity> create(String texture) {
        var id = Main.makeId("textures/entity/slimes/" + texture + ".png");
        return context -> new SlimeRenderer(context, id);
    }
}
