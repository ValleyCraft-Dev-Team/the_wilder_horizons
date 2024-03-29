package net.linkle.wilder_horizons.client.entity.renderer.fish;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.linkle.wilder_horizons.Main;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CodEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.SmallTropicalFishEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.entity.passive.TropicalFishEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3f;

@Environment(EnvType.CLIENT)
public class SmallTropicalFishEntityRenderer extends MobEntityRenderer<FishEntity, SmallTropicalFishEntityModel<FishEntity>> {

    private final Identifier texture;

    public SmallTropicalFishEntityRenderer(EntityRendererFactory.Context context, Identifier texture) {
        super(context, new SmallTropicalFishEntityModel<>(context.getPart(EntityModelLayers.TROPICAL_FISH_SMALL)), 0.3f);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture(FishEntity codEntity) {
        return texture;
    }

    @Override
    protected void setupTransforms(FishEntity entity, MatrixStack matrixStack, float f, float g, float h) {
        super.setupTransforms(entity, matrixStack, f, g, h);
        float i = 4.3f * MathHelper.sin(0.6f * f);
        matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(i));
        if (!entity.isTouchingWater()) {
            matrixStack.translate(0.2f, 0.1f, 0.0);
            matrixStack.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(90.0f));
        }
    }
    
    /** @param texture file name of the snail texture. */
    public static EntityRendererFactory<FishEntity> create(String texture) {
        var id = Main.makeId("textures/entity/fish/" + texture + ".png");
        return context -> new SmallTropicalFishEntityRenderer(context, id);
    }
}
