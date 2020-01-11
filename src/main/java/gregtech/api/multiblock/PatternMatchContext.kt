package gregtech.api.multiblock

import it.unimi.dsi.fastutil.objects.Object2IntMap
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap

/**
 * Contains an context used for storing temporary data
 * related to current check and shared between all predicates doing it
 */
class PatternMatchContext(val delegate: Object2IntMap<String> = Object2IntOpenHashMap()): Object2IntMap<String> by delegate {
    fun reset() {
        delegate.clear()
    }

    override fun getOrDefault(key: Any?, defaultValue: Int): Int {
        return super.getOrDefault(key, defaultValue)
    }

    override fun toString(): String {
        return "PatternMatchContext{" +
                "data=" + delegate +
                '}'
    }
}
