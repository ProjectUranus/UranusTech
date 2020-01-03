package gregtech.api.multiblock

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
import java.util.function.Supplier

/**
 * Contains an context used for storing temporary data
 * related to current check and shared between all predicates doing it
 */
class PatternMatchContext {
    private val data: MutableMap<String, Any?> = Object2ObjectOpenHashMap()
    fun reset() {
        data.clear()
    }

    operator fun set(key: String, value: Any?) {
        data[key] = value
    }

    fun getInt(key: String?): Int {
        return if (data.containsKey(key)) data[key] as Int else 0
    }

    fun increment(key: String, value: Int) {
        set(key, getOrDefault(key, 0) + value)
    }

    fun <T> getOrDefault(key: String?, defaultValue: T): T {
        return data.getOrDefault(key, defaultValue) as T
    }

    operator fun <T> get(key: String?): T? {
        return data[key] as T?
    }

    fun <T> getOrCreate(key: String, creator: Supplier<T>): T? {
        var result: T? = get(key)
        if (result == null) {
            result = creator.get()
            set(key, result)
        }
        return result
    }

    fun <T> getOrPut(key: String, initialValue: T): T? {
        var result: T? = get(key)
        if (result == null) {
            result = initialValue
            set(key, result)
        }
        return result
    }

    override fun toString(): String {
        return "PatternMatchContext{" +
                "data=" + data +
                '}'
    }
}
