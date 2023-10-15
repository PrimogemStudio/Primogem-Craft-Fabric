package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModBlocks;

import java.util.Random;

public class JlgsxProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:stone"))) || (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:stone_bricks")))
					|| (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:cobblestone")))) {
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt((int) Mth.nextDouble(new Random(), 1, 5), new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 400);
				if (Math.random() < 0.6) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.BLOCKS, (float) 0.5, 2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.BLOCKS, (float) 0.5, 2, false);
						}
					}
					if (Math.random() < 0.03) {
						world.setBlock(new BlockPos(x, y, z), PrimogemcraftModBlocks.LIANJIAXIAJIEHEJINKUAI.get().defaultBlockState(), 3);
					} else {
						if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.POLISHED_DEEPSLATE || (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:ore_bearing_ground/deepslate")))
								|| (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:cobblestone/deepslate")))) {
							world.setBlock(new BlockPos(x, y, z), Blocks.DEEPSLATE_GOLD_ORE.defaultBlockState(), 3);
						} else {
							world.setBlock(new BlockPos(x, y, z), Blocks.GOLD_ORE.defaultBlockState(), 3);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.deactivate")), SoundSource.BLOCKS, (float) 0.5, 2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.deactivate")), SoundSource.BLOCKS, (float) 0.5, 2, false);
						}
					}
				}
			}
		}
	}
}
