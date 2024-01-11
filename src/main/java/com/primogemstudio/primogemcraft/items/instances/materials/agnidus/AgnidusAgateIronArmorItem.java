package com.primogemstudio.primogemcraft.items.instances.materials.agnidus;

import com.google.common.collect.Iterables;
import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AgnidusAgateIronArmorItem extends ArmorItem {
    public AgnidusAgateIronArmorItem(ArmorItem.Type type, Item.Properties properties) {
        super(new ArmorMaterial() {
            @Override
            public int getDurabilityForType(ArmorItem.Type type) {
                return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 25;
            }

            @Override
            public int getDefenseForType(ArmorItem.Type type) {
                return new int[]{3, 6, 7, 3}[type.getSlot().getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 9;
            }

            @Override
            public @NotNull SoundEvent getEquipSound() {
                return SoundEvents.ARMOR_EQUIP_IRON;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.IRON_INGOT), new ItemStack(PrimogemCraftItems.AGNIDUS_AGATE_SLIVER_ITEM));
            }

            @Override
            public @NotNull String getName() {
                return "agnidus_agate_iron_armor";
            }

            @Override
            public float getToughness() {
                return 0f;
            }

            @Override
            public float getKnockbackResistance() {
                return 1f;
            }
        }, type, properties);
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_iron_armor.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_iron_armor.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_iron_armor.line3"));
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_iron_armor.line4"));
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_iron_armor.line5"));
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
            OnArmorTick.execute(player, itemstack);
        }
    }

    public static class Helmet extends AgnidusAgateIronArmorItem {
        public Helmet() {
            super(ArmorItem.Type.HELMET, new Item.Properties().fireResistant());
        }
    }

    public static class Chestplate extends AgnidusAgateIronArmorItem {
        public Chestplate() {
            super(ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant());
        }
    }

    public static class Leggings extends AgnidusAgateIronArmorItem {
        public Leggings() {
            super(ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant());
        }
    }

    public static class Boots extends AgnidusAgateIronArmorItem {
        public Boots() {
            super(ArmorItem.Type.BOOTS, new Item.Properties().fireResistant());
        }
    }
}
