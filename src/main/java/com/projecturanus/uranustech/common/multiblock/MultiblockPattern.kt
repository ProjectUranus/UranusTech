package com.projecturanus.uranustech.common.multiblock

class MultiblockPattern {
}

class PatternEntry {
}

class PatternBuilder {
    val pattern = MultiblockPattern()
    val patterns = arrayListOf<List<String>>()

    fun layer(index: Int = patterns.size, vararg pattern: String) {
        patterns.add(index, pattern.toList())
    }

    fun ranged() {

    }

    fun assignEntry(assignee: MutableList<Pair<String, Any>>.() -> Unit) {

    }

    fun build() = pattern
}

fun multiblock(init: PatternBuilder.() -> Unit): MultiblockPattern {
    val builder = PatternBuilder()
    builder.init()
    return builder.build()
}
