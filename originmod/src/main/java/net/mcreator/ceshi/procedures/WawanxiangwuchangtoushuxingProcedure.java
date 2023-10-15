package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.Random;

public class WawanxiangwuchangtoushuxingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PrimogemcraftModItems.WAWANXIANGWUCHANGTOU.get()
				&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).isEnchanted()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem) {
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
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.PLAYERS, 5, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.PLAYERS, 5, 1, false);
							}
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u00A75\u7CFB\u7EDF\uFF1A\u300E\u5947\u7269\u300F\u00A72\u4E07\u8C61\u65E0\u5E38\u9AB0\u00A7c\u5DF2\u6D88\u8017"), (false));
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 1);
				if (Math.random() < 0.15) {
					((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.BANE_OF_ARTHROPODS, Mth.nextInt(new Random(), 1, 2));
				} else {
					if (Math.random() < 0.15) {
						((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.VANISHING_CURSE, 1);
					} else {
						if (Math.random() < 0.15) {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.SMITE, Mth.nextInt(new Random(), 1, 5));
						} else {
							if (Math.random() < 0.15) {
								((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.VANISHING_CURSE, Mth.nextInt(new Random(), 1, 2));
							} else {
								((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.KNOCKBACK, Mth.nextInt(new Random(), 1, 2));
							}
						}
					}
				}
				if (Math.random() < 0.15) {
					((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.MOB_LOOTING, Mth.nextInt(new Random(), 1, 3));
				} else {
					if (Math.random() < 0.15) {
						((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.MENDING, Mth.nextInt(new Random(), 1, 1));
					} else {
						if (Math.random() < 0.15) {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.SHARPNESS, Mth.nextInt(new Random(), 1, 5));
						} else {
							if (Math.random() < 0.15) {
								((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.SWEEPING_EDGE, Mth.nextInt(new Random(), 1, 3));
							} else {
								((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.UNBREAKING, Mth.nextInt(new Random(), 1, 3));
							}
						}
					}
				}
			} else {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof PickaxeItem) {
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
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("\u00A75\u7CFB\u7EDF\uFF1A\u300E\u5947\u7269\u300F\u00A72\u4E07\u8C61\u65E0\u5E38\u9AB0\u00A7c\u5DF2\u6D88\u8017"), (false));
							((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 1);
					if (Math.random() < 0.4) {
						((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.VANISHING_CURSE, Mth.nextInt(new Random(), 1, 1));
					} else {
						if (Math.random() < 0.4) {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.BLOCK_EFFICIENCY, Mth.nextInt(new Random(), 1, 5));
						} else {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.BLOCK_FORTUNE, Mth.nextInt(new Random(), 1, 3));
						}
					}
					if (Math.random() < 0.4) {
						((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.MENDING, Mth.nextInt(new Random(), 1, 1));
					} else {
						if (Math.random() < 0.4) {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.SILK_TOUCH, Mth.nextInt(new Random(), 1, 1));
						} else {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.UNBREAKING, Mth.nextInt(new Random(), 1, 3));
						}
					}
				} else {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem) {
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
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(new TextComponent("\u00A75\u7CFB\u7EDF\uFF1A\u300E\u5947\u7269\u300F\u00A72\u4E07\u8C61\u65E0\u5E38\u9AB0\u00A7c\u5DF2\u6D88\u8017"), (false));
								((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 1);
						if (Math.random() < 0.2) {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.VANISHING_CURSE, Mth.nextInt(new Random(), 1, 1));
						} else {
							if (Math.random() < 0.2) {
								((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.BLOCK_EFFICIENCY, Mth.nextInt(new Random(), 1, 5));
							} else {
								if (Math.random() < 0.2) {
									((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.BLOCK_FORTUNE, Mth.nextInt(new Random(), 1, 3));
								} else {
									if (Math.random() < 0.2) {
										((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.MENDING, Mth.nextInt(new Random(), 1, 1));
									} else {
										if (Math.random() < 0.2) {
											((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.SILK_TOUCH, Mth.nextInt(new Random(), 1, 1));
										} else {
											((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.UNBREAKING, Mth.nextInt(new Random(), 1, 3));
										}
									}
								}
							}
						}
						if (Math.random() < 0.4) {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.BANE_OF_ARTHROPODS, Mth.nextInt(new Random(), 1, 5));
						} else {
							if (Math.random() < 0.4) {
								((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.SHARPNESS, Mth.nextInt(new Random(), 1, 5));
							} else {
								((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.SMITE, Mth.nextInt(new Random(), 1, 5));
							}
						}
					} else {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof ShovelItem) {
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
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 1, 1, false);
										}
									}
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u00A75\u7CFB\u7EDF\uFF1A\u300E\u5947\u7269\u300F\u00A72\u4E07\u8C61\u65E0\u5E38\u9AB0\u00A7c\u5DF2\u6D88\u8017"), (false));
									((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 1);
							if (Math.random() < 0.4) {
								((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.VANISHING_CURSE, Mth.nextInt(new Random(), 1, 1));
							} else {
								if (Math.random() < 0.4) {
									((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.BLOCK_EFFICIENCY, Mth.nextInt(new Random(), 1, 5));
								} else {
									((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.BLOCK_FORTUNE, Mth.nextInt(new Random(), 1, 3));
								}
							}
							if (Math.random() < 0.4) {
								((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.MENDING, Mth.nextInt(new Random(), 1, 1));
							} else {
								if (Math.random() < 0.4) {
									((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.SILK_TOUCH, Mth.nextInt(new Random(), 1, 1));
								} else {
									((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.UNBREAKING, Mth.nextInt(new Random(), 1, 3));
								}
							}
						} else {
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof HoeItem) {
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
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 1, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 1, 1, false);
											}
										}
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u00A75\u7CFB\u7EDF\uFF1A\u300E\u5947\u7269\u300F\u00A72\u4E07\u8C61\u65E0\u5E38\u9AB0\u00A7c\u5DF2\u6D88\u8017"), (false));
										((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 1);
								if (Math.random() < 0.4) {
									((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.MENDING, Mth.nextInt(new Random(), 1, 1));
								} else {
									if (Math.random() < 0.4) {
										((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.SILK_TOUCH, Mth.nextInt(new Random(), 1, 1));
									} else {
										((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.UNBREAKING, Mth.nextInt(new Random(), 1, 3));
									}
								}
								if (Math.random() < 0.4) {
									((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.VANISHING_CURSE, Mth.nextInt(new Random(), 1, 1));
								} else {
									if (Math.random() < 0.4) {
										((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.BLOCK_EFFICIENCY, Mth.nextInt(new Random(), 1, 5));
									} else {
										((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.BLOCK_FORTUNE, Mth.nextInt(new Random(), 1, 5));
									}
								}
							} else {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(new TextComponent("\u00A75\u7CFB\u7EDF\uFF1A\u300E\u5947\u7269\u300F\u00A72\u4E07\u8C61\u65E0\u5E38\u9AB0\u00A7c\u4E00\u9AB0\u96FE\u6C34"), (false));
							}
						}
					}
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u00A75\u7CFB\u7EDF\uFF1A\u300E\u5947\u7269\u300F\u00A72\u4E07\u8C61\u65E0\u5E38\u9AB0\u00A7c\u4E00\u8138\u61F5\u54D4\u54E9"), (false));
		}
	}
}
