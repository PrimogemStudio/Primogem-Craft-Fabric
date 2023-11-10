package com.primogemstudio.primogemcraft.items.instances.records;

import com.primogemstudio.primogemcraft.sounds.PrimogemCraftSounds;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TakeTheJourneyItem extends RecordItem {
    public TakeTheJourneyItem() {
        super(15, PrimogemCraftSounds.TAKE_THE_JOURNEY, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 64);
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.translatable("tooltip.primogemcraft.music_disc_take_the_journey.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.music_disc_take_the_journey.line2"));
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        if (world.isClientSide) world.playLocalSound(entity.getX(), entity.getY(), entity.getZ(), PrimogemCraftSounds.TAKE_THE_JOURNEY, SoundSource.PLAYERS, (float) 0.4, 1, false);
        entity.getCooldowns().addCooldown(ar.getObject().getItem(), 1280);
        return ar;
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        super.useOn(context);
        // TODO port procedure -> TashanglvtuxianzhitiaojianProcedure.execute(context.getLevel(), context.getPlayer());
        return InteractionResult.SUCCESS;
    }
}
