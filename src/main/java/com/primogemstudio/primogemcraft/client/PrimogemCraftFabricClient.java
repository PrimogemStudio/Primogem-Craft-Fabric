package com.primogemstudio.primogemcraft.client;

import com.primogemstudio.primogemcraft.gacha.GachaClient;
import net.fabricmc.api.ClientModInitializer;

public class PrimogemCraftFabricClient implements ClientModInitializer {
    public void onInitializeClient() {
        GachaClient.init();
    }
}
