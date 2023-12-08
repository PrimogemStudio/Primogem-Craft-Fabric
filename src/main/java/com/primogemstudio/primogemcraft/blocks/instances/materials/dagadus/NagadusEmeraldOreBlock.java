package com.primogemstudio.primogemcraft.blocks.instances.materials.dagadus;

import com.primogemstudio.primogemcraft.interfaces.BlockExtension;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;

public class NagadusEmeraldOreBlock extends Block implements BlockExtension {
    public NagadusEmeraldOreBlock() {
        super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(2f).requiresCorrectToolForDrops());
    }

    @Override
    public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.nagadus_emerald_ore.line1"));
    }

    // TODO canSustainPlant

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
    }

    @Override
    public void onDestroyedByPlayer(Level level, Player player, BlockPos pos, BlockState state, BlockEntity blockEntity, ItemStack tool) {
        if (!level.isClientSide()) {
            level.playSound(null, pos, SoundEvents.GLASS_BREAK, SoundSource.BLOCKS, (float) 0.5, 1);
        }
        else {
            level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), SoundEvents.GLASS_BREAK, SoundSource.BLOCKS, (float) 0.5, 1, false);
        }
    }
}