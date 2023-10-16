package com.primogemstudio.primogemcraft.entities.instances.renderer;

import com.primogemstudio.primogemcraft.entities.instances.entities.DendroCoreEntity;
import com.primogemstudio.primogemcraft.entities.instances.model.DendroCoreEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class DendroCoreEntityRenderer extends MobRenderer<DendroCoreEntity, DendroCoreEntityModel<DendroCoreEntity>> {
    public DendroCoreEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new DendroCoreEntityModel<>(context.bakeLayer(DendroCoreEntityModel.LAYER_LOCATION)), 0.2f);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(DendroCoreEntity entity) {
        return new ResourceLocation(MOD_ID, "textures/entities/demdro_core.png");
    }
}
