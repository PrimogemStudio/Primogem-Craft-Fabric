package com.primogemstudio.primogemcraft.items.instances.materials.vajrada;

import com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks;
import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class VajradaAmethystPickaxeItem extends PickaxeItem {
    public VajradaAmethystPickaxeItem() {
        super(new Tier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 8.5f;
            }

            public float getAttackDamageBonus() {
                return 3.5f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 10;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.PRIMOGEM_ITEM), new ItemStack(PrimogemCraftItems.VAJRADA_AMETHYST_SLIVER_ITEM));
            }
        }, 1, -3f, new Item.Properties().fireResistant());
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_pickaxe.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_pickaxe.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_pickaxe.line3"));
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        super.useOn(context);
        LevelAccessor world = context.getLevel();
        double x = context.getClickedPos().getX();
        double y = context.getClickedPos().getY();
        double z = context.getClickedPos().getZ();
        Player entity = context.getPlayer();
        ItemStack itemstack = context.getItemInHand();
        if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.COAL_ORES)) {
            if (world instanceof ServerLevel _level) {
                LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
                entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y + 1, z)));
                entityToSpawn.setVisualOnly(true);
                _level.addFreshEntity(entityToSpawn);
            }
            if (itemstack.hurt(10, RandomSource.create(), null)) {
                itemstack.shrink(1);
                itemstack.setDamageValue(0);
            }
            if (Math.random() < 0.5) {
                Level _level = (Level) world;
                if (!_level.isClientSide()) {
                    _level.playSound(null, BlockPos.containing(x, y, z), SoundEvents.GLASS_BREAK, SoundSource.BLOCKS, 5, (float) 0.5);
                }
                else {
                    _level.playLocalSound(x, y, z, SoundEvents.GLASS_BREAK, SoundSource.BLOCKS, 5, (float) 0.5, false);
                }
                if (Math.random() < 0.05) {
                    if ((world.getBlockState(BlockPos.containing(x, y, z))).is(TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "deepslate_ores")))) {
                        world.setBlock(BlockPos.containing(x, y, z), PrimogemCraftBlocks.VAJRADA_AMETHYST_ORE_BLOCK.defaultBlockState(), 3);
                    }
                    else {
                        world.setBlock(BlockPos.containing(x, y, z), PrimogemCraftBlocks.VAJRADA_AMETHYST_ORE_BLOCK.defaultBlockState(), 3);
                    }
                }
                else {
                    if (Math.random() < 0.2) {
                        if ((world.getBlockState(BlockPos.containing(x, y, z))).is(TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "deepslate_ores")))) {
                            world.setBlock(BlockPos.containing(x, y, z), Blocks.DEEPSLATE_DIAMOND_ORE.defaultBlockState(), 3);
                        }
                        else {
                            world.setBlock(BlockPos.containing(x, y, z), Blocks.DIAMOND_ORE.defaultBlockState(), 3);
                        }
                    }
                    else {
                        if (Math.random() < 0.3) {
                            world.setBlock(BlockPos.containing(x, y, z), Blocks.NETHER_QUARTZ_ORE.defaultBlockState(), 3);
                        }
                        else {
                            if (Math.random() < 0.3) {
                                if ((world.getBlockState(BlockPos.containing(x, y, z))).is(TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "deepslate_ores")))) {
                                    world.setBlock(BlockPos.containing(x, y, z), Blocks.DEEPSLATE_REDSTONE_ORE.defaultBlockState(), 3);
                                }
                                else {
                                    world.setBlock(BlockPos.containing(x, y, z), Blocks.REDSTONE_ORE.defaultBlockState(), 3);
                                }
                            }
                            else {
                                if (Math.random() < 0.3) {
                                    if ((world.getBlockState(BlockPos.containing(x, y, z))).is(TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "deepslate_ores")))) {
                                        world.setBlock(BlockPos.containing(x, y, z), PrimogemCraftBlocks.DEEP_SLATE_PRIMOGEM_ORE.defaultBlockState(), 3);
                                    }
                                    else {
                                        world.setBlock(BlockPos.containing(x, y, z), PrimogemCraftBlocks.PRIMOGEM_ORE.defaultBlockState(), 3);
                                    }
                                } else {
                                    if (Math.random() < 0.3) {
                                        if ((world.getBlockState(BlockPos.containing(x, y, z))).is(TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "deepslate_ores")))) {
                                            world.setBlock(BlockPos.containing(x, y, z), Blocks.DEEPSLATE_LAPIS_ORE.defaultBlockState(), 3);
                                        }
                                        else {
                                            world.setBlock(BlockPos.containing(x, y, z), Blocks.LAPIS_ORE.defaultBlockState(), 3);
                                        }
                                    }
                                    else {
                                        if (Math.random() < 0.2) {
                                            if ((world.getBlockState(BlockPos.containing(x, y, z))).is(TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "deepslate_ores")))) {
                                                world.setBlock(BlockPos.containing(x, y, z), Blocks.DEEPSLATE_EMERALD_ORE.defaultBlockState(), 3);
                                            }
                                            else {
                                                world.setBlock(BlockPos.containing(x, y, z), Blocks.EMERALD_ORE.defaultBlockState(), 3);
                                            }
                                        }
                                        else {
                                            if ((world.getBlockState(BlockPos.containing(x, y, z))).is(TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "deepslate_ores")))) {
                                                world.setBlock(BlockPos.containing(x, y, z), Blocks.DEEPSLATE.defaultBlockState(), 3);
                                            }
                                            else {
                                                world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE.defaultBlockState(), 3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else {
                 entity.getCooldowns().addCooldown(itemstack.getItem(), 1200);
            }
        }
        return InteractionResult.SUCCESS;
    }
}