package dev.lasm.uranustech.geology.api

import net.minecraft.util.StringRepresentable

enum class HostRockType(private val id: String) : StringRepresentable {
    STONE("stone"),
    DEEPSLATE("deepslate"),
    GRANITE("granite"),
    DIORITE("diorite"),
    ANDESITE("andesite"),
    GRANITE_BLACK("granite_black"),
    GRANITE_RED("granite_red"),
    THOLEIITIC_BASALT("tholeiitic_basalt"),
    MARBLE("marble"),
    LIMESTONE("limestone"),
    KOMATIITE("komatiite"),
    GREENSCHIST("greenschist"),
    BLUESCHIST("blueschist"),
    KIMBERLITE("kimberlite"),
    QUARTZITE("quartzite");

    override fun getSerializedName(): String = id
}
