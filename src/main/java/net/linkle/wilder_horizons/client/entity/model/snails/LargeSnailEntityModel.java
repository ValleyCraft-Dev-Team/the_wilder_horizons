package net.linkle.wilder_horizons.client.entity.model.snails;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.linkle.wilder_horizons.Main;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.MobEntity;

//Made with Blockbench 4.8.3
@Environment(EnvType.CLIENT)
public class LargeSnailEntityModel<T extends MobEntity> extends SinglePartEntityModel<T> {

    public static final EntityModelLayer LAYER = new EntityModelLayer(Main.makeId("snail_large"), "main");

	private final ModelPart main;

	public LargeSnailEntityModel(ModelPart root) {
		this.main = root.getChild("body");
	}

	public static TexturedModelData getTexturedModelData() {
		var modelData = new ModelData();
		var modelPartData = modelData.getRoot();

		var body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 2).cuboid(-2.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-2.0F, -3.0F, -6.0F, 3.0F, 3.0F, 12.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(0.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		body.addChild("shell", ModelPartBuilder.create().uv(0, 15).cuboid(-3.0F, -8.5F, -4.0F, 5.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		body.addChild("cube_r1", ModelPartBuilder.create().uv(4, 0).cuboid(-4.0F, -7.0F, -4.75F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 0.2F, 0.9F, 0.4146F, -0.8731F, -0.3253F));

		body.addChild("cube_r2", ModelPartBuilder.create().uv(0, 4).cuboid(3.0F, -7.0F, -4.75F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.2F, 0.9F, 0.4146F, 0.8731F, 0.3253F));

		return TexturedModelData.of(modelData, 32, 32);
	}
	
	@Override
    public ModelPart getPart() {
        return main;
    }

	@Override
	public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
	    main.render(matrices, vertices, light, overlay);
	}
}