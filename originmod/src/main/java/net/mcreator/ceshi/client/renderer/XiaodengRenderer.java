
package net.mcreator.ceshi.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.ceshi.entity.XiaodengEntity;
import net.mcreator.ceshi.client.model.Modelceshixiaodeng_Converted;

public class XiaodengRenderer extends MobRenderer<XiaodengEntity, Modelceshixiaodeng_Converted<XiaodengEntity>> {
	public XiaodengRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelceshixiaodeng_Converted(context.bakeLayer(Modelceshixiaodeng_Converted.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<XiaodengEntity, Modelceshixiaodeng_Converted<XiaodengEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("primogemcraft:textures/entities/ceshixiaodeng_tietu.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(XiaodengEntity entity) {
		return new ResourceLocation("primogemcraft:textures/entities/ceshixiaodeng_tietu.png");
	}
}
