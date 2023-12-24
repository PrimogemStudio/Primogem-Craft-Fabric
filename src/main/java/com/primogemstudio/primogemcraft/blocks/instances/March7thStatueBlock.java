package com.primogemstudio.primogemcraft.blocks.instances;

import com.primogemstudio.primogemcraft.interfaces.BlockExtension;
import com.primogemstudio.primogemcraft.sounds.PrimogemCraftSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class March7thStatueBlock extends Block implements BlockExtension {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public March7thStatueBlock() {
        super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(3f, 100f).requiresCorrectToolForDrops().friction(0.1f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.march_7th_statue.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.march_7th_statue.line2"));
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
        return box(4, 0, 4, 12, 13, 12);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    public @NotNull BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public @NotNull BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    private void prevSound(LevelAccessor world, double x, double y, double z, SoundEvent ev) {
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, BlockPos.containing(x, y, z), ev, SoundSource.BLOCKS, (float) 0.4, 1);
            }
        }
    }

    @Override
    public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
        super.onPlace(blockstate, world, pos, oldState, moving);
        prevSound(world, pos.getX(), pos.getY(), pos.getZ(), PrimogemCraftSounds.MARCH_7TH_SOUND1);
    }

    @Override
    public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
        super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
        prevSound(world, pos.getX(), pos.getY(), pos.getZ(), PrimogemCraftSounds.MARCH_7TH_SOUND1);
    }

   public void onDestroyedByPlayer(Level level, Player player, BlockPos pos, BlockState state, BlockEntity blockEntity, ItemStack tool) {
       prevSound(level, pos.getX(), pos.getY(), pos.getZ(), PrimogemCraftSounds.MARCH_7TH_SOUND2);
   }

    @Override
    public void wasExploded(Level world, BlockPos pos, Explosion e) {
        super.wasExploded(world, pos, e);
        prevSound(world, pos.getX(), pos.getY(), pos.getZ(), PrimogemCraftSounds.MARCH_7TH_SOUND2);
    }

    @Override
    public void attack(BlockState blockstate, Level world, BlockPos pos, Player entity) {
        super.attack(blockstate, world, pos, entity);
        prevSound(world, pos.getX(), pos.getY(), pos.getZ(), PrimogemCraftSounds.MARCH_7TH_SOUND1);
    }

    @Override
    public void onProjectileHit(Level world, BlockState blockstate, BlockHitResult hit, Projectile entity) {
        prevSound(world, hit.getBlockPos().getX(), hit.getBlockPos().getY(), hit.getBlockPos().getZ(), PrimogemCraftSounds.MARCH_7TH_SOUND2);
    }

    @Override
    public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
        super.use(blockstate, world, pos, entity, hand, hit);
        prevSound(world, hit.getBlockPos().getX(), hit.getBlockPos().getY(), hit.getBlockPos().getZ(), PrimogemCraftSounds.MARCH_7TH_SOUND3);
        return InteractionResult.SUCCESS;
    }
}
