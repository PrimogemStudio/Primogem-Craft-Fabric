package com.primogemstudio.primogemcraft.items.instances.materials.vajrada;

import com.primogemstudio.primogemcraft.effects.PrimogemCraftMobEffects;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class OnArmorTick {
    public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
        if (!itemstack.getOrCreateTag().getBoolean("armor_value")) {
            if (itemstack.is(TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "element_iron")))) itemstack.getOrCreateTag().putDouble("armor_value", 0.5);
            if (itemstack.is(TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "element_diamond")))) itemstack.getOrCreateTag().putDouble("armor_value", 1);
            if (itemstack.is(TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "element_netherite")))) itemstack.getOrCreateTag().putDouble("armor_value", 2);
        }
        LivingEntity livEnt = (LivingEntity) entity;
        double armor_value =
                livEnt.getItemBySlot(EquipmentSlot.FEET).getOrCreateTag().getDouble("armor_value")
                + livEnt.getItemBySlot(EquipmentSlot.LEGS).getOrCreateTag().getDouble("armor_value")
                + livEnt.getItemBySlot(EquipmentSlot.CHEST).getOrCreateTag().getDouble("armor_value")
                + livEnt.getItemBySlot(EquipmentSlot.HEAD).getOrCreateTag().getDouble("armor_value");
        if (livEnt.hasEffect(PrimogemCraftMobEffects.AMULATE) && armor_value >= 2 && !entity.level().isClientSide()) {
            livEnt.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60,
                    (int) (armor_value - 6),
                    true, false));
        }
        if ((world.getLevelData().isRaining() || world.getLevelData().isThundering()) && armor_value >= 4 && !livEnt.level().isClientSide()) {
            livEnt.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60,
                    (int) (armor_value * 0.5 - 2),
                    true, false));
            livEnt.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60,
                    (int) (armor_value * 0.5 - 3),
                    true, false));
        }
    }
}
