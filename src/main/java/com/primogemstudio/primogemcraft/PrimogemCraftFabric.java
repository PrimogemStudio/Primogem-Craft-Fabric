package com.primogemstudio.primogemcraft;

import com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrimogemCraftFabric implements ModInitializer {
    public static String MOD_ID = "primogemcraft";
    public static Logger logger = LogManager.getLogger();

    public void onInitialize() {
        PrimogemCraftBlocks.init();
        logger.info("Primogem Craft Loaded");
    }
}
