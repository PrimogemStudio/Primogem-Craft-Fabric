package com.primogemstudio.primogemcraft.modprotocols;

import net.fabricmc.loader.api.FabricLoader;
import net.hacker.genshincraft.element.shadow.Element;
import net.hacker.genshincraft.element.shadow.ElementDamageSource;
import net.minecraft.world.entity.Entity;

public final class GenshinCraftProtocol implements AbstractModProtocol {
    GenshinCraftProtocol() {}
    public void onGachaLightningBolt(Entity entity, Runnable fallback) {
        entity.hurt(new ElementDamageSource(
                entity.damageSources().lightningBolt(),
                        Element.fromType(
                                Element.Type.Electro,
                                1,
                                Element.getDelta(1)
                    )).setCooldown(true),
                    162
        );
    }
}
