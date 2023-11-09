package com.primogemstudio.primogemcraft;

import com.primogemstudio.primogemcraft.advancements.PrimogemCraftAdvancements;
import com.primogemstudio.primogemcraft.commands.ConfigCommand;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrimogemCraftFabric implements ModInitializer {
    public static final String MOD_ID = "primogemcraft";
    public static final Logger LOGGER = LogManager.getLogger();

    public void onInitialize() {
        CreativeTabs.init();
        PrimogemCraftWorldgen.init();
        PrimogemCraftAdvancements.init();
        CommandRegistrationCallback.EVENT.register((d, ra, e) -> ConfigCommand.register(d, e));
        LOGGER.info("Primogem Craft Loaded");
    }
}
