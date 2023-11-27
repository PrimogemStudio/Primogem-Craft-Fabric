package com.primogemstudio.primogemcraft.items.instances.records;

import com.primogemstudio.primogemcraft.sounds.PrimogemCraftSounds;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
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
    }

    @Override
    @NotNull
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, player, hand);
        if (!world.isClientSide)
            world.playSound(null, player, PrimogemCraftSounds.TAKE_THE_JOURNEY, SoundSource.PLAYERS, 0.4f, 1);
        player.getCooldowns().addCooldown(ar.getObject().getItem(), 1280);
        return ar;
    }

    @Override
    @NotNull
    public InteractionResult useOn(UseOnContext context) {
        super.useOn(context);
        new ServerTickEvents.EndTick() {
            private int ticks = 0;
            private float waitTicks;
            private boolean triggered = false;

            public void start(int waitTicks) {
                this.waitTicks = waitTicks;
                ServerTickEvents.END_SERVER_TICK.register(this);
            }

            public void onEndTick(MinecraftServer srv) {
                this.ticks += 1;
                if (this.ticks >= this.waitTicks) run();
            }

            @SuppressWarnings("DataFlowIssue")
            private void run() {
                if (!triggered) {
                    context.getPlayer().getCooldowns().addCooldown(TakeTheJourneyItem.this, 1280);
                    triggered = true;
                }
            }
        }.start(20);
        return InteractionResult.SUCCESS;
    }
}
