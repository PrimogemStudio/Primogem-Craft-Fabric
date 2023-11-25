package com.primogemstudio.primogemcraft.util;

import net.minecraft.client.Minecraft;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.GameType;

public class GameUtil {
    public static boolean isCreative(Player player) {
        if (player instanceof ServerPlayer serverPlayer) {
            return serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
        }
        else if (player.level().isClientSide()) {
            return Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
        }
        return false;
    }
}
