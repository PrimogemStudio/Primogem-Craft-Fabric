package com.primogemstudio.primogemcraft.entities.instances.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import org.joml.Vector3f;

public class GachaFiveStarEntity extends ColorLightningBolt {
    private static final Vector3f color = new Vector3f(1, 0.792156f, 0.0941176f);

    public GachaFiveStarEntity(EntityType<? extends GachaFiveStarEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public Vector3f getRenderColor() {
        return color;
    }
}
