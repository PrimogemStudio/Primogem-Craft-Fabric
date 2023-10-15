package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModItems;
import net.mcreator.ceshi.init.PrimogemcraftModEntities;
import net.mcreator.ceshi.entity.QQyuanchuzi01Entity;
import net.mcreator.ceshi.entity.QQQyuanchulan01Entity;

public class XixiangyuzhiyuanchoukaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		(new ItemStack(PrimogemcraftModItems.XIXIANGYUZHIYUAN.get())).shrink(1);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:choukaqianxi01")), SoundSource.BLOCKS, 70, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:choukaqianxi01")), SoundSource.BLOCKS, 70, 1, false);
			}
		}
		if (entity.getPersistentData().getDouble("xiangyu_baodi_zi") >= 9) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new QQyuanchuzi01Entity(PrimogemcraftModEntities.Q_QYUANCHUZI_01.get(), _level);
				entityToSpawn.moveTo(x, (y + 10), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			entity.getPersistentData().putDouble("xiangyu_baodi_zi", 0);
		} else {
			if (Math.random() < 0.1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new QQyuanchuzi01Entity(PrimogemcraftModEntities.Q_QYUANCHUZI_01.get(), _level);
					entityToSpawn.moveTo(x, (y + 10), z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				entity.getPersistentData().putDouble("xiangyu_baodi_zi", 0);
			} else {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new QQQyuanchulan01Entity(PrimogemcraftModEntities.QQ_QYUANCHULAN_01.get(), _level);
					entityToSpawn.moveTo(x, (y + 10), z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				entity.getPersistentData().putDouble("xiangyu_baodi_zi", (entity.getPersistentData().getDouble("xiangyu_baodi_zi") + 1));
			}
		}
	}
}
