package com.primogemstudio.primogemcraft.modprotocols;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.entity.Entity;

public interface AbstractModProtocol {
    class Holder {
        private static AbstractModProtocol DUMMY = (entity, fallback) -> fallback.run();
        private static AbstractModProtocol GENSHIN_CRAFT_PROTOCOL;
    }
    static AbstractModProtocol getGenshinCraftProtocol() {
        if (FabricLoader.getInstance().isModLoaded("genshincraft")) {
            if (Holder.GENSHIN_CRAFT_PROTOCOL == null) Holder.GENSHIN_CRAFT_PROTOCOL = new GenshinCraftProtocol();
            return Holder.GENSHIN_CRAFT_PROTOCOL;
        }
        else return Holder.DUMMY;
    }
    void onGachaLightningBolt(Entity entity, Runnable fallback);
}
