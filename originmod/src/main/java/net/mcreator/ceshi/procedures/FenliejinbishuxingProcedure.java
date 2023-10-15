package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

public class FenliejinbishuxingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		JinzhifumoProcedure.execute(world, x, y, z, entity, itemstack);
		if ((itemstack).getDamageValue() == 0) {
			(itemstack).setDamageValue(11);
		}
		itemstack.getOrCreateTag().putDouble("jishu", (itemstack.getOrCreateTag().getDouble("jishu") + 1));
		if (itemstack.getOrCreateTag().getDouble("jishu") >= 120) {
			(itemstack).setDamageValue((int) ((itemstack).getDamageValue() - 1));
			itemstack.getOrCreateTag().putDouble("jishu", 0);
		}
		if ((itemstack).getDamageValue() == 1) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(PrimogemcraftModItems.YUZHOUSUIPIAN.get()));
				entityToSpawn.setPickUpDelay(0);
				_level.addFreshEntity(entityToSpawn);
			}
			(itemstack).setDamageValue(11);
			if (Math.random() < 0.5) {
				itemstack.getOrCreateTag().putDouble("shouming", (itemstack.getOrCreateTag().getDouble("shouming") + 1));
			}
		}
		if (!itemstack.getOrCreateTag().getBoolean("daishanchu") && itemstack.getOrCreateTag().getDouble("shouming") == 10) {
			(itemstack).shrink(1);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u00A75\u300E\u5947\u7269\u300F\u00A7e\u5206\u88C2\u91D1\u5E01\u00A7c\u5DF2\u635F\u574F\uFF01"), (false));
		}
	}
}
