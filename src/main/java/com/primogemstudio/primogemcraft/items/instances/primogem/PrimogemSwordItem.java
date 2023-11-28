package com.primogemstudio.primogemcraft.items.instances.primogem;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class PrimogemSwordItem extends SwordItem {
    public PrimogemSwordItem() {
        super(new Tier() {
            public int getUses() {
                return 1000;
            }

            public float getSpeed() {
                return 6f;
            }

            public float getAttackDamageBonus() {
                return 3.5f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 10;
            }

            @NotNull
            public Ingredient getRepairIngredient() {
                return Ingredient.of(PrimogemCraftItems.PRIMOGEM_ITEM);
            }
        }, 3, -2.4f, new Item.Properties().fireResistant().rarity(Rarity.RARE));
    }

    @Override
    public void onCraftedBy(ItemStack stack, Level world, Player entity) {
        if (Math.random() < 0.01) stack.getOrCreateTag().putBoolean("strange", true);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level world, Entity entity, int slot, boolean selected) {
        if (stack.hasTag() && stack.getOrCreateTag().getBoolean("strange") && entity instanceof Player player) {
            player.getInventory().removeItem(slot, stack.getCount());
            player.getInventory().add(slot, PrimogemCraftItems.STRANGE_PRIMOGEM_SWORD_ITEM.getDefaultInstance());
        }
    }
}
