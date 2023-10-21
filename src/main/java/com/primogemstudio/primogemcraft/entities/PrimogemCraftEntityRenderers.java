package com.primogemstudio.primogemcraft.entities;

import com.primogemstudio.primogemcraft.entities.instances.renderer.ColorLightningBoltRenderer;
import com.primogemstudio.primogemcraft.entities.instances.renderer.DendroCoreEntityRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import static com.primogemstudio.primogemcraft.entities.PrimogemCraftEntities.*;

public class PrimogemCraftEntityRenderers {
    public static void init() {
        EntityRendererRegistry.register(DENDRO_CORE_ENTITY, DendroCoreEntityRenderer::new);
        EntityRendererRegistry.register(INTERTWINED_FATE_ENTITY, ThrownItemRenderer::new);
        EntityRendererRegistry.register(GOLDEN_LIGHT, ColorLightningBoltRenderer::new);
    }
}
