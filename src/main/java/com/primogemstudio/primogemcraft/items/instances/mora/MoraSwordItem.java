package com.primogemstudio.primogemcraft.items.instances.mora;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public class MoraSwordItem extends SwordItem {
    public MoraSwordItem() {
        super(new Tier() {
            public int getUses() {
                return 560;
            }

            public float getSpeed() {
                return 7f;
            }

            public float getAttackDamageBonus() {
                return 2.5f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 20;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.MORA_ITEM));
            }
        }, 3, -2.4f, new Item.Properties());
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        var retval = new ItemStack(this);
        retval.setDamageValue(stack.getDamageValue() + 1);
        if (retval.getDamageValue() >= retval.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retval;
    }

    public boolean hasCraftingRemainingItem() {
        return true;
    }
}
