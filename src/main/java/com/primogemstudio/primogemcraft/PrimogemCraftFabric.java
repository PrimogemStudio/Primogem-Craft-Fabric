package com.primogemstudio.primogemcraft;

import com.primogemstudio.primogemcraft.advancements.PrimogemCraftAdvancements;
import com.primogemstudio.primogemcraft.commands.ConfigCommand;
import com.primogemstudio.primogemcraft.util.Events;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.network.Connection;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrimogemCraftFabric implements ModInitializer {
    public static final String MOD_ID = "primogemcraft";
    public static final Logger LOGGER = LogManager.getLogger();

    public void onInitialize() {
        CreativeTabs.init();
        PrimogemCraftWorldgen.init();
        PrimogemCraftAdvancements.init();
        CommandRegistrationCallback.EVENT.register((d, ra, e) -> ConfigCommand.register(d));
        Events.ON_PLAYER_JOIN.register((netManager, player) -> {
            var root = player.server.getAdvancements().getAdvancement(new ResourceLocation(MOD_ID, MOD_ID));
            var progress = player.getAdvancements().getOrStartProgress(root);
            progress.getRemainingCriteria().forEach(c -> player.getAdvancements().award(root, c));
        });
        LOGGER.info("Primogem Craft Loaded");
    }
}
