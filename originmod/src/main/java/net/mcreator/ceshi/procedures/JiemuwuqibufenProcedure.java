package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModEnchantments;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class JiemuwuqibufenProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource().getDirectEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity, Entity sourceentity) {
		execute(null, world, x, y, z, immediatesourceentity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity immediatesourceentity, Entity sourceentity) {
		if (immediatesourceentity == null || sourceentity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(PrimogemcraftModEnchantments.CESHIFUMO_01.get(), (immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
				&& ((immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))
						.getDamageValue() > ((immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getMaxDamage() - 2) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (EnchantmentHelper.getItemEnchantmentLevel(PrimogemcraftModEnchantments.CESHIFUMO_01.get(), (immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1) {
				((immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))
						.setDamageValue((int) (((immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getMaxDamage() * 0.9));
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
					if (_enchantments.containsKey(PrimogemcraftModEnchantments.CESHIFUMO_01.get())) {
						_enchantments.remove(PrimogemcraftModEnchantments.CESHIFUMO_01.get());
						EnchantmentHelper.setEnchantments(_enchantments, (immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
					}
				}
			}
			if (EnchantmentHelper.getItemEnchantmentLevel(PrimogemcraftModEnchantments.CESHIFUMO_01.get(), (immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2) {
				((immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))
						.setDamageValue((int) (((immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getMaxDamage() * 0.75));
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
					if (_enchantments.containsKey(PrimogemcraftModEnchantments.CESHIFUMO_01.get())) {
						_enchantments.remove(PrimogemcraftModEnchantments.CESHIFUMO_01.get());
						EnchantmentHelper.setEnchantments(_enchantments, (immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
					}
				}
			}
			if (EnchantmentHelper.getItemEnchantmentLevel(PrimogemcraftModEnchantments.CESHIFUMO_01.get(), (immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3) {
				((immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))
						.setDamageValue((int) (((immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getMaxDamage() * 0.5));
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
					if (_enchantments.containsKey(PrimogemcraftModEnchantments.CESHIFUMO_01.get())) {
						_enchantments.remove(PrimogemcraftModEnchantments.CESHIFUMO_01.get());
						EnchantmentHelper.setEnchantments(_enchantments, (immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
					}
				}
			}
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(PrimogemcraftModEnchantments.CESHIFUMO_01.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
				&& ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getDamageValue() > ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getMaxDamage() - 2) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (EnchantmentHelper.getItemEnchantmentLevel(PrimogemcraftModEnchantments.CESHIFUMO_01.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))
						.setDamageValue((int) (((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getMaxDamage() * 0.9));
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
					if (_enchantments.containsKey(PrimogemcraftModEnchantments.CESHIFUMO_01.get())) {
						_enchantments.remove(PrimogemcraftModEnchantments.CESHIFUMO_01.get());
						EnchantmentHelper.setEnchantments(_enchantments, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
					}
				}
			}
			if (EnchantmentHelper.getItemEnchantmentLevel(PrimogemcraftModEnchantments.CESHIFUMO_01.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))
						.setDamageValue((int) (((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getMaxDamage() * 0.75));
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
					if (_enchantments.containsKey(PrimogemcraftModEnchantments.CESHIFUMO_01.get())) {
						_enchantments.remove(PrimogemcraftModEnchantments.CESHIFUMO_01.get());
						EnchantmentHelper.setEnchantments(_enchantments, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
					}
				}
			}
			if (EnchantmentHelper.getItemEnchantmentLevel(PrimogemcraftModEnchantments.CESHIFUMO_01.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))
						.setDamageValue((int) (((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getMaxDamage() * 0.5));
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
					if (_enchantments.containsKey(PrimogemcraftModEnchantments.CESHIFUMO_01.get())) {
						_enchantments.remove(PrimogemcraftModEnchantments.CESHIFUMO_01.get());
						EnchantmentHelper.setEnchantments(_enchantments, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
					}
				}
			}
		}
	}
}
