package com.primogemstudio.primogemcraft.items.instances.materials.vayuda;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class VayudaTurquoiseGemstoneShovelItem extends ShovelItem {
    public VayudaTurquoiseGemstoneShovelItem() {
        super(new Tier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 8.5f;
            }

            public float getAttackDamageBonus() {
                return 4f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 14;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.VAYUDA_TURQUOISE_GEMSTONE_SLIVER_ITEM), new ItemStack(PrimogemCraftItems.PRIMOGEM_ITEM));
            }
        }, 1, -3f, new Item.Properties().fireResistant());
    }

    @Override
    public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
        var ret = super.mineBlock(itemstack, world, blockstate, pos, entity);
        var effect = entity.getEffect(MobEffects.DIG_SPEED);
        if (effect != null && effect.getDuration() > 100) {
            entity.removeEffect(MobEffects.DIG_SPEED);
            entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 100, 0, true, false));
        } else if (effect != null) {
            entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, effect.getDuration(), effect.getAmplifier() + 1, false, false));
        } else {
            entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 80, 0, true, false));
        }
        return ret;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_shovel.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_shovel.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_shovel.line3"));
    }
}