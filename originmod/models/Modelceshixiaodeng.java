// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelceshixiaodeng extends EntityModel<Entity> {
	private final ModelRenderer xiaodeng;
	private final ModelRenderer zhuti;
	private final ModelRenderer bian;
	private final ModelRenderer bone;
	private final ModelRenderer dizuo;
	private final ModelRenderer bianyuan;
	private final ModelRenderer bianyuan2;
	private final ModelRenderer bianyuan3;

	public Modelceshixiaodeng() {
		textureWidth = 256;
		textureHeight = 256;

		xiaodeng = new ModelRenderer(this);
		xiaodeng.setRotationPoint(0.0F, 24.0F, 0.0F);

		zhuti = new ModelRenderer(this);
		zhuti.setRotationPoint(0.0F, 0.0F, 0.0F);
		xiaodeng.addChild(zhuti);
		zhuti.setTextureOffset(60, 51).addBox(-1.0F, -18.0F, -16.0F, 18.0F, 1.0F, 18.0F, 0.0F, false);
		zhuti.setTextureOffset(20, 73).addBox(2.0F, -19.0F, -13.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		zhuti.setTextureOffset(82, 70).addBox(3.0F, -21.0F, -12.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);
		zhuti.setTextureOffset(56, 73).addBox(5.0F, -23.0F, -10.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		zhuti.setTextureOffset(0, 0).addBox(7.0F, -27.0F, -8.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		zhuti.setTextureOffset(0, 51).addBox(-2.0F, -8.0F, -17.0F, 20.0F, 2.0F, 20.0F, 0.0F, false);
		zhuti.setTextureOffset(0, 29).addBox(-2.0F, -17.0F, -17.0F, 20.0F, 2.0F, 20.0F, 0.0F, false);
		zhuti.setTextureOffset(60, 29).addBox(-1.0F, -6.0F, -16.0F, 18.0F, 2.0F, 18.0F, 0.0F, false);
		zhuti.setTextureOffset(0, 0).addBox(-3.0F, -15.0F, -18.0F, 22.0F, 7.0F, 22.0F, 0.0F, false);
		zhuti.setTextureOffset(66, 0).addBox(0.0F, -4.0F, -15.0F, 16.0F, 1.0F, 16.0F, 0.0F, false);

		bian = new ModelRenderer(this);
		bian.setRotationPoint(0.0F, 0.0F, 0.0F);
		zhuti.addChild(bian);
		bian.setTextureOffset(0, 12).addBox(7.0F, -25.0F, -4.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		bian.setTextureOffset(8, 6).addBox(7.0F, -25.0F, -12.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		bian.setTextureOffset(8, 0).addBox(3.0F, -25.0F, -8.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		bian.setTextureOffset(0, 6).addBox(11.0F, -25.0F, -8.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		bian.addChild(bone);
		bone.setTextureOffset(16, 8).addBox(2.0F, -23.0F, -8.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(16, 0).addBox(13.0F, -23.0F, -7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(15, 11).addBox(7.0F, -23.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(15, 5).addBox(8.0F, -23.0F, -13.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		dizuo = new ModelRenderer(this);
		dizuo.setRotationPoint(0.0F, 0.0F, 0.0F);
		xiaodeng.addChild(dizuo);
		dizuo.setTextureOffset(0, 39).addBox(5.0F, -3.0F, -3.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		dizuo.setTextureOffset(8, 34).addBox(2.0F, -3.0F, -6.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		dizuo.setTextureOffset(0, 34).addBox(2.0F, -3.0F, -10.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		dizuo.setTextureOffset(8, 29).addBox(5.0F, -3.0F, -13.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		dizuo.setTextureOffset(0, 29).addBox(9.0F, -3.0F, -13.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		dizuo.setTextureOffset(6, 17).addBox(12.0F, -3.0F, -6.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		dizuo.setTextureOffset(14, 15).addBox(12.0F, -3.0F, -10.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		dizuo.setTextureOffset(8, 12).addBox(9.0F, -3.0F, -3.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		dizuo.setTextureOffset(0, 98).addBox(4.0F, -2.0F, -11.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		bianyuan = new ModelRenderer(this);
		bianyuan.setRotationPoint(0.0F, 1.0F, 0.0F);
		xiaodeng.addChild(bianyuan);
		bianyuan.setTextureOffset(72, 98).addBox(-1.0F, -16.0F, -19.0F, 18.0F, 7.0F, 1.0F, 0.0F, false);
		bianyuan.setTextureOffset(88, 17).addBox(-1.0F, -16.0F, 4.0F, 18.0F, 7.0F, 1.0F, 0.0F, false);
		bianyuan.setTextureOffset(0, 73).addBox(19.0F, -16.0F, -16.0F, 1.0F, 7.0F, 18.0F, 0.0F, false);
		bianyuan.setTextureOffset(62, 70).addBox(-4.0F, -16.0F, -16.0F, 1.0F, 7.0F, 18.0F, 0.0F, false);

		bianyuan2 = new ModelRenderer(this);
		bianyuan2.setRotationPoint(0.0F, 2.0F, 0.0F);
		bianyuan.addChild(bianyuan2);
		bianyuan2.setTextureOffset(102, 88).addBox(1.0F, -11.0F, -18.0F, 14.0F, 2.0F, 1.0F, 0.0F, false);
		bianyuan2.setTextureOffset(102, 85).addBox(1.0F, -11.0F, 3.0F, 14.0F, 2.0F, 1.0F, 0.0F, false);
		bianyuan2.setTextureOffset(56, 95).addBox(18.0F, -11.0F, -14.0F, 1.0F, 2.0F, 14.0F, 0.0F, false);
		bianyuan2.setTextureOffset(40, 88).addBox(-3.0F, -11.0F, -14.0F, 1.0F, 2.0F, 14.0F, 0.0F, false);

		bianyuan3 = new ModelRenderer(this);
		bianyuan3.setRotationPoint(0.0F, -9.0F, 0.0F);
		bianyuan2.addChild(bianyuan3);
		bianyuan3.setTextureOffset(102, 82).addBox(1.0F, -11.0F, -18.0F, 14.0F, 2.0F, 1.0F, 0.0F, false);
		bianyuan3.setTextureOffset(88, 25).addBox(1.0F, -11.0F, 3.0F, 14.0F, 2.0F, 1.0F, 0.0F, false);
		bianyuan3.setTextureOffset(86, 82).addBox(18.0F, -11.0F, -14.0F, 1.0F, 2.0F, 14.0F, 0.0F, false);
		bianyuan3.setTextureOffset(24, 86).addBox(-3.0F, -11.0F, -14.0F, 1.0F, 2.0F, 14.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		xiaodeng.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}