package com.projecturanus.uranustech.common.material

import com.projecturanus.uranustech.api.material.*
import com.projecturanus.uranustech.api.material.Constants.U
import com.projecturanus.uranustech.api.material.form.Form
import com.projecturanus.uranustech.api.material.form.Forms
import com.projecturanus.uranustech.api.tool.Tools
import com.projecturanus.uranustech.common.materialRegistry
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import net.minecraft.block.BlockState
import net.minecraft.block.Blocks
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import java.util.concurrent.ConcurrentHashMap

val vanillaItemMapper = ConcurrentHashMap<MaterialStack, ItemStack>()
val vanillaBlockMapper = ConcurrentHashMap<MaterialStack, BlockState>()

lateinit var vanillaItemMaterialMapper: (ItemStack) -> MaterialStack?
lateinit var vanillaBlockMaterialMapper: (BlockState) -> MaterialStack

fun setupDelegate() {
    fun stack(material: Material, form: Form? = null, amount: Double = U.toDouble(), temperature: Double = -1.0) = MaterialStack(material, form)

    runBlocking {
        async {
            materialRegistry.forEach { material ->
                launch {
                    when (material) {
                        IRON -> {
                            vanillaItemMapper[stack(material, Forms.INGOT)] = ItemStack(Items.IRON_INGOT)
                            vanillaItemMapper[stack(material, Forms.NUGGET)] = ItemStack(Items.IRON_NUGGET)
                            vanillaItemMapper[stack(material, Tools.SWORD)] = ItemStack(Items.IRON_SWORD)
                        }
                        GOLD -> {
                            vanillaItemMapper[stack(material, Forms.INGOT)] = ItemStack(Items.GOLD_INGOT)
                            vanillaItemMapper[stack(material, Forms.NUGGET)] = ItemStack(Items.GOLD_NUGGET)
                            vanillaItemMapper[stack(material, Tools.SWORD)] = ItemStack(Items.GOLDEN_SWORD)
                        }
                        STONE -> {
                            vanillaBlockMapper[stack(material, Forms.COBBLE)] = Blocks.COBBLESTONE.defaultState
                            vanillaBlockMapper[stack(material, Forms.STONE)] = Blocks.STONE.defaultState
                        }
                    }
                }
            }
        }
    }
    vanillaItemMaterialMapper = {
        when (it.item) {
            Items.STICK -> stack(WOOD, Forms.STICK)
            Items.ACACIA_LOG, Items.BIRCH_LOG, Items.DARK_OAK_LOG, Items.JUNGLE_LOG, Items.OAK_LOG, Items.SPRUCE_LOG -> stack(WOOD, Forms.STONE)
            Items.ANVIL -> stack(IRON, Forms.OTHER, U * 6.toDouble())
            Items.BRICK -> stack(BRICK, Forms.INGOT)
            Items.BRICKS -> stack(BRICK, Forms.STONE)
            Items.ANDESITE -> stack(ANDESITE, Forms.STONE)
            Items.STONE -> stack(STONE, Forms.STONE)
            else -> null
        }
    }
}
