package net.linkle.wilder_horizons.client.entity.renderer;

import net.linkle.wilder_horizons.Main;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.GuardianEntityRenderer;
import net.minecraft.entity.mob.GuardianEntity;
import net.minecraft.util.Identifier;

public class GuardianRenderer extends GuardianEntityRenderer {

    private final Identifier texture;

    public GuardianRenderer(EntityRendererFactory.Context context, Identifier texture) {
        super(context);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture(GuardianEntity entity) {
        return texture;
    }

    /** @param texture file name of the cow texture. */
    public static EntityRendererFactory<GuardianEntity> create(String texture) {
        var id = Main.makeId("textures/entity/guardians/" + texture + ".png");
        return context -> new GuardianRenderer(context, id);
    }
}
