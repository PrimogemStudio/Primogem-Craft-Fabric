package com.primogemstudio.primogemcraft.items.instances.primogem;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public class PrimogemShovelItem extends ShovelItem {
    public PrimogemShovelItem() {
        super(new Tier() {
            public int getUses() {
                return 320;
            }

            public float getSpeed() {
                return 4f;
            }

            public float getAttackDamageBonus() {
                return 4f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 15;
            }

            @NotNull
            public Ingredient getRepairIngredient() {
                return Ingredient.of(PrimogemCraftItems.PRIMOGEM_ITEM);
            }
        }, 1, -3f, new Item.Properties().fireResistant().rarity(Rarity.RARE));
    }
}
