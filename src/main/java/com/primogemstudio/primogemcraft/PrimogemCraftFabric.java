package com.primogemstudio.primogemcraft;

import com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks;
import net.fabricmc.api.ModInitializer;

public class PrimogemCraftFabric implements ModInitializer {
    public static String MODID = "primogemcraft";
    public void onInitialize() {
        PrimogemCraftBlocks.init();
    }
}
