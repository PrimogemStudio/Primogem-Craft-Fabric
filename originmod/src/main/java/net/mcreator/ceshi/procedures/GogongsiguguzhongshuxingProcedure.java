package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class GogongsiguguzhongshuxingProcedure {
	@SubscribeEvent
	public static void onPickup(EntityItemPickupEvent event) {
		execute(event, event.getPlayer().level, event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), event.getPlayer(), event.getItem().getItem());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		execute(null, world, x, y, z, entity, itemstack);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == PrimogemcraftModItems.GONGSIDEGUGUZHONG.get()) {
			if ((itemstack).getDamageValue() == 0 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 1) {
				if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 10 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 1) {
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(10));
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u00A75\u7CFB\u7EDF\uFF1A\u00A7c\u4F60\u88AB\u00A75\u300E\u5947\u7269\u300F\u00A79\u516C\u53F8\u5495\u5495\u949F\u00A7c\u69A8\u5E72\u4E86\uFF01"), (false));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 4, (float) 0.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 4, (float) 0.5, false);
						}
					}
				} else {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 10 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 20) {
						if (entity instanceof Player _player)
							_player.giveExperienceLevels(-((int) Mth.nextDouble(new Random(), 5, 8)));
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(
									new TextComponent("\u00A75\u7CFB\u7EDF\uFF1A\u00A7c\u4F60\u88AB\u00A75\u300E\u5947\u7269\u300F\u00A79\u516C\u53F8\u5495\u5495\u949F\u00A7c\u538B\u69A8\u4E86\u00A7a\u7ECF\u9A8C\u7B49\u7EA7\uFF01"), (false));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 4, (float) 0.5);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 4, (float) 0.5, false);
							}
						}
					} else {
						if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 20 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 30) {
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Mth.nextDouble(new Random(), 3, 6)));
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(
										new TextComponent("\u00A75\u7CFB\u7EDF\uFF1A\u00A7c\u4F60\u88AB\u00A75\u300E\u5947\u7269\u300F\u00A79\u516C\u53F8\u5495\u5495\u949F\u00A7c\u538B\u69A8\u4E86\u00A7a\u7ECF\u9A8C\u7B49\u7EA7\uFF01"), (false));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 4, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 4, (float) 0.5, false);
								}
							}
						} else {
							if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 30) {
								if (entity instanceof Player _player)
									_player.giveExperienceLevels(-(1000));
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
										if (entity instanceof Player _player)
											_player.giveExperienceLevels(27);
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 4, (float) 0.5);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 4, (float) 0.5, false);
											}
										}
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													new TextComponent(
															"\u00A75\u7CFB\u7EDF\uFF1A\u00A7c\u4F60\u88AB\u00A75\u300E\u5947\u7269\u300F\u00A79\u516C\u53F8\u5495\u5495\u949F\u00A7c\u89C4\u8303\u4E86\u00A7a\u7ECF\u9A8C\u7B49\u7EA7\u00A74\uFF01"),
													(false));
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 1);
							}
						}
					}
				}
				{
					ItemStack _ist = itemstack;
					if (_ist.hurt(2232, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			}
		}
	}
}
