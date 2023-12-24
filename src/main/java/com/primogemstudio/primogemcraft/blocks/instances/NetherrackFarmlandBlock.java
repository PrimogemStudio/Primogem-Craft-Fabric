package com.primogemstudio.primogemcraft.blocks.instances;

import com.primogemstudio.primogemcraft.interfaces.BlockExtension;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NetherrackFarmlandBlock extends Block implements BlockExtension {
    public NetherrackFarmlandBlock() {
        super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.NETHERRACK).strength(1f, 10f).lightLevel(s -> 6).requiresCorrectToolForDrops().noOcclusion().pushReaction(PushReaction.PUSH_ONLY)
                .isRedstoneConductor((bs, br, bp) -> false));
    }

    @Override
    public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return true;
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    @Override
    public @NotNull VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return box(0, 0, 0, 16, 15, 16);
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing) {
        return true;
    }

    @Override
    public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
        super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
        var x = pos.getX();
        var y = pos.getY();
        var z = pos.getZ();
        var blkup = world.getBlockState(BlockPos.containing(x, y + 1, z));
        if (!(blkup.getBlock() == Blocks.AIR || blkup.is(BlockTags.CROPS)
                || blkup.is(BlockTags.CROPS) || blkup.getBlock() == Blocks.WATER
                || blkup.getBlock() == Blocks.WATER || blkup.getBlock() == Blocks.LAVA
                || blkup.getBlock() == Blocks.LAVA)) {
            world.setBlock(BlockPos.containing(x, y, z), Blocks.NETHERRACK.defaultBlockState(), 3);
        }
    }
}