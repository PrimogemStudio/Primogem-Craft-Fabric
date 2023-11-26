package com.primogemstudio.primogemcraft.items.instances.materials.vayuda;

import com.google.common.collect.Iterables;
import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class VayudaTurquoiseGemstoneIronArmorItem extends ArmorItem {
    public VayudaTurquoiseGemstoneIronArmorItem(Type type, Properties properties) {
        super(new ArmorMaterial() {

            @Override
            public int getDurabilityForType(Type type) {
                return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 21;
            }

            @Override
            public int getDefenseForType(Type type) {
                return new int[]{3, 6, 7, 3}[type.getSlot().getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 18;
            }

            @Override
            public @NotNull SoundEvent getEquipSound() {
                return SoundEvents.ARMOR_EQUIP_NETHERITE;
            }

            @Override
            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.VAYUDA_TURQUOISE_GEMSTONE_FRAGMENT), new ItemStack(Items.NETHERITE_INGOT));
            }

            @Override
            public @NotNull String getName() {
                return "vayuda_turquoise_gemstone_iron_armor";
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

    @Override
    public void onUseTick(Level level, LivingEntity livingEntity, ItemStack stack, int remainingUseDuration) {
        super.onUseTick(level, livingEntity, stack, remainingUseDuration);
        OnArmorTick.execute(livingEntity, stack);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        super.inventoryTick(stack, level, entity, slotId, isSelected);
        if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), stack)) {
            OnArmorTick.execute(player, stack);
        }
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> list, TooltipFlag isAdvanced) {
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_iron_armor.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_iron_armor.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_iron_armor.line3"));
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_iron_armor.line4"));
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_iron_armor.line5"));
    }

    public static class Helmet extends VayudaTurquoiseGemstoneIronArmorItem {
        public Helmet() {
            super(Type.HELMET, new Properties().fireResistant());
        }
    }

    public static class Chestplate extends VayudaTurquoiseGemstoneIronArmorItem {
        public Chestplate() {
            super(Type.CHESTPLATE, new Properties().fireResistant());
        }
    }

    public static class Leggings extends VayudaTurquoiseGemstoneIronArmorItem {
        public Leggings() {
            super(Type.LEGGINGS, new Properties().fireResistant());
        }
    }

    public static class Boots extends VayudaTurquoiseGemstoneIronArmorItem {
        public Boots() {
            super(Type.BOOTS, new Properties().fireResistant());
        }
    }
}