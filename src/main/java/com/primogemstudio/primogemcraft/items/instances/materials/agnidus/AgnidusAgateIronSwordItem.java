package com.primogemstudio.primogemcraft.items.instances.materials.agnidus;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AgnidusAgateIronSwordItem extends SwordItem {
    public AgnidusAgateIronSwordItem() {
        super(new Tier() {
            public int getUses() {
                return 320;
            }

            public float getSpeed() {
                return 7.5f;
            }

            public float getAttackDamageBonus() {
                return 4f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 12;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.AGNIDUS_AGATE_SLIVER_ITEM), new ItemStack(Items.IRON_INGOT));
            }
        }, 3, -2.8f, new Item.Properties().fireResistant());
    }

    @Override
    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        OnAttack.execute(entity, itemstack);
        return retval;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_iron_sword.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_iron_sword.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_iron_sword.line3"));
    }
}