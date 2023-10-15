package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModBlocks;

import java.util.Random;

public class SzqsxProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.OFF_HAND, true);
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 10);
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qianye_chufa")), SoundSource.NEUTRAL, (float) 0.3, 5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qianye_chufa")), SoundSource.NEUTRAL, (float) 0.3, 5, false);
				}
			}
			if (Math.random() < 0.2) {
				world.setBlock(new BlockPos(x, y, z), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
			} else {
				if (Math.random() < 0.2) {
					world.setBlock(new BlockPos(x, y, z), Blocks.DIRT_PATH.defaultBlockState(), 3);
				} else {
					if (Math.random() < 0.2) {
						world.setBlock(new BlockPos(x, y, z), Blocks.MYCELIUM.defaultBlockState(), 3);
					} else {
						if (Math.random() < 0.2) {
							world.setBlock(new BlockPos(x, y, z), Blocks.DIRT.defaultBlockState(), 3);
						} else {
							if (Math.random() < 0.2) {
								world.setBlock(new BlockPos(x, y, z), Blocks.COARSE_DIRT.defaultBlockState(), 3);
							} else {
								if (Math.random() < 0.2) {
									world.setBlock(new BlockPos(x, y, z), Blocks.PODZOL.defaultBlockState(), 3);
								} else {
									if (Math.random() < 0.2) {
										world.setBlock(new BlockPos(x, y, z), Blocks.FARMLAND.defaultBlockState(), 3);
									} else {
										if (Math.random() < 0.02) {
											world.setBlock(new BlockPos(x, y, z), PrimogemcraftModBlocks.SHENGZHANGKUANGSHI.get().defaultBlockState(), 3);
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
