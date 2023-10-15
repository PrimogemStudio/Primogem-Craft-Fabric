package com.primogemstudio.primogemcraft.blocks.instances;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GrassCoreBlock extends Block {
    public GrassCoreBlock() {
        super(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(10F, 20F).requiresTool());
    }

    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        super.appendTooltip(stack, world, tooltip, options);
        tooltip.add(Text.literal("当闪电击中草原核时出现"));
        tooltip.add(Text.literal("也可以合成"));
    }

    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 1.0F;
    }
}
