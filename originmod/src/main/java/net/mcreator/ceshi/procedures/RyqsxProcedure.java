package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModBlocks;

import java.util.Random;

public class RyqsxProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CLAY || (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CLAY) {
					if (Math.random() < 0.5) {
						world.setBlock(new BlockPos(x, y, z), Blocks.BRICKS.defaultBlockState(), 3);
					}
					{
						ItemStack _ist = itemstack;
						if (_ist.hurt(1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				}
				if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
					{
						ItemStack _ist = itemstack;
						if (_ist.hurt(1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					if (Math.random() < 0.1) {
						world.setBlock(new BlockPos(x, y, z), PrimogemcraftModBlocks.MUTANKUAI.get().defaultBlockState(), 3);
					} else {
						if (Math.random() < 0.7) {
							world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					}
				}
			}
		}
	}
}
