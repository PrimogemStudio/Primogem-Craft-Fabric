
package net.mcreator.ceshi.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ceshi.entity.CaoyuanheshengwuEntity;
import net.mcreator.ceshi.client.model.Modelcx_cyhsrmx;

public class CaoyuanheshengwuRenderer extends MobRenderer<CaoyuanheshengwuEntity, Modelcx_cyhsrmx<CaoyuanheshengwuEntity>> {
	public CaoyuanheshengwuRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcx_cyhsrmx(context.bakeLayer(Modelcx_cyhsrmx.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(CaoyuanheshengwuEntity entity) {
		return new ResourceLocation("primogemcraft:textures/entities/cx_cyh_tt.png");
	}
}
