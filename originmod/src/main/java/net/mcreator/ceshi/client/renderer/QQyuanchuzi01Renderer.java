
package net.mcreator.ceshi.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ceshi.entity.QQyuanchuzi01Entity;
import net.mcreator.ceshi.client.model.Modeljinguangshiti01_Converted_Converted;

public class QQyuanchuzi01Renderer extends MobRenderer<QQyuanchuzi01Entity, Modeljinguangshiti01_Converted_Converted<QQyuanchuzi01Entity>> {
	public QQyuanchuzi01Renderer(EntityRendererProvider.Context context) {
		super(context, new Modeljinguangshiti01_Converted_Converted(context.bakeLayer(Modeljinguangshiti01_Converted_Converted.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(QQyuanchuzi01Entity entity) {
		return new ResourceLocation("primogemcraft:textures/entities/xiguang.png");
	}
}
