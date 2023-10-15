package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.Random;

public class ZizaijianshuxingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == PrimogemcraftModItems.ZIZAITIEJIAN.get()) {
			if (Math.random() < 0.25) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 2, 20, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 60, 0, (false), (false)));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.riptide_2")), SoundSource.PLAYERS, (float) 0.5, (float) Mth.nextDouble(new Random(), 1.5, 3));
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.riptide_2")), SoundSource.PLAYERS, (float) 0.5, (float) Mth.nextDouble(new Random(), 1.5, 3), false);
					}
				}
			}
		}
		if (itemstack.getItem() == PrimogemcraftModItems.ZIZAIZUANSHIJIAN.get()) {
			if (Math.random() < 0.5) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 2, 45, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 60, 0, (false), (false)));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.riptide_2")), SoundSource.PLAYERS, (float) 0.5, (float) Mth.nextDouble(new Random(), 1.5, 3));
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.riptide_2")), SoundSource.PLAYERS, (float) 0.5, (float) Mth.nextDouble(new Random(), 1.5, 3), false);
					}
				}
			}
		}
		if (itemstack.getItem() == PrimogemcraftModItems.ZIZAIHEJINJIAN.get()) {
			if (Math.random() < 0.75) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 2, 60, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 60, 0, (false), (false)));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.riptide_2")), SoundSource.PLAYERS, (float) 0.5, (float) Mth.nextDouble(new Random(), 1.5, 3));
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.riptide_2")), SoundSource.PLAYERS, (float) 0.5, (float) Mth.nextDouble(new Random(), 1.5, 3), false);
					}
				}
			}
		}
	}
}
