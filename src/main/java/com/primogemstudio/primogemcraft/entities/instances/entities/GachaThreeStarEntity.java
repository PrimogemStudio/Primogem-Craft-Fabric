package com.primogemstudio.primogemcraft.entities.instances.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import org.joml.Vector3f;

public class GachaThreeStarEntity extends ColorLightningBolt {
    private static final Vector3f color = new Vector3f(0.2666666f, 0.7176471f, 0.9764705f);

    public GachaThreeStarEntity(EntityType<? extends GachaThreeStarEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public Vector3f getRenderColor() {
        return color;
    }
}
