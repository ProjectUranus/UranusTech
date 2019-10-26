package com.projecturanus.uranustech.common.multiblock

import net.minecraft.block.Blocks

fun createMultiblocks() {
    multiblock {
        layer(
                row(listOf(Blocks.OAK_LOG), axis(Blocks.OAK_LOG), listOf(Blocks.OAK_LOG))
        )
    }
}
