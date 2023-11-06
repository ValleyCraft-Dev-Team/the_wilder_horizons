package net.linkle.wilder_horizons.client.entity.renderer.feature;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.EyesFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.LivingEntity;

@Environment(EnvType.CLIENT)
public class EyesFeatureRenderer2<T extends LivingEntity, M extends EntityModel<T>> extends EyesFeatureRenderer<T, M> {

    private final RenderLayer skin;
    
    public EyesFeatureRenderer2(FeatureRendererContext<T, M> context, RenderLayer skin) {
        super(context);
        this.skin = skin;
    }

    public RenderLayer getEyesTexture() {
        return skin;
    }
}
