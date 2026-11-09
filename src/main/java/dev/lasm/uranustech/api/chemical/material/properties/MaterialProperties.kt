package dev.lasm.uranustech.api.chemical.material.properties

class MaterialProperties {
    val propertyMap = mutableMapOf<PropertyKey<*>, Any>()

    fun <T> setProperty(key: PropertyKey<T>, value: T) {
        propertyMap[key] = value as Any
    }

    @Suppress("UNCHECKED_CAST")
    fun <T> getProperty(key: PropertyKey<T>): T? = propertyMap[key] as T?

    fun hasProperty(key: PropertyKey<*>): Boolean = propertyMap.containsKey(key)
}