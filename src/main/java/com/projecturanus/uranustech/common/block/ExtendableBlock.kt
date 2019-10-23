package com.projecturanus.uranustech.common.block

import com.projecturanus.uranustech.common.property.PropertyContainer
import net.minecraft.block.Block
import net.minecraft.util.Identifier
import kotlin.reflect.KProperty0

open class ExtendableBlock(settings: Settings): Block(settings), PropertyContainer {
    override val properties: MutableMap<Identifier, KProperty0<*>> = mutableMapOf()
}
