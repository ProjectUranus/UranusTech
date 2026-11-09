package dev.lasm.uranustech.api.chemical.material.properties

class PropertyKey<T>(val name: String) {
    companion object {
        val TOOL = PropertyKey<ToolProperty>("tool")
    }
}