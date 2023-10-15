package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

public class Zsqsx2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (itemstack.getOrCreateTag().getBoolean("zsq_sx_0")) {
				itemstack.getOrCreateTag().putDouble("zsq_sx", (itemstack.getOrCreateTag().getDouble("zsq_sx") - 10));
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent(("\u00A7c\u6548\u679C\u5EF6\u8FDF" + itemstack.getOrCreateTag().getDouble("zsq_sx") + "\u79D2\uFF01")), (true));
			} else {
				itemstack.getOrCreateTag().putDouble("zsq_sx", (itemstack.getOrCreateTag().getDouble("zsq_sx") + 10));
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent(("\u00A7a\u6548\u679C\u5EF6\u8FDF" + itemstack.getOrCreateTag().getDouble("zsq_sx") + "\u79D2\uFF01")), (true));
			}
			if (itemstack.getOrCreateTag().getDouble("zsq_sx") >= 40) {
				itemstack.getOrCreateTag().putBoolean("zsq_sx_0", (true));
			} else if (itemstack.getOrCreateTag().getDouble("zsq_sx") <= 10) {
				itemstack.getOrCreateTag().putBoolean("zsq_sx_0", (false));
			}
		}
	}
}
