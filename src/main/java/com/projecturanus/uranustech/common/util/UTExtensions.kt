package com.projecturanus.uranustech.common.util

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.google.gson.JsonPrimitive
import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.api.material.Constants
import com.projecturanus.uranustech.api.material.Material
import com.projecturanus.uranustech.api.material.MaterialAPI
import com.projecturanus.uranustech.api.material.MaterialStack
import com.projecturanus.uranustech.api.material.form.Form
import com.projecturanus.uranustech.api.worldgen.Rock
import com.projecturanus.uranustech.common.material.MaterialContainer
import com.projecturanus.uranustech.common.material.vanillaItemMaterialMapper
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.inventory.CraftingInventory
import net.minecraft.inventory.Inventory
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.tag.BlockTags
import net.minecraft.tag.ItemTags
import net.minecraft.tag.Tag
import net.minecraft.text.TranslatableText
import net.minecraft.util.Identifier
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Position
import net.minecraft.util.math.Vec3i
import org.dizitart.no2.Document
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

val Position.first get() = x
val Position.second get() = y
val Position.third get() = z

val Vec3i.first get() = x
val Vec3i.second get() = y
val Vec3i.third get() = z

operator fun Inventory.get(index: Int): ItemStack = getInvStack(index)
operator fun Inventory.set(index: Int, stack: ItemStack) = setInvStack(index, stack)

operator fun CraftingInventory.get(x: Int, y: Int): ItemStack = getInvStack(x + y * width)
operator fun CraftingInventory.set(x: Int, y: Int, stack: ItemStack) = setInvStack(x + y * width, stack)

val CraftingInventory.offset: Pair<Int, Int>
    get() {
        for (x in 0 until width)
            for (y in 0 until height)
                if (!this[x, y].isEmpty)
                    return x to y
        return 0 to 0
}

fun CraftingInventory.getOffsetStack(x: Int, y: Int) = get(x + offset.first, y + offset.second)

fun Inventory.asIterable(): Iterable<ItemStack> = Iterable { iterator() }

class InventoryIterator(val inv: Inventory) : MutableListIterator<ItemStack> {
    var index = 0

    override fun hasNext() = inv.invSize > index

    override fun next(): ItemStack {
        if (!hasNext()) throw NoSuchElementException()
        return inv.getInvStack(index++)
    }

    override fun remove() {
        inv.removeInvStack(index)
    }

    override fun hasPrevious(): Boolean {
        return index > 0 && inv[index].isEmpty
    }

    override fun nextIndex() = index + 1

    override fun previous() = if (index > 0) inv[index--] else ItemStack.EMPTY

    override fun previousIndex() = index - 1

    override fun add(element: ItemStack) {
        TODO("")
    }

    override fun set(element: ItemStack) {
        inv[index] = element
    }
}


fun Inventory.iterator() = InventoryIterator(this)

fun Material.getItem(form: Form): ItemStack = MaterialAPI.INSTANCE.getMaterialItem(MaterialStack(this, form))
fun Material.getBlock(form: Form): BlockState? = MaterialAPI.INSTANCE.getMaterialBlock(MaterialStack(this, form))

val Material.localizedName
    get() = TranslatableText("material.${this.identifier.namespace}.${this.identifier.path}")

val Rock.localizedName
    get() = TranslatableText("material.${this.identifier.namespace}.${this.identifier.path}")

val Form.localizedName
    get() = TranslatableText("form.$MODID.${this.asString()}")


fun Array<Int>.toColor(): Color = Color(get(0), get(1), get(2), get(3))

val ItemStack.matStack: MaterialStack? get() {
    return when (item) {
        is MaterialContainer -> (item as MaterialContainer).stack
        else -> vanillaItemMaterialMapper(this)
    }
}

fun ItemStack.hasMaterialData() = matStack != null

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

fun JsonObject.toDocument(): Document {
    val document = Document()
    entrySet().forEach { (id, element) ->
        document[id] =
            if (element is JsonPrimitive) {
                if (element.isBoolean) element.asBoolean
                if (element.isNumber) element.asNumber
                else element.asString
            } else if (element is JsonArray) {
                element.filterIsInstance<JsonObject>().map { it.asJsonObject.toDocument() }
            } else if (element is JsonObject) {
                element.toDocument()
            } else null
    }
    return document
}
