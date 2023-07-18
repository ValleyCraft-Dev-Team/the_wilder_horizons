package net.linkle.wilder_horizons.client.armor.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.client.renderer.QuadRenderer;
import net.linkle.wilder_horizons.client.renderer.Renderer;
import net.minecraft.client.model.*;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

@Environment(EnvType.CLIENT)
public class RedWarpaintRenderer implements ArmorRenderer {
    
    private static final Identifier TEXTURE = Main.makeId("textures/entity/clothes/red_war_paint_layer_1.png");
    
    private final ModelPart faceModel;

    {
        var root = new ModelData().getRoot();
        faceModel = root.createPart(64, 32);
        root.addChild("warpaint", ModelPartBuilder.create().cuboid(-4.0F, -8.0F, -4.01F, 8.0F, 8.0F, 0.0F), ModelTransform.NONE);

        float size = 16/64f;
        float u = 31/64f;
        float v = 48/64f;
    }
    
    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, ItemStack stack,
            LivingEntity entity, EquipmentSlot slot, int light, BipedEntityModel<LivingEntity> contextModel) {
        var consumer = ItemRenderer.getArmorGlintConsumer(vertexConsumers, RenderLayer.getArmorCutoutNoCull(TEXTURE), false, stack.hasGlint());
        faceModel.copyTransform(contextModel.getHead());
        faceModel.render(matrices, consumer, light, OverlayTexture.DEFAULT_UV);
        
        matrices.push();
        Renderer.multiply(contextModel.getHead(), matrices);
        matrices.translate(0, -5/16f, 0);
        matrices.pop();
    }
}
