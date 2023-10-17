package com.primogemstudio.primogemcraft.gacha.packets.client;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.protocol.game.ServerboundCustomPayloadPacket;

import static com.primogemstudio.primogemcraft.gacha.GachaNetworkConstants.GACHA_TRIGGER;

public class GachaTriggerClientPacket extends ServerboundCustomPayloadPacket {
    public GachaTriggerClientPacket(FriendlyByteBuf data) {
        super(GACHA_TRIGGER, data);
    }
}
