package com.primogemstudio.primogemcraft.items.instances;

import com.primogemstudio.primogemcraft.entities.instances.entities.IntertwinedFateEntity;
import com.primogemstudio.primogemcraft.gacha.GachaServer;
import com.primogemstudio.primogemcraft.sounds.PrimogemCraftSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class IntertwinedFateItem extends Item {
    public IntertwinedFateItem() {
        super(new Item.Properties().rarity(Rarity.UNCOMMON));
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 72000;
    }

    @Override
    @NotNull
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.SPEAR;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.intertwined_fate.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.intertwined_fate.line2"));
    }

    @Override
    public void releaseUsing(ItemStack stack, Level level, LivingEntity livingEntity, int timeCharged) {
        if (getUseDuration(stack) - timeCharged < 10) return;
        if (livingEntity instanceof Player player) {
            var ife = new IntertwinedFateEntity(level, player);
            ife.setItem(stack);
            ife.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0f, 1.5f, 1.0f);
            level.addFreshEntity(ife);
            level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.SNOWBALL_THROW, SoundSource.NEUTRAL, 0.5f, 0.4f / (level.getRandom().nextFloat() * 0.4f + 0.8f));
            if (!player.getAbilities().instabuild) {
                stack.shrink(1);
            }

            if (!level.isClientSide) {
                level.playSound(null, BlockPos.containing(player.position()), PrimogemCraftSounds.PRE_GACHA, SoundSource.HOSTILE, 70, 1);
            }
            else {
                level.playLocalSound(BlockPos.containing(player.position()), PrimogemCraftSounds.PRE_GACHA, SoundSource.HOSTILE, 70, 1, false);
            }
        }
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if (isSelected && entity instanceof Player player) {
            player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 50, 2));
            player.addEffect(new MobEffectInstance(MobEffects.LUCK, 20, 1));
        }
    }

    @Override
    @NotNull
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        player.startUsingItem(usedHand);
        return InteractionResultHolder.consume(player.getItemInHand(usedHand));
    }
}