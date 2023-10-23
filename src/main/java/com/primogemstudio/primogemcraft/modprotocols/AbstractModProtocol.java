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
        private static AbstractModProtocol GENSHIN_CRAFT_PROTOCOL = new GenshinCraftProtocol();
    }
    static AbstractModProtocol getGenshinCraftProtocol() {
        if (Holder.GENSHIN_CRAFT_PROTOCOL.enabled()) {
            return Holder.GENSHIN_CRAFT_PROTOCOL;
        }
        else return Holder.DUMMY;
    }
    boolean enabled();
    void onGachaLightningBolt(Entity entity, Runnable fallback);
}
