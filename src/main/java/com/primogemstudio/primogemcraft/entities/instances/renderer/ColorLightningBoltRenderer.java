package com.primogemstudio.primogemcraft.entities.instances.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.primogemstudio.primogemcraft.entities.instances.entities.ColorLightningBolt;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;

public class ColorLightningBoltRenderer extends EntityRenderer<ColorLightningBolt> {
    public ColorLightningBoltRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public void render(ColorLightningBolt entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        float[] fs = new float[8];
        float[] gs = new float[8];
        float f = 0.0f;
        float g = 0.0f;
        var randomSource = RandomSource.create(entity.seed);
        for (int i = 7; i >= 0; --i) {
            fs[i] = f;
            gs[i] = g;
            f += (float) (randomSource.nextInt(11) - 5);
            g += (float) (randomSource.nextInt(11) - 5);
        }
        var vertexConsumer = buffer.getBuffer(RenderType.lightning());
        var matrix4f = poseStack.last().pose();
        for (int j = 0; j < 4; ++j) {
            var randomSource2 = RandomSource.create(entity.seed);
            for (int k = 0; k < 3; ++k) {
                int l = 7;
                int m = 0;
                if (k > 0) {
                    l = 7 - k;
                }
                if (k > 0) {
                    m = l - 2;
                }
                float h = fs[l] - f;
                float n = gs[l] - g;
                for (int o = l; o >= m; --o) {
                    float p = h;
                    float q = n;
                    if (k == 0) {
                        h += (float) (randomSource2.nextInt(11) - 5);
                        n += (float) (randomSource2.nextInt(11) - 5);
                    } else {
                        h += (float) (randomSource2.nextInt(31) - 15);
                        n += (float) (randomSource2.nextInt(31) - 15);
                    }
                    float v = 0.1f + (float) j * 0.2f;
                    if (k == 0) {
                        v *= (float) o * 0.1f + 1.0f;
                    }
                    float w = 0.1f + (float) j * 0.2f;
                    if (k == 0) {
                        w *= ((float) o - 1.0f) * 0.1f + 1.0f;
                    }
                    var color = entity.getRenderColor();
                    quad(matrix4f, vertexConsumer, h, n, o, p, q, color.x, color.y, color.z, v, w, false, false, true, false);
                    quad(matrix4f, vertexConsumer, h, n, o, p, q, color.x, color.y, color.z, v, w, true, false, true, true);
                    quad(matrix4f, vertexConsumer, h, n, o, p, q, color.x, color.y, color.z, v, w, true, true, false, true);
                    quad(matrix4f, vertexConsumer, h, n, o, p, q, color.x, color.y, color.z, v, w, false, true, false, false);
                }
            }
        }
    }

    private static void quad(Matrix4f matrix, VertexConsumer consumer, float x1, float z1, int index, float x2, float z2, float red, float green, float blue, float f, float g, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        consumer.vertex(matrix, x1 + (bl ? g : -g), index * 16, z1 + (bl2 ? g : -g)).color(red, green, blue, 0.3f).endVertex();
        consumer.vertex(matrix, x2 + (bl ? f : -f), (index + 1) * 16, z2 + (bl2 ? f : -f)).color(red, green, blue, 0.3f).endVertex();
        consumer.vertex(matrix, x2 + (bl3 ? f : -f), (index + 1) * 16, z2 + (bl4 ? f : -f)).color(red, green, blue, 0.3f).endVertex();
        consumer.vertex(matrix, x1 + (bl3 ? g : -g), index * 16, z1 + (bl4 ? g : -g)).color(red, green, blue, 0.3f).endVertex();
    }

    @SuppressWarnings("deprecation")
    @Override
    @NotNull
    public ResourceLocation getTextureLocation(ColorLightningBolt entity) {
        return TextureAtlas.LOCATION_BLOCKS;
    }
}
