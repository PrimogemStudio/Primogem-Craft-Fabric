package com.primogemstudio.primogemcraft.items.instances;

import com.primogemstudio.primogemcraft.gacha.packets.client.GachaTriggerClientPacket;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class IntertwinedFate extends Item {
    public IntertwinedFate() {
        super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(-1).saturationMod(-1f).alwaysEat().build()));
    }

    @Override
    public @NotNull UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.BOW;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.translatable("tooltip.primogemcraft.intertwined_fate.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.intertwined_fate.line2"));
    }

    @Override
    public void releaseUsing(ItemStack stack, Level level, LivingEntity livingEntity, int timeCharged) {
        if (level.isClientSide()) ClientPlayNetworking.send(new GachaTriggerClientPacket());
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        super.inventoryTick(stack, level, entity, slotId, isSelected);
        if (isSelected) {
            if (entity instanceof LivingEntity _entity) {
                _entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 50, 2));
                _entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 20, 1));
            }
        }
    }
}
