package com.projecturanus.uranustech.common.util

import com.projecturanus.uranustech.api.material.Material
import com.projecturanus.uranustech.api.material.compound.Compound
import com.projecturanus.uranustech.api.material.element.Element

fun compound(init: Compound.() -> Unit): Compound {
    val compound = Compound()
    compound.init()
    return compound
}

fun <T> material(constructor: () -> T, init: T.() -> Unit): T where T: Material {
    val material = constructor()
    material.init()
    return material
}

fun compound(vararg components: Pair<Element, Int>) = compound {
    components.forEach { addComponent(it.first, it.second) }
}
