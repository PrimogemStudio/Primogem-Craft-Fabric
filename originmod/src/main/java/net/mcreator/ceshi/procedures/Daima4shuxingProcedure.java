package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;

import java.util.Random;

public class Daima4shuxingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		JinzhifumoProcedure.execute(world, x, y, z, entity, itemstack);
		Luandaima_shuxingProcedure.execute(itemstack);
		NaijiuxianzhishuchuProcedure.execute(itemstack);
		if (entity.getPersistentData().getBoolean("daima4_naijiu")) {
			(itemstack).setDamageValue((int) ((itemstack).getDamageValue() - 1));
			NaijiuxianzhiProcedure.execute(itemstack);
			entity.getPersistentData().putBoolean("daima4_naijiu", (false));
		}
		if (!itemstack.getOrCreateTag().getBoolean("daishanchu") && (itemstack).getDamageValue() == 0) {
			itemstack.getOrCreateTag().putBoolean("daima4_yixiufu", (true));
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u00A75\u300E\u5947\u7269\u300F\u00A7f\u7CBE\u786E\u4F18\u96C5\u7684\u4EE3\u7801\u00A7a\u4FEE\u590D\u5B8C\u6210"), (false));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
		}
		if (itemstack.getOrCreateTag().getBoolean("daima4_yixiufu")) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PrimogemcraftModMobEffects.JINGQUEDAIMA.get()) : false)) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.JINGQUEDAIMA.get(), 200, 0, (false), (false)));
				{
					ItemStack _ist = itemstack;
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				NaijiuxianzhiProcedure.execute(itemstack);
			}
		}
		if (!itemstack.getOrCreateTag().getBoolean("daishanchu") && (itemstack).getDamageValue() == (itemstack).getMaxDamage()) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u00A75\u300E\u5947\u7269\u300F\u00A7f\u7CBE\u786E\u4F18\u96C5\u7684\u4EE3\u7801\u00A7c\u5DF2\u8017\u5C3D\uFF01"), (false));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.PLAYERS, 1, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.PLAYERS, 1, (float) 0.5, false);
				}
			}
		}
	}
}
