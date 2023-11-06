package net.linkle.wilder_horizons.client.entity.renderer;

import net.linkle.wilder_horizons.client.entity.renderer.feature.EndermanBlockFeatureRenderer2;
import net.linkle.wilder_horizons.client.entity.renderer.feature.EyesFeatureRenderer2;
import net.linkle.wilder_horizons.client.entity.renderer.feature.StrawHatFeatureRenderer;
import net.linkle.wilder_horizons.entity.FriendlyEndermanEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EndermanEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;

public class FriendlyEndermanRenderer extends MobEntityRenderer<FriendlyEndermanEntity, EndermanEntityModel<FriendlyEndermanEntity>> {
    private static final Identifier TEXTURE = new Identifier("textures/entity/enderman/enderman.png");
    private final Random random = Random.create();

    public FriendlyEndermanRenderer(EntityRendererFactory.Context context) {
        super(context, new EndermanEntityModel<>(context.getPart(EntityModelLayers.ENDERMAN)), 0.5f);
        this.addFeature(new StrawHatFeatureRenderer<>(this));
        this.addFeature(new EyesFeatureRenderer2<>(this, RenderLayer.getEyes(new Identifier("textures/entity/enderman/enderman_eyes.png"))));
        this.addFeature(new EndermanBlockFeatureRenderer2(this, context.getBlockRenderManager()));
    }

    public void render(FriendlyEndermanEntity entity, float yaw, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider provider, int light) {
        if (isVisible(entity)) {
            var model = (EndermanEntityModel<FriendlyEndermanEntity>)this.getModel();
            model.carryingBlock = entity.getCarriedBlock() != null;
            model.angry = false;
            super.render(entity, yaw, tickDelta, matrixStack, provider, light);
        }
    }

    public Identifier getTexture(FriendlyEndermanEntity entity) {
        return TEXTURE;
    }
}
