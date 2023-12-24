package com.primogemstudio.primogemcraft.items.instances.materials.agnidus;

import com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks;
import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AgnidusAgateHoeItem extends HoeItem {
    public AgnidusAgateHoeItem() {
        super(new Tier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 8f;
            }

            public float getAttackDamageBonus() {
                return 2f;
            }

            public int getLevel() {
                return 4;
            }

            public int getEnchantmentValue() {
                return 10;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.PRIMOGEM_ITEM), new ItemStack(PrimogemCraftItems.AGNIDUS_AGATE_SLIVER_ITEM));
            }
        }, 0, -3f, new Item.Properties().fireResistant());
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_hoe.line1"));
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        super.useOn(context);
        var world = context.getLevel();
        var x = context.getClickedPos().getX();
        var y = context.getClickedPos().getY();
        var z = context.getClickedPos().getZ();
        var entity = context.getPlayer();
        var itemstack = context.getItemInHand();
        var blk = world.getBlockState(BlockPos.containing(x, y, z));
        if (blk.getBlock() == Blocks.NETHERRACK) {
            world.setBlock(BlockPos.containing(x, y, z), PrimogemCraftBlocks.NETHERRACK_FARMLAND_BLOCK.defaultBlockState(), 3);
            if (!world.isClientSide()) {
                world.playSound(null, BlockPos.containing(x, y, z), SoundEvents.NETHERRACK_HIT, SoundSource.BLOCKS, 1, (float) 0.9);
            }

            if (itemstack.hurt(1, RandomSource.create(), null)) {
                itemstack.shrink(1);
                itemstack.setDamageValue(0);
            }
            entity.swing(context.getHand());
        }

        return InteractionResult.SUCCESS;
    }
}
