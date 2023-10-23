package com.primogemstudio.primogemcraft.modprotocols;

import net.minecraft.world.entity.Entity;

public interface AbstractModProtocol {
    class Holder {
        private static AbstractModProtocol DUMMY = new AbstractModProtocol() {
            public boolean enabled() {
                return true;
            }
            public void onGachaLightningBolt(Entity entity, Runnable fallback) {
                fallback.run();
            }
        };
        private static AbstractModProtocol GENSHIN_CRAFT_PROTOCOL;
    }
    static AbstractModProtocol getGenshinCraftProtocol() {
        if (Holder.GENSHIN_CRAFT_PROTOCOL.enabled()) {
            if (Holder.GENSHIN_CRAFT_PROTOCOL == null) Holder.GENSHIN_CRAFT_PROTOCOL = new GenshinCraftProtocol();
            return Holder.GENSHIN_CRAFT_PROTOCOL;
        }
        else return Holder.DUMMY;
    }
    boolean enabled();
    void onGachaLightningBolt(Entity entity, Runnable fallback);
}
