package com.primogemstudio.primogemcraft.items.instances.mora;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public class MoraHoeItem extends HoeItem {
    public MoraHoeItem() {
        super(new Tier() {
            public int getUses() {
                return 320;
            }

            public float getSpeed() {
                return 6f;
            }

            public float getAttackDamageBonus() {
                return 2f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 5;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.MORA_ITEM));
            }
        }, 0, -3f, new Item.Properties());
    }
}
