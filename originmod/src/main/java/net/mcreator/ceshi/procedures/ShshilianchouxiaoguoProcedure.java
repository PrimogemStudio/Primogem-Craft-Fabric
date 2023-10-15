package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModEntities;
import net.mcreator.ceshi.entity.QqiyuanJinGuangEntity;
import net.mcreator.ceshi.entity.QQyuanchuzi01Entity;
import net.mcreator.ceshi.entity.QQQyuanchulan01Entity;
import net.mcreator.ceshi.entity.BaiguangguodushengwuEntity;

public class ShshilianchouxiaoguoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:shilianyinpin")), SoundSource.PLAYERS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:shilianyinpin")), SoundSource.PLAYERS, 1, 1, false);
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new BaiguangguodushengwuEntity(PrimogemcraftModEntities.BAIGUANGGUODUSHENGWU.get(), _level);
			entityToSpawn.moveTo(x, (y + 10), z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (Math.random() < 0.035) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new QqiyuanJinGuangEntity(PrimogemcraftModEntities.QQIYUAN_JIN_GUANG.get(), _level);
						entityToSpawn.moveTo(x, (y + 7), z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new QQyuanchuzi01Entity(PrimogemcraftModEntities.Q_QYUANCHUZI_01.get(), _level);
						entityToSpawn.moveTo(x, (y + 7), z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
				if (Math.random() < 0.035) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new QqiyuanJinGuangEntity(PrimogemcraftModEntities.QQIYUAN_JIN_GUANG.get(), _level);
						entityToSpawn.moveTo(x, (y + 6), y, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else {
					if (Math.random() < 0.25) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQyuanchuzi01Entity(PrimogemcraftModEntities.Q_QYUANCHUZI_01.get(), _level);
							entityToSpawn.moveTo(x, (y + 6), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQQyuanchulan01Entity(PrimogemcraftModEntities.QQ_QYUANCHULAN_01.get(), _level);
							entityToSpawn.moveTo(x, (y + 6), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() < 0.035) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new QqiyuanJinGuangEntity(PrimogemcraftModEntities.QQIYUAN_JIN_GUANG.get(), _level);
						entityToSpawn.moveTo((x + 3), (y + 6), z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else {
					if (Math.random() < 0.25) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQyuanchuzi01Entity(PrimogemcraftModEntities.Q_QYUANCHUZI_01.get(), _level);
							entityToSpawn.moveTo((x + 3), (y + 6), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQQyuanchulan01Entity(PrimogemcraftModEntities.QQ_QYUANCHULAN_01.get(), _level);
							entityToSpawn.moveTo((x + 3), (y + 6), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() < 0.035) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new QqiyuanJinGuangEntity(PrimogemcraftModEntities.QQIYUAN_JIN_GUANG.get(), _level);
						entityToSpawn.moveTo(x, (y + 6), (z - 3), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else {
					if (Math.random() < 0.25) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQyuanchuzi01Entity(PrimogemcraftModEntities.Q_QYUANCHUZI_01.get(), _level);
							entityToSpawn.moveTo(x, (y + 6), (z - 3), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQQyuanchulan01Entity(PrimogemcraftModEntities.QQ_QYUANCHULAN_01.get(), _level);
							entityToSpawn.moveTo(x, (y + 6), (z - 3), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() < 0.035) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new QqiyuanJinGuangEntity(PrimogemcraftModEntities.QQIYUAN_JIN_GUANG.get(), _level);
						entityToSpawn.moveTo((x - 3), (y + 6), z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else {
					if (Math.random() < 0.25) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQyuanchuzi01Entity(PrimogemcraftModEntities.Q_QYUANCHUZI_01.get(), _level);
							entityToSpawn.moveTo((x - 3), (y + 6), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQQyuanchulan01Entity(PrimogemcraftModEntities.QQ_QYUANCHULAN_01.get(), _level);
							entityToSpawn.moveTo((x - 3), (y + 6), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() < 0.035) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new QqiyuanJinGuangEntity(PrimogemcraftModEntities.QQIYUAN_JIN_GUANG.get(), _level);
						entityToSpawn.moveTo(x, (y + 6), (z + 3), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else {
					if (Math.random() < 0.25) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQyuanchuzi01Entity(PrimogemcraftModEntities.Q_QYUANCHUZI_01.get(), _level);
							entityToSpawn.moveTo(x, (y + 6), (z + 3), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQQyuanchulan01Entity(PrimogemcraftModEntities.QQ_QYUANCHULAN_01.get(), _level);
							entityToSpawn.moveTo(x, (y + 6), (z + 3), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() < 0.035) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new QqiyuanJinGuangEntity(PrimogemcraftModEntities.QQIYUAN_JIN_GUANG.get(), _level);
						entityToSpawn.moveTo((x + 2), (y + 6), (z + 2), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else {
					if (Math.random() < 0.25) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQyuanchuzi01Entity(PrimogemcraftModEntities.Q_QYUANCHUZI_01.get(), _level);
							entityToSpawn.moveTo((x + 2), (y + 6), (z + 2), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQQyuanchulan01Entity(PrimogemcraftModEntities.QQ_QYUANCHULAN_01.get(), _level);
							entityToSpawn.moveTo((x + 2), (y + 6), (z + 2), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() < 0.035) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new QqiyuanJinGuangEntity(PrimogemcraftModEntities.QQIYUAN_JIN_GUANG.get(), _level);
						entityToSpawn.moveTo((x - 2), (y + 6), (z - 2), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else {
					if (Math.random() < 0.25) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQyuanchuzi01Entity(PrimogemcraftModEntities.Q_QYUANCHUZI_01.get(), _level);
							entityToSpawn.moveTo((x - 2), (y + 6), (z - 2), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQQyuanchulan01Entity(PrimogemcraftModEntities.QQ_QYUANCHULAN_01.get(), _level);
							entityToSpawn.moveTo((x - 2), (y + 6), (z - 2), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() < 0.035) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new QqiyuanJinGuangEntity(PrimogemcraftModEntities.QQIYUAN_JIN_GUANG.get(), _level);
						entityToSpawn.moveTo((x - 2), (y + 6), (z + 2), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else {
					if (Math.random() < 0.25) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQyuanchuzi01Entity(PrimogemcraftModEntities.Q_QYUANCHUZI_01.get(), _level);
							entityToSpawn.moveTo((x - 2), (y + 6), (z + 2), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQQyuanchulan01Entity(PrimogemcraftModEntities.QQ_QYUANCHULAN_01.get(), _level);
							entityToSpawn.moveTo((x - 2), (y + 6), (z + 2), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() < 0.035) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new QqiyuanJinGuangEntity(PrimogemcraftModEntities.QQIYUAN_JIN_GUANG.get(), _level);
						entityToSpawn.moveTo((x + 2), (y + 6), (z - 2), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else {
					if (Math.random() < 0.25) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQyuanchuzi01Entity(PrimogemcraftModEntities.Q_QYUANCHUZI_01.get(), _level);
							entityToSpawn.moveTo((x + 2), (y + 6), (z - 2), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QQQyuanchulan01Entity(PrimogemcraftModEntities.QQ_QYUANCHULAN_01.get(), _level);
							entityToSpawn.moveTo((x + 2), (y + 6), (z - 2), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 40);
	}
}
