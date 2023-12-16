package com.primogemstudio.primogemcraft.items.instances.materials.nagadus;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NagadusEmeraldHoeItem extends HoeItem {
    public NagadusEmeraldHoeItem() {
        super(new Tier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 8f;
            }

            public float getAttackDamageBonus() {
                return 1f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 15;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.PRIMOGEM_ITEM), new ItemStack(PrimogemCraftItems.NAGADUS_EMERALD_SLIVER_ITEM));
            }
        }, 0, -3f, new Item.Properties().fireResistant());
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        entity.getCooldowns().addCooldown(ar.getObject().getItem(), 5);
        BlockPos _bp = BlockPos.containing(entity.getX(), entity.getY() - 1, entity.getZ());
        if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), world, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), world, _bp, null)) {
            if (!world.isClientSide()) world.levelEvent(2005, _bp, 0);
        }
        ItemStack ist = ar.getObject();
        if (ist.hurt(1, RandomSource.create(), null)) {
            ist.shrink(1);
            ist.setDamageValue(0);
        }
        return ar;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.translatable("tooltip.primogemcraft.nagadus_emerald_hoe.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.nagadus_emerald_hoe.line2"));
    }
}
