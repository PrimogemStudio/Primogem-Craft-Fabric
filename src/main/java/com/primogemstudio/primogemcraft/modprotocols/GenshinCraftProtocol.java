package com.primogemstudio.primogemcraft.modprotocols;

import net.fabricmc.loader.api.FabricLoader;
import net.hacker.genshincraft.element.shadow.Element;
import net.hacker.genshincraft.element.shadow.ElementDamageSource;
import net.minecraft.world.entity.Entity;

public class GenshinCraftProtocol implements AbstractModProtocol {
    public static final GenshinCraftProtocol INSTANCE = new GenshinCraftProtocol();
    private GenshinCraftProtocol() {}
    public void onGachaLightningBolt(Entity entity, Runnable fallback) {
        if (enabled()) {
            entity.hurt(new ElementDamageSource(
                    entity.damageSources().lightningBolt(),
                    Element.fromType(
                            Element.Type.Electro,
                            1,
                            Element.getDelta(1)
                    ))
                    .setCooldown(true),
                    162
            );
        }
        else fallback.run();
    }

    @Override
    public boolean enabled() {
        return FabricLoader.getInstance().isModLoaded("genshincraft");
    }
}
