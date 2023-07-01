// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class dust_mite extends EntityModel<Entity> {
	private final ModelPart body;
	public dust_mite(ModelPart root) {
		this.body = root.getChild("body");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(28, 26).cuboid(-3.5F, -7.0F, -0.5F, 7.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(21, 0).cuboid(-1.5F, -7.0F, -3.5F, 0.0F, 7.0F, 7.0F, new Dilation(0.0F))
		.uv(0, 20).cuboid(-0.5F, -7.0F, -3.5F, 0.0F, 7.0F, 7.0F, new Dilation(0.0F))
		.uv(14, 19).cuboid(0.5F, -7.0F, -3.5F, 0.0F, 7.0F, 7.0F, new Dilation(0.0F))
		.uv(0, 14).cuboid(1.5F, -7.0F, -3.5F, 0.0F, 7.0F, 7.0F, new Dilation(0.0F))
		.uv(16, 16).cuboid(-2.5F, -6.0F, -2.5F, 5.0F, 5.0F, 5.0F, new Dilation(0.0F))
		.uv(14, 0).cuboid(-3.5F, -2.0F, -3.5F, 7.0F, 0.0F, 7.0F, new Dilation(0.0F))
		.uv(0, 14).mirrored().cuboid(-3.5F, -3.0F, -3.5F, 7.0F, 0.0F, 7.0F, new Dilation(0.0F)).mirrored(false)
		.uv(0, 7).cuboid(-3.5F, -4.0F, -3.5F, 7.0F, 0.0F, 7.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-3.5F, -5.0F, -3.5F, 7.0F, 0.0F, 7.0F, new Dilation(0.0F))
		.uv(28, 33).mirrored().cuboid(-3.5F, -7.0F, -1.5F, 7.0F, 7.0F, 0.0F, new Dilation(0.0F)).mirrored(false)
		.uv(14, 33).cuboid(-3.5F, -7.0F, 1.5F, 7.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 35).mirrored().cuboid(-3.5F, -7.0F, 0.5F, 7.0F, 7.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}