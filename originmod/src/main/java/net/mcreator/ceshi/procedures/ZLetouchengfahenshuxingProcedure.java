package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;

public class ZLetouchengfahenshuxingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
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
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > 1) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(1);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.MILK_BUCKET
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.MILK_BUCKET) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(Items.MILK_BUCKET, 20000000);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) == 0) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(Items.MILK_BUCKET, 1);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 1) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PrimogemcraftModMobEffects.LETOUDECHENGFA.get());
			}
		}
	}
}
