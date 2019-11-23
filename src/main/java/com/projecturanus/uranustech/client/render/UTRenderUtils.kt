package com.projecturanus.uranustech.client.render

import net.minecraft.client.font.TextRenderer

fun TextRenderer.drawStringsBounded(list: Iterable<String>, x: Float, y: Float, maxX: Int, color: Int) {
    list.flatMap { wrapStringToWidth(it, maxX).split("\n") }.forEachIndexed { index, s ->
        draw(s, x, y + index * 9, color)
    }
}
