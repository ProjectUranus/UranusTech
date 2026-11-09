package dev.lasm.uranustech.api.chemical.material.info

import dev.lasm.uranustech.api.chemical.material.properties.PropertyKey

val FLAG_REGISTRY = HashSet<MaterialFlag>()

class MaterialFlag(
    val name: String,
    val requiredFlags: Set<MaterialFlag>,
    val requiredProperties: Set<PropertyKey<*>>
) {
    init {
        FLAG_REGISTRY.add(this)
    }

    override fun toString(): String {
        return name
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MaterialFlag

        return name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}