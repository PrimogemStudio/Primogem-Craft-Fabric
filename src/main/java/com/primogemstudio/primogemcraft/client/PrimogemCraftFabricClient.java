package com.primogemstudio.primogemcraft.client;

import com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks;
import com.primogemstudio.primogemcraft.entities.PrimogemCraftEntityRenderers;
import com.primogemstudio.primogemcraft.gacha.GachaClient;
import com.primogemstudio.primogemcraft.modprotocols.AbstractModProtocol;
import com.primogemstudio.primogemcraft.util.Events;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.HoverEvent;
import net.minecraft.network.chat.Style;

public class PrimogemCraftFabricClient implements ClientModInitializer {
    public void onInitializeClient() {
        PrimogemCraftEntityRenderers.init();
        PrimogemCraftBlocks.initRenderLayers();
        GachaClient.init();

        Events.ON_PLAYER_JOIN.register((netManager, _ent) -> {
            if (!AbstractModProtocol.GENSHINCRAFT || !AbstractModProtocol.REI) {
                Minecraft.getInstance().gui.getChat().addMessage(
                        Component.literal("原石工艺：").withStyle(
                                Style.EMPTY.withColor(ChatFormatting.AQUA)
                        )
                );
                if (!AbstractModProtocol.REI) {
                    Minecraft.getInstance().gui.getChat().addMessage(
                            Component.literal("不会玩？配方有误？JEI配方不全？对模组有疑问？\n如果您没有使用强大的REI模组，那么")
                    );
                    Minecraft.getInstance().gui.getChat().addMessage(
                            Component.literal("https://www.mcmod.cn/class/1674.html").withStyle(
                                    Style.EMPTY.withColor(ChatFormatting.DARK_AQUA)
                                            .withUnderlined(true)
                                            .withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.mcmod.cn/class/1674.html"))
                                            .withHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, Component.literal("MCMOD百科")))
                            )
                    );
                    Minecraft.getInstance().gui.getChat().addMessage(
                            Component.literal("会适合你！")
                    );
                }
                if (!AbstractModProtocol.GENSHINCRAFT) {
                    Minecraft.getInstance().gui.getChat().addMessage(
                            Component.literal("对联动的模组有兴趣？").withStyle(
                                    Style.EMPTY.withColor(ChatFormatting.YELLOW)
                            )
                    );
                    Minecraft.getInstance().gui.getChat().addMessage(
                            Component.literal("了解更多").withStyle(
                                    Style.EMPTY.withColor(ChatFormatting.AQUA)
                                            .withUnderlined(true)
                                            .withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.mcmod.cn/class/10429.html"))
                                            .withHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, Component.literal("MC百科：原石工艺")))
                            )
                    );
                }
            }
        });
    }
}
