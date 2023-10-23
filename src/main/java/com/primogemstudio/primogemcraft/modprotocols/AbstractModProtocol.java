package com.primogemstudio.primogemcraft.modprotocols;

public interface AbstractModProtocol {
    GenshinCraftProtocol GENSHIN_CRAFT_PROTOCOL = new GenshinCraftProtocol();
    boolean enabled();
}
