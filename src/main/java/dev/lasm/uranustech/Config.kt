package dev.lasm.uranustech

import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.neoforged.neoforge.common.ModConfigSpec
import java.util.function.Predicate
import java.util.function.Supplier

object Config {
    private val BUILDER = ModConfigSpec.Builder()

    val LOG_DIRT_BLOCK: ModConfigSpec.BooleanValue = BUILDER
        .comment("Whether to log the dirt block on common setup")
        .define("logDirtBlock", true)

    val MAGIC_NUMBER: ModConfigSpec.IntValue = BUILDER
        .comment("A magic number")
        .defineInRange("magicNumber", 42, 0, Int.MAX_VALUE)

    val MAGIC_NUMBER_INTRODUCTION: ModConfigSpec.ConfigValue<String> = BUILDER
        .comment("What you want the introduction message to be for the magic number")
        .define("magicNumberIntroduction", "The magic number is... ")

    // a list of strings that are treated as resource locations for items
    val ITEM_STRINGS: ModConfigSpec.ConfigValue<MutableList<out String>> = BUILDER
        .comment("A list of items to log on common setup.")
        .defineListAllowEmpty(
            "items",
            mutableListOf("minecraft:iron_ingot"),
            { "" },
            ::validateItemName
        )

    val SPEC: ModConfigSpec = BUILDER.build()

    private fun validateItemName(obj: Any?): Boolean {
        return obj is String && BuiltInRegistries.ITEM.containsKey(ResourceLocation.parse(obj))
    }
}
