package com.primogemstudio.primogemcraft.entities.instances.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import org.joml.Vector3f;

public class GachaFourStarEntity extends ColorLightningBolt {
    private static final Vector3f color = new Vector3f(0.772549f, 0.247058f, 0.8117647f);

    public GachaFourStarEntity(EntityType<? extends GachaFourStarEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public Vector3f getRenderColor() {
        return color;
    }
}
