package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.Random;

public class JjlcjlqsxProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == PrimogemcraftModItems.JLQ.get() && entity.isShiftKeyDown()) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, Mth.nextInt(new Random(), 2, 8), Explosion.BlockInteraction.BREAK);
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(Mth.nextInt(new Random(), 10, 40), new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), Mth.nextInt(new Random(), 160, 320));
		}
		if (itemstack.getItem() == PrimogemcraftModItems.JLC.get()) {
			if (Math.random() < 0.001) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(PrimogemcraftModItems.JIANLAOHUANGYU.get()));
					entityToSpawn.setPickUpDelay(0);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
