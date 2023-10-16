package com.primogemstudio.primogemcraft;

import com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks;
import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrimogemCraftFabric implements ModInitializer {
    public static String MOD_ID = "primogemcraft";
    public static Logger logger = LogManager.getLogger();

    public void onInitialize() {
        PrimogemCraftBlocks.init();
        PrimogemCraftItems.init();
        CreativeTab.init();
        logger.info("Primogem Craft Loaded");
    }
}
