package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.client.Minecraft;

import net.mcreator.ceshi.init.PrimogemcraftModGameRules;

import java.util.Random;

public class ShengfaqishuxingProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if ((world.getLevelData().getGameRules().getInt(PrimogemcraftModGameRules.GUIZEMOYINSHENSHENGCHENGBEILV)) <= 1) {
				if ((world.getLevelData().getGameRules().getInt(PrimogemcraftModGameRules.GUIZEMOYINSHENSHENGCHENGBEILV)) == 0) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u00A7a\u9B54\u9634\u8EAB\u751F\u6210\u500D\u7387\u5DF2\u964D\u81F30"), (false));
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u00A7a\u9B54\u9634\u8EAB\u751F\u6210\u500D\u7387\u5DF2\u964D\u81F30"), (false));
					if (world instanceof Level _level)
						_level.getGameRules().getRule(PrimogemcraftModGameRules.GUIZEMOYINSHENSHENGCHENGBEILV).set(0, _level.getServer());
				}
			} else {
				if (world instanceof Level _level)
					_level.getGameRules().getRule(PrimogemcraftModGameRules.GUIZEMOYINSHENSHENGCHENGBEILV).set((int) ((world.getLevelData().getGameRules().getInt(PrimogemcraftModGameRules.GUIZEMOYINSHENSHENGCHENGBEILV)) - 1), _level.getServer());
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent(("\u00A72\u9B54\u9634\u8EAB\u751F\u6210\u500D\u7387\u5DF2\u8C03\u6574\u81F3" + (world.getLevelData().getGameRules().getInt(PrimogemcraftModGameRules.GUIZEMOYINSHENSHENGCHENGBEILV)))),
							(false));
			}
		} else {
			if (world instanceof Level _level)
				_level.getGameRules().getRule(PrimogemcraftModGameRules.GUIZEMOYINSHENSHENGCHENGBEILV).set((int) ((world.getLevelData().getGameRules().getInt(PrimogemcraftModGameRules.GUIZEMOYINSHENSHENGCHENGBEILV)) + 1), _level.getServer());
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent(("\u00A7c\u9B54\u9634\u8EAB\u751F\u6210\u500D\u7387\u5DF2\u63D0\u9AD8\u81F3" + (world.getLevelData().getGameRules().getInt(PrimogemcraftModGameRules.GUIZEMOYINSHENSHENGCHENGBEILV)))),
						(false));
		}
		if (!(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
		if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.OFF_HAND, true);
		}
	}
}
