package net.linkle.wilder_horizons.client.entity.renderer.feature;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.linkle.wilder_horizons.entity.FriendlyEndermanEntity;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EndermanEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Vec3f;

@Environment(EnvType.CLIENT)
public class EndermanBlockFeatureRenderer2 extends FeatureRenderer<FriendlyEndermanEntity, EndermanEntityModel<FriendlyEndermanEntity>> {
    private final BlockRenderManager blockRenderManager;

    public EndermanBlockFeatureRenderer2(FeatureRendererContext<FriendlyEndermanEntity, EndermanEntityModel<FriendlyEndermanEntity>> context, BlockRenderManager blockRenderManager) {
        super(context);
        this.blockRenderManager = blockRenderManager;
    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, FriendlyEndermanEntity entity, float f, float g, float h, float j, float k, float l) {
        BlockState state = entity.getCarriedBlock();
        if (state != null) {
            matrixStack.push();
            matrixStack.translate(0.0, 0.6875, -0.75);
            matrixStack.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(20.0F));
            matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(45.0F));
            matrixStack.translate(0.25, 0.1875, 0.25);
            float m = 0.5F;
            matrixStack.scale(-0.5F, -0.5F, 0.5F);
            matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(90.0F));
            this.blockRenderManager.renderBlockAsEntity(state, matrixStack, vertexConsumerProvider, i, OverlayTexture.DEFAULT_UV);
            matrixStack.pop();
        }
    }
}
