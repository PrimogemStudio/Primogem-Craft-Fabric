package com.primogemstudio.primogemcraft.modprotocols;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.entity.Entity;

public interface AbstractModProtocol {
    boolean GENSHINCRAFT = FabricLoader.getInstance().isModLoaded("genshincraft");

    class Holder {
        private static final AbstractModProtocol DUMMY = entity -> entity.hurt(entity.damageSources().lightningBolt(), 5);
        private static final AbstractModProtocol GENSHIN_CRAFT_PROTOCOL = GENSHINCRAFT ? new GenshinCraftProtocol() : null;
    }

    static AbstractModProtocol getGenshinCraftProtocol() {
        return GENSHINCRAFT ? Holder.GENSHIN_CRAFT_PROTOCOL : Holder.DUMMY;
    }

    void onGachaLightningBolt(Entity entity);
}
