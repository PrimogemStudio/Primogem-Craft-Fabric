package com.primogemstudio.primogemcraft.items.instances.mora;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public class MoraArmorItem extends ArmorItem {
    public MoraArmorItem(Type type, Item.Properties properties) {
        super(new ArmorMaterial() {
            @Override
            public int getDefenseForType(Type type) {
                return new int[]{3, 6, 10, 4}[type.getSlot().getIndex()];
            }

            @Override
            public int getDurabilityForType(Type type) {
                return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 25;
            }

            @Override
            public int getEnchantmentValue() {
                return 20;
            }

            @Override
            public @NotNull SoundEvent getEquipSound() {
                return SoundEvent.createVariableRangeEvent(new ResourceLocation(""));
            }

            @Override
            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.MORA_BUNCH_BLOCK_ITEM));
            }

            @Override
            public @NotNull String getName() {
                return "mora_armor";
            }

            @Override
            public float getToughness() {
                return 4f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0.2f;
            }
        }, type, properties);
    }

    public static class MoraHelmet extends MoraArmorItem {
        public MoraHelmet() {
            super(Type.HELMET, new Properties());
        }
    }

    public static class MoraChestplate extends MoraArmorItem {
        public MoraChestplate() {
            super(Type.CHESTPLATE, new Properties());
        }
    }

    public static class MoraLeggings extends MoraArmorItem {
        public MoraLeggings() {
            super(Type.LEGGINGS, new Properties());
        }
    }

    public static class MoraBoots extends MoraArmorItem {
        public MoraBoots() {
            super(Type.BOOTS, new Properties());
        }
    }
}
