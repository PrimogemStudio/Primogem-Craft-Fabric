package com.primogemstudio.primogemcraft.items.instances.primogem;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public class PrimogemAxeItem extends AxeItem {
    public PrimogemAxeItem() {
        super(new Tier() {
            public int getUses() {
                return 320;
            }

            public float getSpeed() {
                return 8.5f;
            }

            public float getAttackDamageBonus() {
                return 7.5f;
            }

            public int getLevel() {
                return 1;
            }

            public int getEnchantmentValue() {
                return 15;
            }

            @NotNull
            public Ingredient getRepairIngredient() {
                return Ingredient.of(PrimogemCraftItems.PRIMOGEM);
            }
        }, 1, -3f, new Item.Properties().fireResistant());
    }
}
