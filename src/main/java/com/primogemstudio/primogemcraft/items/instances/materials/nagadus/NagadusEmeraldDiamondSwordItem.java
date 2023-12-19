package com.primogemstudio.primogemcraft.items.instances.materials.nagadus;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NagadusEmeraldDiamondSwordItem extends SwordItem {
    public NagadusEmeraldDiamondSwordItem() {
        super(new Tier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 9f;
            }

            public float getAttackDamageBonus() {
                return 4.5f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 14;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.NAGADUS_EMERALD_SLIVER_ITEM), new ItemStack(Items.IRON_INGOT));
            }
        }, 3, -2.2f, new Item.Properties().fireResistant());
    }

    @Override
    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        OnAttack.execute(entity, sourceentity, itemstack);
        return retval;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.nagadus_emerald_diamond_sword.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.nagadus_emerald_diamond_sword.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.nagadus_emerald_diamond_sword.line3"));
        list.add(Component.translatable("tooltip.primogemcraft.nagadus_emerald_diamond_sword.line4"));
    }
}