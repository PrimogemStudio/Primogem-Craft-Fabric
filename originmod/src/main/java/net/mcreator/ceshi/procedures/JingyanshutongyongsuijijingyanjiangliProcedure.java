package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.Random;

public class JingyanshutongyongsuijijingyanjiangliProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!itemstack.getOrCreateTag().getBoolean("jingyanshu_naijiu")) {
			if (Math.random() < 0.6) {
				(itemstack).setDamageValue((int) ((itemstack).getMaxDamage() - ((itemstack).getMaxDamage() - 1) * Mth.nextDouble(new Random(), 0.1, 0.5)));
			} else {
				(itemstack).setDamageValue((int) ((itemstack).getMaxDamage() - ((itemstack).getMaxDamage() - 1) * Mth.nextDouble(new Random(), 0.1, 1)));
			}
			itemstack.getOrCreateTag().putDouble("naijiu_xianzhi", ((itemstack).getMaxDamage() - (itemstack).getDamageValue()));
			itemstack.getOrCreateTag().putBoolean("jingyanshu_naijiu", (true));
		}
		if ((itemstack).isEnchanted()) {
			if (itemstack.getItem() == PrimogemcraftModItems.JIANGLILIULANGZHEJINGYAN.get()) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = itemstack;
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(PrimogemcraftModItems.LIULANGZHEDEJINGYAN.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (itemstack.getItem() == PrimogemcraftModItems.JIANGLIMAOXIANJIAJINGYAN.get()) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = itemstack;
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(PrimogemcraftModItems.MAOXIANJIADEJINGYAN.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (itemstack.getItem() == PrimogemcraftModItems.JIANGLIDAYINXIONGJINGYAN.get()) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = itemstack;
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(PrimogemcraftModItems.DAYINGXIONGDEJINGYAN.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if ((itemstack).getMaxDamage() - (itemstack).getDamageValue() != itemstack.getOrCreateTag().getDouble("naijiu_xianzhi")) {
			(itemstack).setDamageValue((int) ((itemstack).getMaxDamage() - itemstack.getOrCreateTag().getDouble("naijiu_xianzhi")));
		}
	}
}
