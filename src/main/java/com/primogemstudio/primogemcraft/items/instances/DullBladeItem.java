package com.primogemstudio.primogemcraft.items.instances;

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

            public @NotNull Ingredient getRepairIngredient() {
                // TODO add item "摩拉原胚"
                return Ingredient.EMPTY;
            }
        }, 3, -3.95f, new Item.Properties().fireResistant());
    }
    // TODO porting to fabric/vanilla api
    public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
        ItemStack retval = new ItemStack(this);
        retval.setDamageValue(itemstack.getDamageValue() + 1);
        return retval.getDamageValue() >= retval.getMaxDamage() ? ItemStack.EMPTY : retval;
    }

    public boolean hasCraftingRemainingItem() {
        return true;
    }

    public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {
        return false;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.dull_blade.line1"));
    }
}
