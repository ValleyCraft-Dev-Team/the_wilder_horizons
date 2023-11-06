package net.linkle.wilder_horizons.client.entity.renderer.feature;

import net.linkle.wilder_horizons.client.armor.renderer.StrawHatRenderer;
import net.linkle.wilder_horizons.init.init_core.WHArmors;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;

public class StrawHatFeatureRenderer<T extends LivingEntity, M extends BipedEntityModel<T>> extends FeatureRenderer<T, M> {

    private static final StrawHatRenderer HAT = new StrawHatRenderer();

    public StrawHatFeatureRenderer(FeatureRendererContext<T, M> context) {
        super(context);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider provider, int light, T entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        HAT.render(matrices, provider, WHArmors.STRAW_HAT.item.getDefaultStack(), light, getContextModel());
    }
}
