package com.projecturanus.uranustech.common.block

import com.projecturanus.uranustech.api.material.MaterialStack
import com.projecturanus.uranustech.common.blockItemMap
import com.projecturanus.uranustech.common.groupBase
import com.projecturanus.uranustech.common.material.MaterialContainer
import net.fabricmc.fabric.api.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.BlockRenderLayer
import net.minecraft.block.BlockState
import net.minecraft.block.Material
import net.minecraft.item.ItemConvertible
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.DefaultedList
import net.minecraft.util.math.BlockPos
import net.minecraft.world.BlockView

open class MaterialBlock(override val stack: MaterialStack): Block(FabricBlockSettings.of(Material.STONE).build()), MaterialContainer, ItemConvertible {
    override fun getRenderLayer() = BlockRenderLayer.CUTOUT_MIPPED

    override fun asItem() = blockItemMap[this]

    override fun getPickStack(blockView: BlockView, blockPos: BlockPos, blockState: BlockState): ItemStack {
        return asItem()?.let(::ItemStack) ?: ItemStack.EMPTY
    }

    override fun addStacksForDisplay(itemGroup: ItemGroup, stackList: DefaultedList<ItemStack>) {
        if (itemGroup == groupBase) {
            asItem()?.let(::ItemStack)?.let(stackList::add)
        }
    }
}
