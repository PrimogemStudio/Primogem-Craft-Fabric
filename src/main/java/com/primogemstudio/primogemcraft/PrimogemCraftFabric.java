package com.primogemstudio.primogemcraft;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrimogemCraftFabric implements ModInitializer {
    public static final String MOD_ID = "primogemcraft";
    public static final Logger LOGGER = LogManager.getLogger();

    public void onInitialize() {
        CreativeTabs.init();
        Worldgen.init();
        LOGGER.info("Primogem Craft Loaded");
    }
}
