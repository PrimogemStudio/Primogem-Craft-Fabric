package com.primogemstudio.primogemcraft.items.instances.materials.vajrada;

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

public class VajradaAmethystNetheriteArmorItem extends ArmorItem {
    public VajradaAmethystNetheriteArmorItem(ArmorItem.Type type, Item.Properties properties) {
        super(new ArmorMaterial() {
            @Override
            public int getDurabilityForType(ArmorItem.Type type) {
                return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 200;
            }

            @Override
            public int getDefenseForType(ArmorItem.Type type) {
                return new int[]{5, 6, 8, 5}[type.getSlot().getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 15;
            }

            @Override
            public @NotNull SoundEvent getEquipSound() {
                return SoundEvents.ARMOR_EQUIP_NETHERITE;
            }

            @Override
            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.VAJRADA_AMETHYST_FRAGMENT_ITEM), new ItemStack(Items.NETHERITE_INGOT));
            }

            @Override
            public @NotNull String getName() {
                return "vajrada_amethyst_netherite_armor";
            }

            @Override
            public float getToughness() {
                return 3f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0.1f;
            }
        }, type, properties);
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_netherite_armor.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_netherite_armor.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_netherite_armor.line3"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_netherite_armor.line4"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_netherite_armor.line5"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_netherite_armor.line6"));
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
            OnArmorTick.execute(world, entity, itemstack);
        }
    }

    public static class Chestplate extends VajradaAmethystNetheriteArmorItem {
        public Chestplate() {
            super(Type.CHESTPLATE, new Item.Properties().fireResistant());
        }
    }

    public static class Helmet extends VajradaAmethystNetheriteArmorItem {
        public Helmet() {
            super(Type.HELMET, new Item.Properties().fireResistant());
        }
    }

    public static class Leggings extends VajradaAmethystNetheriteArmorItem {
        public Leggings() {
            super(Type.LEGGINGS, new Item.Properties().fireResistant());
        }
    }

    public static class Boots extends VajradaAmethystNetheriteArmorItem {
        public Boots() {
            super(Type.BOOTS, new Item.Properties().fireResistant());
        }
    }
}