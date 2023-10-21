package com.primogemstudio.primogemcraft.entities;

import com.primogemstudio.primogemcraft.entities.instances.entities.DendroCoreEntity;
import com.primogemstudio.primogemcraft.entities.instances.entities.GachaFiveStarEntity;
import com.primogemstudio.primogemcraft.entities.instances.entities.IntertwinedFateEntity;
import com.primogemstudio.primogemcraft.entities.instances.renderer.ColorLightningBoltRenderer;
import com.primogemstudio.primogemcraft.entities.instances.renderer.DendroCoreEntityRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class PrimogemCraftEntities {
    public static EntityType<DendroCoreEntity> DENDRO_CORE_ENTITY;
    public static EntityType<IntertwinedFateEntity> INTERTWINED_FATE_ENTITY;
    public static EntityType<GachaFiveStarEntity> GOLDEN_LIGHT;

    public static void init() {
        DENDRO_CORE_ENTITY = register("dendro_core_entity", EntityType.Builder.of(DendroCoreEntity::new, MobCategory.MONSTER).sized(0.2f, 0.2f));
        INTERTWINED_FATE_ENTITY = register("intertwined_fate_entity", EntityType.Builder.<IntertwinedFateEntity>of(IntertwinedFateEntity::new, MobCategory.MISC).sized(0.25f, 0.25f).clientTrackingRange(4).updateInterval(10));
        GOLDEN_LIGHT = register("golden_light", EntityType.Builder.of(GachaFiveStarEntity::new, MobCategory.MISC).noSave().sized(0.0f, 0.0f).clientTrackingRange(16).updateInterval(Integer.MAX_VALUE));
        EntityRendererRegistry.register(DENDRO_CORE_ENTITY, DendroCoreEntityRenderer::new);
        EntityRendererRegistry.register(INTERTWINED_FATE_ENTITY, ThrownItemRenderer::new);
        EntityRendererRegistry.register(GOLDEN_LIGHT, ColorLightningBoltRenderer::new);
        FabricDefaultAttributeRegistry.register(DENDRO_CORE_ENTITY, DendroCoreEntity.createAttributes());
    }

    private static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> entityTypeBuilder) {
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(MOD_ID, id), entityTypeBuilder.build(id));
    }
}