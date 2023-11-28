package com.primogemstudio.primogemcraft.items.instances;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DullBladeItem extends SwordItem {
    public DullBladeItem() {
        super(new Tier() {
            public int getUses() {
                return 20;
            }

            public float getSpeed() {
                return 4f;
            }

            public float getAttackDamageBonus() {
                return 14.599999999999998f;
            }

            public int getLevel() {
                return 1;
            }

            public int getEnchantmentValue() {
                return 15;
            }

            @NotNull
            public Ingredient getRepairIngredient() {
                return Ingredient.of(PrimogemCraftItems.MORA_BILLET_ITEM);
            }
        }, 3, -3.95f, new Item.Properties().fireResistant());
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        var ret = new ItemStack(this);
        ret.setDamageValue(stack.getDamageValue() + 1);
        return ret.getDamageValue() >= ret.getMaxDamage() ? ItemStack.EMPTY : ret;
    }

    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.dull_blade.line1"));
    }
}
