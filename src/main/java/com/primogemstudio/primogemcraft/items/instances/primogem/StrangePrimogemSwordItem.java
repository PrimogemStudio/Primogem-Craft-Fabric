package com.primogemstudio.primogemcraft.items.instances.primogem;

import com.primogemstudio.primogemcraft.effects.PrimogemCraftMobEffects;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class StrangePrimogemSwordItem extends SwordItem {
    public StrangePrimogemSwordItem() {
        super(new Tier() {
            public int getUses() {
                return 20;
            }

            public float getSpeed() {
                return 10.0F;
            }

            public float getAttackDamageBonus() {
                return -1.7F;
            }

            public int getLevel() {
                return 5;
            }

            public int getEnchantmentValue() {
                return 100;
            }

            @NotNull
            public Ingredient getRepairIngredient() {
                return Ingredient.of(Blocks.BEDROCK);
            }
        }, 3, -2.8F, (new Properties()).fireResistant());
    }

    public boolean hurtEnemy(ItemStack stack, LivingEntity entity, LivingEntity source) {
        var ret = super.hurtEnemy(stack, entity, source);
        if (entity.hasEffect(PrimogemCraftMobEffects.ABNORMAL_DISEASE)) return ret;
        if (entity.getHealth() <= entity.getMaxHealth() * 0.5) {
            if (!entity.level().isClientSide) {
                entity.addEffect(new MobEffectInstance(PrimogemCraftMobEffects.ABNORMAL_DISEASE, 1200, 0));
            } else {
                entity.level().playLocalSound(entity.getX(), entity.getY(), entity.getZ(), SoundEvents.GRASS_BREAK, SoundSource.NEUTRAL, 1.0f, 1.0f, true);
            }
            if (Math.random() < 0.1 && stack.hurt(100, entity.getRandom(), null)) {
                stack.shrink(1);
                stack.setDamageValue(0);
            }
        }
        return ret;
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.strange_primogem_sword.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.strange_primogem_sword.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.strange_primogem_sword.line3"));
        list.add(Component.translatable("tooltip.primogemcraft.strange_primogem_sword.line4"));
        list.add(Component.translatable("tooltip.primogemcraft.strange_primogem_sword.line5"));
    }
}

