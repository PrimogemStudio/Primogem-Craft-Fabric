package com.primogemstudio.primogemcraft;

import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.primogemstudio.primogemcraft.client.PrimogemCraftFabricClient;
import com.primogemstudio.primogemcraft.util.HalfPrecisionFloat;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.client.Minecraft;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrimogemCraftFabric implements ModInitializer {
    public static final String MOD_ID = "primogemcraft";
    public static final Logger LOGGER = LogManager.getLogger();

    public void onInitialize() {
        CreativeTabs.init();
        Worldgen.init();

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(
                Commands.literal("/primogem_craft:set_collapsing_arg")
                        .then(
                                Commands.argument("arg", DoubleArgumentType.doubleArg(0, 1)).executes(context -> {
                                    HalfPrecisionFloat.opt = DoubleArgumentType.getDouble(context, "arg");
                                    HalfPrecisionFloat.onChanged();
                                    if (environment.includeIntegrated) {
                                        Minecraft.getInstance().gui.getChat().addMessage(Component.translatable("command.primogemcraft.set_collapse", HalfPrecisionFloat.opt));
                                    }
                                    else if (environment.includeDedicated) {
                                        LogManager.getLogger(PrimogemCraftFabricClient.class).info("World collapse arg was set to {}", HalfPrecisionFloat.opt);
                                    }
                                    return 0;
                                })
                        )

        ));

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(
                Commands.literal("/primogem_craft:set_enable_collapsing")
                        .then(
                                Commands.argument("arg", BoolArgumentType.bool()).executes(context -> {
                                    HalfPrecisionFloat.usePrecisionLost = BoolArgumentType.getBool(context, "arg");
                                    HalfPrecisionFloat.onChanged();
                                    if (environment.includeIntegrated) {
                                        Minecraft.getInstance().gui.getChat().addMessage(Component.translatable("command.primogemcraft.enable_collapse." + HalfPrecisionFloat.usePrecisionLost));
                                    }
                                    else if (environment.includeDedicated) {
                                        LogManager.getLogger(PrimogemCraftFabricClient.class).info("World collapsing was set to {}", HalfPrecisionFloat.usePrecisionLost);
                                    }
                                    return 0;
                                })
                        )

        ));

        LOGGER.info("Primogem Craft Loaded");
    }
}
