// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class snail_large extends EntityModel<Entity> {
	private final ModelPart shell;
	private final ModelPart body;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	public snail_large(ModelPart root) {
		this.shell = root.getChild("shell");
		this.body = root.getChild("body");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData shell = modelPartData.addChild("shell", ModelPartBuilder.create().uv(0, 15).cuboid(-3.0F, -8.5F, -4.0F, 5.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 2).cuboid(-2.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-2.0F, -3.0F, -6.0F, 3.0F, 3.0F, 12.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(0.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = body.addChild("cube_r1", ModelPartBuilder.create().uv(4, 0).cuboid(-4.0F, -7.0F, -4.75F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 0.2F, 0.9F, 0.4146F, -0.8731F, -0.3253F));

		ModelPartData cube_r2 = body.addChild("cube_r2", ModelPartBuilder.create().uv(0, 4).cuboid(3.0F, -7.0F, -4.75F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.2F, 0.9F, 0.4146F, 0.8731F, 0.3253F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		shell.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}