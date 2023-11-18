package net.linkle.wilder_horizons.client.entity.renderer.snails;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.client.entity.model.snails.LargeSnailEntityModel;
import net.linkle.wilder_horizons.client.entity.model.snails.SnailEntityModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;

@Environment(value=EnvType.CLIENT)
public class LargeSnailEntityRenderer extends MobEntityRenderer<MobEntity, LargeSnailEntityModel<MobEntity>> {

    private final Identifier texture;

    private LargeSnailEntityRenderer(Context context, Identifier texture) {
        super(context, new LargeSnailEntityModel<MobEntity>(context.getPart(LargeSnailEntityModel.LAYER)), 0.25f);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture(MobEntity entity) {
        return texture;
    }

    /** @param texture file name of the snail texture. */
    public static EntityRendererFactory<MobEntity> create(String texture) {
        var id = Main.makeId("textures/entity/bugs/snail/" + texture + ".png");
        return context -> new LargeSnailEntityRenderer(context, id);
    }
}
