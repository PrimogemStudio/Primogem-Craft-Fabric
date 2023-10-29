package com.primogemstudio.primogemcraft.items.instances.primogem;

import com.primogemstudio.primogemcraft.effects.PrimogemCraftMobEffects;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.LegacyRandomSource;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Random;

public class PrimogemSpecialSwordItem extends SwordItem {
    public PrimogemSpecialSwordItem() {
        super(new Tier() {
            public int getUses() {
                return 20;
            }

            public float getSpeed() {
                return 10f;
            }

            public float getAttackDamageBonus() {
                return -1.7f;
            }

            public int getLevel() {
                return 5;
            }

            public int getEnchantmentValue() {
                return 100;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Blocks.BEDROCK));
            }
        }, 3, -2.8f, new Item.Properties().fireResistant());
    }

    @Override
    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);

        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();

        if (entity.getHealth() <= 10 && !(entity.hasEffect(PrimogemCraftMobEffects.SPECIAL_HURT))) {
            entity.addEffect(new MobEffectInstance(PrimogemCraftMobEffects.SPECIAL_HURT, 1200, 0));
            if (entity.level().isClientSide) entity.level().playLocalSound(x, y, z, SoundEvents.GLASS_BREAK, SoundSource.NEUTRAL, 1, 1, false);
            if (Math.random() < 0.1) {
                {
                    ItemStack _ist = itemstack;
                    if (_ist.hurt(100, new LegacyRandomSource(new Random().nextLong()), null)) {
                        _ist.shrink(1);
                        _ist.setDamageValue(0);
                    }
                }
            }
        }

        return retval;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.literal("§6§o『彩蛋武器』"));
        list.add(Component.literal("§7 • 攻击生命值小于10点的生物使其触发一"));
        list.add(Component.literal("§7   个神奇的效果"));
        list.add(Component.literal("§7 • 使用时有10%概率直接损坏"));
        list.add(Component.literal("§c • 别在家里使用"));
    }
}
