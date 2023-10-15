package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.Random;

public class Axtsx3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!itemstack.getOrCreateTag().getBoolean("aixu_tao_zhi")) {
			if (itemstack.is(ItemTags.create(new ResourceLocation("primogemcraft:yuansutaotie")))) {
				itemstack.getOrCreateTag().putDouble("aixu_tao_zhi", 0.5);
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("primogemcraft:yuansutaozuanshi")))) {
				itemstack.getOrCreateTag().putDouble("aixu_tao_zhi", 1);
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("primogemcraft:yuansutaoxiajiehejin")))) {
				itemstack.getOrCreateTag().putDouble("aixu_tao_zhi", 2);
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrCreateTag().getDouble("aixu_tao_zhi")
				+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrCreateTag().getDouble("aixu_tao_zhi")
				+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("aixu_tao_zhi")
				+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("aixu_tao_zhi") >= 2) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem) {
				if (world.getLevelData().isRaining() || world.getLevelData().isThundering()) {
					if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) : false)) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60,
									(int) (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrCreateTag().getDouble("aixu_tao_zhi")
											+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrCreateTag().getDouble("aixu_tao_zhi")
											+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("aixu_tao_zhi")
											+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("aixu_tao_zhi")) * 0.5 - 3),
									(true), (false)));
					}
					if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.MOVEMENT_SPEED) : false)) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60,
									(int) (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrCreateTag().getDouble("aixu_tao_zhi")
											+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrCreateTag().getDouble("aixu_tao_zhi")
											+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("aixu_tao_zhi")
											+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("aixu_tao_zhi")) * 0.5 - 4),
									(true), (false)));
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PrimogemcraftModItems.YUANSUJINGTI.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == PrimogemcraftModItems.YUANSUJINGTI.get()) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 5, (false), (false)));
				if (Math.random() < 0.01) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (Math.random() < 0.5) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextDouble(new Random(), 1, 10)), (y + Mth.nextDouble(new Random(), 1, 10)), (z + Mth.nextDouble(new Random(), 1, 10)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextDouble(new Random(), 1, 10)), (y + Mth.nextDouble(new Random(), 1, 10)), (z + Mth.nextDouble(new Random(), 1, 10)), _ent.getYRot(), _ent.getXRot());
						}
					} else {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextDouble(new Random(), 1, 10)), (y - Mth.nextDouble(new Random(), 1, 10)), (z - Mth.nextDouble(new Random(), 1, 10)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextDouble(new Random(), 1, 10)), (y - Mth.nextDouble(new Random(), 1, 10)), (z - Mth.nextDouble(new Random(), 1, 10)), _ent.getYRot(), _ent.getXRot());
						}
					}
				}
			}
		}
	}
}
