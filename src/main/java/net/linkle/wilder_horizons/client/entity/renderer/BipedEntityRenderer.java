package net.linkle.wilder_horizons.client.entity.renderer;

import net.linkle.wilder_horizons.Main;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;

public class BipedEntityRenderer extends net.minecraft.client.render.entity.BipedEntityRenderer<MobEntity, BipedEntityModel<MobEntity>> {

    public static final EntityModelLayer LAYER = new EntityModelLayer(Main.makeId("biped"), "main");

    private final Identifier texture;

    public BipedEntityRenderer(EntityRendererFactory.Context ctx, Identifier texture) {
        super(ctx, new BipedEntityModel<>(ctx.getPart(LAYER)), 0.5f);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture(MobEntity mobEntity) {
        return texture;
    }

    /** @param texture file path of the entity texture. */
    public static EntityRendererFactory<MobEntity> create(String texture) {
        var id = Main.makeId("textures/entity/" + texture + ".png");
        return context -> new BipedEntityRenderer(context, id);
    }
}
