package com.primogemstudio.primogemcraft.items.instances.materials.vayuda;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class OnArmorTick {
    public static void execute(LivingEntity entity, ItemStack itemstack) {
        if (entity == null)
            return;
        if (!itemstack.getOrCreateTag().getBoolean("armor_value")) {
            if (itemstack.is(TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "element_iron")))) itemstack.getOrCreateTag().putDouble("armor_value", 0.5);
            if (itemstack.is(TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "element_diamond")))) itemstack.getOrCreateTag().putDouble("armor_value", 1);
            if (itemstack.is(TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "element_netherite")))) itemstack.getOrCreateTag().putDouble("armor_value", 2);
        }
        double armor_value =
                entity.getItemBySlot(EquipmentSlot.FEET).getOrCreateTag().getDouble("armor_value")
                + entity.getItemBySlot(EquipmentSlot.LEGS).getOrCreateTag().getDouble("armor_value")
                + entity.getItemBySlot(EquipmentSlot.CHEST).getOrCreateTag().getDouble("armor_value")
                + entity.getItemBySlot(EquipmentSlot.HEAD).getOrCreateTag().getDouble("armor_value");
        if (!entity.hasEffect(MobEffects.SLOW_FALLING) && armor_value >= 2) {
            entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 100,
                    (int) (armor_value * 0.5 - 1), true, false));
        }
        if (!entity.hasEffect(MobEffects.JUMP) && armor_value >= 4) {
            entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 100,
                            (int) (armor_value * 0.5 - 1),
                            true, false));
        }
    }
}
