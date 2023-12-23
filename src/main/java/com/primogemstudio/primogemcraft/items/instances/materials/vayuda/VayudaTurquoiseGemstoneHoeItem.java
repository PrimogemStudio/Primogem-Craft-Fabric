package com.primogemstudio.primogemcraft.items.instances.materials.vayuda;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.primogemstudio.primogemcraft.util.GameUtil.isCreative;

public class VayudaTurquoiseGemstoneHoeItem extends HoeItem {
    public VayudaTurquoiseGemstoneHoeItem() {
        super(new Tier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 8.5f;
            }

            public float getAttackDamageBonus() {
                return 9.5f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 15;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.VAYUDA_TURQUOISE_GEMSTONE_SLIVER_ITEM), new ItemStack(PrimogemCraftItems.PRIMOGEM_ITEM));
            }
        }, 0, -3.6f, new Item.Properties().fireResistant());
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_hoe.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_hoe.line2"));
    }

    @Override
    public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
        super.onCraftedBy(itemstack, world, entity);
        onUpdate(itemstack, entity);
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        onUpdate(itemstack, (Player) entity);
    }

    public void onUpdate(ItemStack itemstack, Player entity) {
        if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.KNOCKBACK, itemstack) == 0 && !isCreative(entity) && entity.getMainHandItem().getItem() == itemstack.getItem() && entity.getOffhandItem().getItem() == itemstack.getItem()) {
            (itemstack).enchant(Enchantments.KNOCKBACK, Mth.nextInt(RandomSource.create(), 8, 10));
        }
        if (isCreative(entity) && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.KNOCKBACK, itemstack) == 0) {
            (itemstack).enchant(Enchantments.KNOCKBACK, 10);
        }
    }
}
