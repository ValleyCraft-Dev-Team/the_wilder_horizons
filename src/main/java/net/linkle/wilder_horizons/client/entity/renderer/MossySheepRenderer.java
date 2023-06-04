package net.linkle.wilder_horizons.client.entity.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.client.entity.model.MossySheepEntityModel;
import net.linkle.wilder_horizons.client.entity.renderer.feature.SheepMossFeatureRenderer;
import net.linkle.wilder_horizons.entity.MossySheepEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class MossySheepRenderer extends MobEntityRenderer<MossySheepEntity, MossySheepEntityModel<MossySheepEntity>> {
    private static final Identifier TEXTURE = Main.makeId("textures/entity/sheep/mossy_sheep.png");

    public MossySheepRenderer(EntityRendererFactory.Context context) {
        super(context, new MossySheepEntityModel<>(context.getPart(EntityModelLayers.SHEEP)), 0.7f);
        addFeature(new SheepMossFeatureRenderer(this, context.getModelLoader()));
    }

    @Override
    public Identifier getTexture(MossySheepEntity entity) {
        return TEXTURE;
    }
}
