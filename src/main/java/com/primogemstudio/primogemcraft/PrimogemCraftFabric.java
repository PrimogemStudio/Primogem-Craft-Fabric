package com.primogemstudio.primogemcraft;

import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.primogemstudio.primogemcraft.advancements.PrimogemCraftAdvancements;
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
        PrimogemCraftWorldgen.init();
        PrimogemCraftAdvancements.init();

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(
                Commands.literal("/primogem_craft:collapsing_arg")
                        .then(
                                Commands.argument("arg", DoubleArgumentType.doubleArg(0, 1))
                                        .requires(source -> source.hasPermission(4))
                                        .executes(context -> {
                                    HalfPrecisionFloat.opt = DoubleArgumentType.getDouble(context, "arg");

                                    LogManager.getLogger(PrimogemCraftFabric.class).info("World collapse arg was set to {}", HalfPrecisionFloat.opt);
                                    HalfPrecisionFloat.onChanged(context.getSource().getPlayer());

                                    if (environment.includeIntegrated) {
                                        Minecraft.getInstance().gui.getChat().addMessage(Component.translatable("command.primogemcraft.set_collapse", HalfPrecisionFloat.opt));
                                    }
                                    return 0;
                                })
                        )
                        .executes(context -> {
                            LogManager.getLogger(PrimogemCraftFabric.class).info("World collapse arg was set to {}", HalfPrecisionFloat.opt);
                            if (environment.includeIntegrated) {
                                Minecraft.getInstance().gui.getChat().addMessage(Component.translatable("command.primogemcraft.set_collapse", HalfPrecisionFloat.opt));
                            }
                            return 0;
                        })

        ));

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(
                Commands.literal("/primogem_craft:enable_collapsing")
                        .then(
                                Commands.argument("arg", BoolArgumentType.bool())
                                        .requires(source -> source.hasPermission(4))
                                        .executes(context -> {
                                    HalfPrecisionFloat.usePrecisionLost = BoolArgumentType.getBool(context, "arg");

                                    LogManager.getLogger(PrimogemCraftFabric.class).info("World collapsing was set to {}", HalfPrecisionFloat.usePrecisionLost);
                                    HalfPrecisionFloat.onChanged(context.getSource().getPlayer());

                                    if (environment.includeIntegrated) {
                                        Minecraft.getInstance().gui.getChat().addMessage(Component.translatable("command.primogemcraft.enable_collapse." + HalfPrecisionFloat.usePrecisionLost));
                                    }

                                    return 0;
                                })
                        )
                        .executes(context -> {
                            LogManager.getLogger(PrimogemCraftFabric.class).info("World collapsing was set to {}", HalfPrecisionFloat.usePrecisionLost);
                            if (environment.includeIntegrated) {
                                Minecraft.getInstance().gui.getChat().addMessage(Component.translatable("command.primogemcraft.enable_collapse." + HalfPrecisionFloat.usePrecisionLost));
                            }
                            return 0;
                        })

        ));

        LOGGER.info("Primogem Craft Loaded");
    }
}
