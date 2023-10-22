package com.primogemstudio.primogemcraft.items.instances;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TheAllBeginningItem extends Item {
    public TheAllBeginningItem() {
        super(new Item.Properties().durability(32).fireResistant().rarity(Rarity.EPIC));
    }
    @Override
    public @NotNull UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }

    @Override
    public int getUseDuration(ItemStack itemstack) {
        return 32;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.translatable("tooltip.primogemcraft.the_all_beginning.line1"));
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        ItemStack itemstack = ar.getObject();
        entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 600, 3));
        entity.getCooldowns().addCooldown(itemstack.getItem(), 400);

        return ar;
    }
}
