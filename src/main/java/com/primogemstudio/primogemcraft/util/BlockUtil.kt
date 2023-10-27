package com.primogemstudio.primogemcraft.util

import com.google.common.collect.Lists
import net.minecraft.core.BlockPos
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.server.level.ServerLevel
import java.util.function.Function
import kotlin.math.max
import kotlin.math.min

class BlockUtil {
    companion object {
        @JvmStatic
        private val airFindMaps: List<Function<BlockPos, BlockPos>> = Lists.newArrayList(
            Function { obj: BlockPos -> obj.below() },
            Function { obj: BlockPos -> obj.above() },
            Function { obj: BlockPos -> obj.east() },
            Function { obj: BlockPos -> obj.west() },
            Function { obj: BlockPos -> obj.south() },
            Function { obj: BlockPos -> obj.north() })

        @JvmStatic
        fun isAir(serverWorld: ServerLevel, pos: BlockPos?): Boolean {
            return pos?.let { serverWorld.getBlockState(it).block }?.let { BuiltInRegistries.BLOCK.getKey(it).path } == "air"
        }

        @JvmStatic
        fun findAir(serverWorld: ServerLevel, pos: BlockPos): BlockPos? {
            if (isAir(serverWorld, pos)) return pos
            val st = airFindMaps.subList(0, 6)
            st.sortedWith { _: Function<BlockPos, BlockPos>, _: Function<BlockPos, BlockPos> ->
                Math.round(max(min(-1.0, Math.random()), 1.0)).toInt()
            }
            for (func in st) if (isAir(serverWorld, func.apply(pos))) return func.apply(pos)
            return null
        }
    }
}