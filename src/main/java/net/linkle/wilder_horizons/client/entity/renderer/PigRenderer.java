package net.linkle.wilder_horizons.client.entity.renderer;

import net.linkle.wilder_horizons.Main;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PigEntityModel;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;

public class PigRenderer extends MobEntityRenderer<MobEntity, PigEntityModel<MobEntity>> {
    private final Identifier texture;

    public PigRenderer(EntityRendererFactory.Context context, Identifier texture) {
        super(context, new PigEntityModel<>(context.getPart(EntityModelLayers.PIG)), 0.7f);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture(MobEntity entity) {
        return texture;
    }

    /** @param texture file name of the pig texture. */
    public static EntityRendererFactory<MobEntity> create(String texture) {
        var id = Main.makeId("textures/entity/pigs/" + texture + ".png");
        return context -> new PigRenderer(context, id);
    }
}
