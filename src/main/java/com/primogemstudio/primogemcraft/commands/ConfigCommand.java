package com.primogemstudio.primogemcraft.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.primogemstudio.primogemcraft.util.HalfPrecisionFloat;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;

import static com.mojang.brigadier.arguments.BoolArgumentType.bool;
import static com.mojang.brigadier.arguments.BoolArgumentType.getBool;
import static com.mojang.brigadier.arguments.DoubleArgumentType.doubleArg;
import static com.mojang.brigadier.arguments.DoubleArgumentType.getDouble;

public class ConfigCommand {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(
                Commands.literal("primogemcraft").requires(c -> c.hasPermission(4))
                        .then(Commands.literal("set")
                                .then(Commands.literal("collapsing")
                                        .then(Commands.literal("arg")
                                                .then(Commands.argument("value", doubleArg(0, 1))
                                                        .executes(context -> set(context.getSource(), 1, getDouble(context, "value")))
                                                )
                                        )
                                        .then(Commands.literal("enable")
                                                .then(Commands.argument("value", bool())
                                                        .executes(context -> set(context.getSource(), 2, getBool(context, "value")))
                                                )
                                        )
                                )
                        )
                        .then(Commands.literal("get")
                                .then(Commands.literal("collapsing")
                                        .then(Commands.literal("arg")
                                                .executes(context -> get(context.getSource(), 1))
                                        )
                                        .then(Commands.literal("enable")
                                                .executes(context -> get(context.getSource(), 2))
                                        )
                                )
                        )
        );
    }

    private static int set(CommandSourceStack source, int type, Object value) {
        try {
            switch (type) {
                case 1 -> {
                    HalfPrecisionFloat.opt = (double) value;
                    HalfPrecisionFloat.onChanged(source.getPlayer());
                    source.sendSuccess(() -> Component.translatable("command.primogemcraft.set_collapse", HalfPrecisionFloat.opt), true);
                    return 0;
                }
                case 2 -> {
                    HalfPrecisionFloat.usePrecisionLost = (boolean) value;
                    HalfPrecisionFloat.onChanged(source.getPlayer());
                    source.sendSuccess(() -> Component.translatable("command.primogemcraft.enable_collapse." + HalfPrecisionFloat.usePrecisionLost), true);
                    return 0;
                }
            }
        } catch (Throwable ignore) {
            source.sendFailure(Component.translatable("command.failed"));
            return -1;
        }
        return 0;
    }

    private static int get(CommandSourceStack source, int type) {
        switch (type) {
            case 1 ->
                    source.sendSuccess(() -> Component.translatable("command.primogemcraft.set_collapse", HalfPrecisionFloat.opt), true);
            case 2 ->
                    source.sendSuccess(() -> Component.translatable("command.primogemcraft.enable_collapse." + HalfPrecisionFloat.usePrecisionLost), true);
        }
        return 0;
    }
}
