package com.projecturanus.uranustech.common.util

import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.api.material.Constants
import com.projecturanus.uranustech.api.material.Constants.U
import com.projecturanus.uranustech.api.material.Constants.U2
import com.projecturanus.uranustech.api.material.Material
import com.projecturanus.uranustech.api.material.MaterialStack
import com.projecturanus.uranustech.api.material.WOOD
import com.projecturanus.uranustech.api.material.form.Form
import com.projecturanus.uranustech.api.material.info.StateInfo
import com.projecturanus.uranustech.common.blockMaterialMap
import com.projecturanus.uranustech.common.formMaterialMap
import com.projecturanus.uranustech.common.material.MaterialContainer
import net.minecraft.block.Block
import net.minecraft.inventory.Inventory
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.tag.BlockTags
import net.minecraft.tag.ItemTags
import net.minecraft.tag.Tag
import net.minecraft.text.TranslatableText
import net.minecraft.util.Identifier
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Vec3i
import java.awt.Color

typealias Temperature = Double

operator fun BlockPos.plus(other: Vec3i) = add(other)
operator fun BlockPos.minus(other: Vec3i) = subtract(other)

operator fun BlockPos.Mutable.plus(other: Vec3i) = add(other)
operator fun BlockPos.Mutable.minus(other: Vec3i) = subtract(other)
operator fun BlockPos.Mutable.plusAssign(other: Vec3i) {
    set(x + other.x, y + other.y, z + other.z)
}
operator fun BlockPos.Mutable.minusAssign(other: Vec3i) {
    set(x - other.x, y - other.y, z - other.z)
}

val Temperature.celsius
    get() = "${this + Constants.CELSIUS} ℃"

val Temperature.fahrenheit
    get() = "${32 + (this + Constants.CELSIUS * 1.8)} ℉"

val Temperature.kelvin
    get() = "${this} K"

operator fun Inventory.get(index: Int): ItemStack = getInvStack(index)
operator fun Inventory.set(index: Int, stack: ItemStack) = setInvStack(index, stack)

fun Inventory.asIterable(): Iterable<ItemStack> = Iterable { iterator() }

fun Inventory.iterator(): MutableIterator<ItemStack> {
    val inv = this
    return object : MutableIterator<ItemStack> {
        var index = 0

        override fun hasNext() = inv.invSize > index

        override fun next(): ItemStack {
            if (!hasNext()) throw NoSuchElementException()
            return getInvStack(index++)
        }

        override fun remove() {
            removeInvStack(index)
        }
    }
}

fun Material.getItem(form: Form) = formMaterialMap[this]?.get(form)
fun Material.getBlock(form: Form) = blockMaterialMap[this]?.get(form)

val Material.localizedName
    get() = TranslatableText("material.${this.identifier.namespace}.${this.identifier.path}")

val Form.localizedName
    get() = TranslatableText("form.$MODID.${this.name}")

fun Array<Int>.toColor(): Color = Color(get(0), get(1), get(2), get(3))

val MaterialStack.localizedName get(): TranslatableText {
    val stateInfo: StateInfo = material?.getInfo(Constants.STATE_INFO) ?: StateInfo()
    return TranslatableText("material.uranustech.stack",
        material?.localizedName ?: "?",
        "%.3f".format(amount / U.toDouble()),
        stateInfo.meltingPoint,
        stateInfo.boilingPoint,
        if (weight == -1.0) "?.???" else "%.3f".format(weight)
    )
}

val ItemStack.matStack: MaterialStack? get() {
    return when (item) {
        is MaterialContainer -> (item as MaterialContainer).stack
        Items.STICK -> MaterialStack(WOOD, U2.toDouble())
        else -> null
    }
}

fun Collection<Item>.asItemTag(identifier: Identifier, register: Boolean = true): Tag<Item> {
    val tag = Tag.Builder.create<Item>().add(*this.toTypedArray()).build(identifier)
    if (register)
        ItemTags.getContainer().entries[identifier] = tag
    return tag
}

fun Collection<Block>.asBlockTag(identifier: Identifier, register: Boolean = true): Tag<Block> {
    val tag = Tag.Builder.create<Block>().add(*this.toTypedArray()).build(identifier)
    if (register)
        BlockTags.getContainer().entries[identifier] = tag
    return tag
}
