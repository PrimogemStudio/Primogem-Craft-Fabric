package com.primogemstudio.primogemcraft.items.instances.materials.nagadus;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NagadusEmeraldPickaxeItem extends PickaxeItem {
    public NagadusEmeraldPickaxeItem() {
        super(new Tier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 8f;
            }

            public float getAttackDamageBonus() {
                return 4f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 10;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.PRIMOGEM_ITEM), new ItemStack(PrimogemCraftItems.NAGADUS_EMERALD_SLIVER_ITEM));
            }
        }, 1, -3f, new Item.Properties().fireResistant());
    }

    public boolean mineBlock(ItemStack stack, Level world, BlockState state, BlockPos pos, LivingEntity entity) {
        var x = entity.getX();
        var y = entity.getY();
        var z = entity.getZ();
        var blockpos = BlockPos.containing(x, y, z);
        var block = world.getBlockState(blockpos).getBlock();
        if (Math.random() < 0.1 && (
                block == Blocks.WATER
                || block == Blocks.BUBBLE_COLUMN)
                && world instanceof ServerLevel _level
        ) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(PrimogemCraftItems.DENDRO_CORE_ITEM));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
        }
        return super.mineBlock(stack, world, state, pos, entity);
    }

    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltipComponents, TooltipFlag isAdvanced) {
        tooltipComponents.add(Component.translatable("tooltip.primogemcraft.nagadus_emerald_pickaxe.line1"));
        tooltipComponents.add(Component.translatable("tooltip.primogemcraft.nagadus_emerald_pickaxe.line2"));
    }
}
