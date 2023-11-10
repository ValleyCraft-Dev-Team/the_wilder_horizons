package net.linkle.wilder_horizons.client.entity.renderer;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.entity.CrowEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.util.Identifier;

public class BirdRenderer extends ParrotRenderer<MobEntity> {

    private final Identifier texture;

    public BirdRenderer(EntityRendererFactory.Context context, Identifier texture) {
        super(context, Main.makeId("textures/entity/birds/crow.png"));
        this.texture = texture;
    }

    @Override
    public Identifier getTexture(MobEntity entity) {
        return texture;
    }

    /** @param texture file name of the bird texture. */
    public static EntityRendererFactory<MobEntity> create(String texture) {
        var id = Main.makeId("textures/entity/birds/" + texture + ".png");
        return context -> new BirdRenderer(context, id);
    }
}
