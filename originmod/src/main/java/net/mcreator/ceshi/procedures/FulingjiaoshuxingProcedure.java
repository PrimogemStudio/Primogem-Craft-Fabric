package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

public class FulingjiaoshuxingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PrimogemcraftModItems.FULINJIAO.get()
				&& (((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).isEnchantable() || ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).isEnchanted())) {
			((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u00A75\u7CFB\u7EDF\u00A7a\u6253\u80F6\u5B8C\u6210\uFF01"), (false));
			if (Math.random() < 0.12) {
				((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.DEPTH_STRIDER, 3);
			} else {
				if (Math.random() < 0.12) {
					((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.BLOCK_FORTUNE, 3);
				} else {
					if (Math.random() < 0.12) {
						((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.MOB_LOOTING, 3);
					} else {
						if (Math.random() < 0.12) {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.LOYALTY, 3);
						} else {
							if (Math.random() < 0.12) {
								((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.FISHING_LUCK, 3);
							} else {
								if (Math.random() < 0.12) {
									((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.FISHING_SPEED, 3);
								} else {
									if (Math.random() < 0.12) {
										((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.QUICK_CHARGE, 3);
									} else {
										if (Math.random() < 0.12) {
											((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.RESPIRATION, 3);
										} else {
											if (Math.random() < 0.12) {
												((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.RIPTIDE, 3);
											} else {
												if (Math.random() < 0.12) {
													((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.SOUL_SPEED, 3);
												} else {
													if (Math.random() < 0.12) {
														((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.SWEEPING_EDGE, 3);
													} else {
														if (Math.random() < 0.12) {
															((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.THORNS, 3);
														} else {
															((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).enchant(Enchantments.UNBREAKING, 3);
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u00A75\u7CFB\u7EDF\u00A7c\u6CA1\u6709\u4F7F\u7528\u5BF9\u8C61"), (false));
		}
	}
}
