package com.primogemstudio.primogemcraft.items.instances.materials.agnidus;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AgnidusAgateAxeItem extends AxeItem {
    public AgnidusAgateAxeItem() {
        super(new Tier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 10f;
            }

            public float getAttackDamageBonus() {
                return 6f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 15;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.PRIMOGEM_ITEM), new ItemStack(PrimogemCraftItems.AGNIDUS_AGATE_SLIVER_ITEM));
            }
        }, 1, -3f, new Item.Properties().fireResistant());
    }

    @Override
    public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
        boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
        if (!world.isClientSide && blockstate.is(BlockTags.MINEABLE_WITH_AXE) && Math.random() < 0.1) {
            ItemEntity entityToSpawn = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Math.random() < 0.03 ? PrimogemCraftItems.ELEMENT_CRYSTAL_DUST_ITEM : Items.CHARCOAL));
            entityToSpawn.setPickUpDelay(10);
            world.addFreshEntity(entityToSpawn);
        }
        return retval;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_axe.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_axe.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_axe.line3"));
    }
}