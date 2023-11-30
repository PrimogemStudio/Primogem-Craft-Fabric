package com.primogemstudio.primogemcraft.items.instances.materials.vajrada;

import com.primogemstudio.primogemcraft.effects.PrimogemCraftMobEffects;
import com.primogemstudio.primogemcraft.interfaces.ItemExtension;
import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class VajradaAmethystAxe extends AxeItem implements ItemExtension {
    public VajradaAmethystAxe() {
        super(new Tier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 8f;
            }

            public float getAttackDamageBonus() {
                return 5f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 15;
            }

            @NotNull
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.PRIMOGEM_ITEM), new ItemStack(PrimogemCraftItems.VAJRADA_AMETHYST_SLIVER_ITEM));
            }
        }, 1, -3f, new Item.Properties().fireResistant());
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity entity, LivingEntity source) {
        var ret = super.hurtEnemy(stack, entity, source);
        if (!entity.level().isClientSide() && source instanceof Player player) {
            var delay = stack.getOrCreateTag().getInt("delay");
            if (!player.getCooldowns().isOnCooldown(stack.getItem())) {
                entity.addEffect(new MobEffectInstance(PrimogemCraftMobEffects.PAST, delay * 20, 0));
                player.getCooldowns().addCooldown(stack.getItem(), delay * 10);
            }
        }
        return ret;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_axe.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_axe.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_axe.line3"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_axe.line4"));
    }

    @Override
    public boolean onEntitySwing(ItemStack stack, LivingEntity entity) {
        if (!entity.level().isClientSide() && entity.isShiftKeyDown()) {
            entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.PLAYERS, 1, 1);
            var tag = stack.getOrCreateTag();
            if (entity instanceof Player player) {
                var delay = tag.getInt("delay");
                var rev = tag.getBoolean("reverse");
                delay = rev ? delay - 10 : delay + 10;
                player.displayClientMessage(Component.translatable("custom.primogemcraft.vajrada_amethyst_axe." + (rev ? "red" : "green"), delay), true);
                if (delay >= 40) {
                    tag.putBoolean("reverse", true);
                } else if (delay <= 0) {
                    tag.putBoolean("reverse", false);
                }
                tag.putInt("delay", delay);
            }
        }
        return false;
    }
}