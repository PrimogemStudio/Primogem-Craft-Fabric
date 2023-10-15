package net.mcreator.ceshi.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

public class ZsjgjsxProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PrimogemcraftModMobEffects.GOUYU.get()) : false)) {
			if (itemstack.getItem() == PrimogemcraftModItems.ZSTJ.get()) {
				if (Math.random() < 0.05) {
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(entity.getX(), entity.getY(), entity.getZ())));
						entityToSpawn.setVisualOnly(false);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if (itemstack.getItem() == PrimogemcraftModItems.ZSZSJ.get()) {
				if (Math.random() < 0.07) {
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(entity.getX(), entity.getY(), entity.getZ())));
						entityToSpawn.setVisualOnly(false);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if (itemstack.getItem() == PrimogemcraftModItems.ZSHJJ.get()) {
				if (Math.random() < 0.1) {
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(entity.getX(), entity.getY(), entity.getZ())));
						entityToSpawn.setVisualOnly(false);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
