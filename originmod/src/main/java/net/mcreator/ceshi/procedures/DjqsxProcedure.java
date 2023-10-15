package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class DjqsxProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DIRT || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DIRT_PATH) {
				world.setBlock(new BlockPos(x, y, z), Blocks.CLAY.defaultBlockState(), 3);
				{
					ItemStack _ist = itemstack;
					if (_ist.hurt(10, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.hoe.till")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.hoe.till")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				if (Math.random() < 0.25) {
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CLAY) {
				world.setBlock(new BlockPos(x, y, z), Blocks.SAND.defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.hoe.till")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.hoe.till")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				{
					ItemStack _ist = itemstack;
					if (_ist.hurt(10, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (Math.random() < 0.25) {
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			}
			DiaoyonghuishouProcedure.execute(entity, itemstack);
		}
	}
}
