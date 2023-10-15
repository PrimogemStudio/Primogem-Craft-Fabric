// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelheitaxiaoren extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone2hua;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone2;

	public Modelheitaxiaoren() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 17).addBox(-4.0F, -2.0F, -4.0F, 9.0F, 2.0F, 9.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-5.0F, -8.0F, -5.0F, 10.0F, 6.0F, 11.0F, 0.0F, false);
		bone.setTextureOffset(27, 19).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 3.0F, 9.0F, 0.0F, false);
		bone.setTextureOffset(19, 31).addBox(-1.0F, -12.0F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 4).addBox(6.0F, -8.0F, -5.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-1.0F, -14.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.0436F);
		cube_r2.setTextureOffset(26, 31).addBox(0.0F, -10.0F, -3.0F, 6.0F, 4.0F, 7.0F, 0.0F, false);

		bone2hua = new ModelRenderer(this);
		bone2hua.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone2hua);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2hua.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.5812F, 0.1523F, 0.4098F);
		cube_r3.setTextureOffset(31, 0).addBox(-4.0F, -13.0F, -4.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.0F, 0.0F, -2.0F);
		bone2hua.addChild(bone2);
		setRotationAngle(bone2, -0.576F, 0.1396F, 0.4014F);
		bone2.setTextureOffset(0, 17).addBox(-2.0F, -17.0F, 1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(27, 17).addBox(1.0F, -17.0F, 1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(31, 6).addBox(-1.0F, -16.0F, -1.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		bone2.setTextureOffset(0, 23).addBox(1.0F, -17.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(0, 20).addBox(-2.0F, -17.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}