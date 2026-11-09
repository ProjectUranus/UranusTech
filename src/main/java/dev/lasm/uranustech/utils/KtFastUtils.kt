package dev.lasm.uranustech.utils

import it.unimi.dsi.fastutil.ints.IntArrayList
import it.unimi.dsi.fastutil.ints.IntList

fun intListOf(vararg elements: Int): IntList = IntArrayList(elements.asList())