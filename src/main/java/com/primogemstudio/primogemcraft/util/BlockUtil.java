package com.primogemstudio.primogemcraft.util;

import com.google.common.collect.Lists;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.level.ServerLevel;

import java.util.List;
import java.util.function.Function;

public class BlockUtil {
    private static final List<Function<BlockPos, BlockPos>> airFindMaps = Lists.newArrayList(BlockPos::below, BlockPos::above, BlockPos::east, BlockPos::west, BlockPos::south, BlockPos::north);

    public static boolean isAir(ServerLevel serverWorld, BlockPos pos) {
        return BuiltInRegistries.BLOCK.getKey(serverWorld.getBlockState(pos).getBlock()).getPath().equals("air");
    }

    @SuppressWarnings("ComparatorMethodParameterNotUsed")
    public static BlockPos findAir(ServerLevel serverWorld, BlockPos pos) {
        if (isAir(serverWorld, pos)) return pos;

        var st = airFindMaps.subList(0, 6);
        st.sort((o1, o2) -> (int) Math.round(Math.max(Math.min(-1, Math.random()), 1)));
        for (var func : st) if (isAir(serverWorld, func.apply(pos))) return func.apply(pos);

        return null;
    }
}
