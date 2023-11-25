package com.primogemstudio.primogemcraft.entities.instances.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.primogemstudio.primogemcraft.entities.instances.entities.DendroCoreEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;

@Environment(EnvType.CLIENT)
public class DendroCoreEntityModel extends EntityModel<DendroCoreEntity> {
    public final ModelPart seed;

    public DendroCoreEntityModel() {
        this.seed = getTexturedModelData().bakeRoot().getChild("seed");
    }

    public static LayerDefinition getTexturedModelData() {
        var meshdefinition = new MeshDefinition();
        var partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("seed",
                CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(13, 22).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
                        .addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 11)
                        .addBox(-2.0F, -5.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(5, 21).addBox(-2.0F, -5.0F, 2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 3)
                        .addBox(-2.0F, -5.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 17).addBox(2.0F, -5.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 16)
                        .addBox(-3.0F, -5.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 8)
                        .addBox(-1.0F, -7.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 27).addBox(2.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 12)
                        .addBox(-1.0F, -6.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 10).addBox(-1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
                        .addBox(-1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(-1.0F, 2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
                        .addBox(-3.0F, -2.0F, -4.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 22).addBox(0.0F, -2.0F, 3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 25)
                        .addBox(-3.0F, -2.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 20).addBox(1.0F, -2.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
                        .addBox(-4.0F, -2.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 11).addBox(-4.0F, -2.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 5)
                        .addBox(3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(3.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
                        .addBox(-1.0F, -5.0F, 3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 18).addBox(0.0F, -6.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 16)
                        .addBox(-3.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 15).addBox(-3.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
                        .addBox(-2.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 23).addBox(-4.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 24)
                        .addBox(0.0F, -5.0F, -4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 26).addBox(2.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
                        .addBox(1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 16).addBox(0.0F, 2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 17)
                        .addBox(0.0F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
                        .addBox(3.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 20.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        seed.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(DendroCoreEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        seed.yRot = ageInTicks;
    }
}
