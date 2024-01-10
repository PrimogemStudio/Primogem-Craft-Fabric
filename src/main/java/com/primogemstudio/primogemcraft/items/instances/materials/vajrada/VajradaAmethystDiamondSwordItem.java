package com.primogemstudio.primogemcraft.items.instances.materials.vajrada;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class VajradaAmethystDiamondSwordItem extends SwordItem {
    public VajradaAmethystDiamondSwordItem() {
        super(new Tier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 8f;
            }

            public float getAttackDamageBonus() {
                return 3.5f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 14;
            }

            @NotNull
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.DIAMOND), new ItemStack(PrimogemCraftItems.VAJRADA_AMETHYST_SLIVER_ITEM));
            }
        }, 3, -2.2f, new Item.Properties().fireResistant());
    }

    @Override
    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        OnAttack.execute(entity.level(), entity, sourceentity, itemstack);
        return super.hurtEnemy(itemstack, entity, sourceentity);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        OnUse.execute(entity, ar.getObject());
        return ar;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_diamond_sword.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_diamond_sword.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_diamond_sword.line3"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_diamond_sword.line4"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_diamond_sword.line5"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_diamond_sword.line6"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_diamond_sword.line7"));
    }
}