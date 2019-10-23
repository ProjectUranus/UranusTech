package com.projecturanus.uranustech.common.property

import net.minecraft.util.Identifier
import kotlin.reflect.KProperty0

interface PropertyContainer {
    val properties: MutableMap<Identifier, KProperty0<*>>
}
