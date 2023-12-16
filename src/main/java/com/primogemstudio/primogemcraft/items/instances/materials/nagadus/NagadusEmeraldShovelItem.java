package com.primogemstudio.primogemcraft.items.instances.materials.nagadus;

import com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks;
import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import com.primogemstudio.primogemcraft.sounds.PrimogemCraftSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NagadusEmeraldShovelItem extends ShovelItem {
    public NagadusEmeraldShovelItem() {
        super(new Tier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 1f;
            }

            public float getAttackDamageBonus() {
                return 0f;
            }

            public int getLevel() {
                return 4;
            }

            public int getEnchantmentValue() {
                return 5;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.PRIMOGEM_ITEM), new ItemStack(PrimogemCraftItems.NAGADUS_EMERALD_SLIVER_ITEM));
            }
        }, 1, -1f, new Item.Properties().fireResistant());
    }

    @Override
    public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
        boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
        var x = pos.getX();
        var y = pos.getY();
        var z = pos.getZ();
        if (itemstack.getOrCreateTag().getBoolean("value")) {
            if (Math.random() < 0.01) {
                if (Math.random() < 0.5) {
                    if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(PrimogemCraftBlocks.BLESSING_OF_DENDRO_BLOCK));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                    }
                }
                else {
                    world.setBlock(BlockPos.containing(x, y, z), PrimogemCraftBlocks.BLESSING_OF_DENDRO_BLOCK.defaultBlockState(), 3);
                }
            }
        } else {
            world.setBlock(BlockPos.containing(x, y, z), PrimogemCraftBlocks.BLESSING_OF_DENDRO_BLOCK.defaultBlockState(), 3);
            itemstack.getOrCreateTag().putBoolean("value", true);
        }
        return retval;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.nagadus_emerald_shovel.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.nagadus_emerald_shovel.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.nagadus_emerald_shovel.line3"));
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        super.useOn(context);
        var x = context.getClickedPos().getX();
        var y = context.getClickedPos().getY();
        var z = context.getClickedPos().getZ();
        var world = context.getLevel();
        var entity = context.getPlayer();
        var itemstack = context.getItemInHand();
        if (entity.isShiftKeyDown()) {
            if (itemstack.getItem() == entity.getMainHandItem().getItem()) {
                entity.swing(InteractionHand.MAIN_HAND, true);
            }
            else {
                entity.swing(InteractionHand.OFF_HAND, true);
            }
            entity.getCooldowns().addCooldown(itemstack.getItem(), 10);
            ItemStack _ist = itemstack;
            if (_ist.hurt(1, RandomSource.create(), null)) {
                _ist.shrink(1);
                _ist.setDamageValue(0);
            }
            if (!world.isClientSide()) {
                world.playSound(null, BlockPos.containing(x, y, z), PrimogemCraftSounds.NAGADUS_EMERALD_SHOVEL_ONUSE, SoundSource.NEUTRAL, (float) 0.3, 5);
            }
            else {
                world.playLocalSound(x, y, z, PrimogemCraftSounds.NAGADUS_EMERALD_SHOVEL_ONUSE, SoundSource.NEUTRAL, (float) 0.3, 5, false);
            }
            if (Math.random() < 0.2) {
                world.setBlock(BlockPos.containing(x, y, z), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
            } else {
                if (Math.random() < 0.2) {
                    world.setBlock(BlockPos.containing(x, y, z), Blocks.DIRT_PATH.defaultBlockState(), 3);
                } else {
                    if (Math.random() < 0.2) {
                        world.setBlock(BlockPos.containing(x, y, z), Blocks.MYCELIUM.defaultBlockState(), 3);
                    } else {
                        if (Math.random() < 0.2) {
                            world.setBlock(BlockPos.containing(x, y, z), Blocks.DIRT.defaultBlockState(), 3);
                        } else {
                            if (Math.random() < 0.2) {
                                world.setBlock(BlockPos.containing(x, y, z), Blocks.COARSE_DIRT.defaultBlockState(), 3);
                            } else {
                                if (Math.random() < 0.2) {
                                    world.setBlock(BlockPos.containing(x, y, z), Blocks.PODZOL.defaultBlockState(), 3);
                                } else {
                                    if (Math.random() < 0.2) {
                                        world.setBlock(BlockPos.containing(x, y, z), Blocks.FARMLAND.defaultBlockState(), 3);
                                    } else {
                                        if (Math.random() < 0.02) {
                                            world.setBlock(BlockPos.containing(x, y, z), PrimogemCraftBlocks.NAGADUS_EMERALD_ORE_BLOCK.defaultBlockState(), 3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return InteractionResult.SUCCESS;
    }
}