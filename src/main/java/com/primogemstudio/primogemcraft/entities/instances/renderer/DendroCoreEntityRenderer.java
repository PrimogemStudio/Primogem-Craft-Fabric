package com.primogemstudio.primogemcraft.entities.instances.renderer;

import com.primogemstudio.primogemcraft.entities.instances.entities.DendroCoreEntity;
import com.primogemstudio.primogemcraft.entities.instances.model.DendroCoreEntityModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

@Environment(EnvType.CLIENT)
public class DendroCoreEntityRenderer extends MobRenderer<DendroCoreEntity, DendroCoreEntityModel> {
    public DendroCoreEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new DendroCoreEntityModel(), 0.2f);
    }

    @Override
    @NotNull
    public ResourceLocation getTextureLocation(DendroCoreEntity entity) {
        return new ResourceLocation(MOD_ID, "textures/entities/dendro_core.png");
    }
}
