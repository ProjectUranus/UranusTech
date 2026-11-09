package dev.lasm.uranustech.geology.data

import dev.lasm.uranustech.utils.rloc
import net.minecraft.core.registries.Registries
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item
import net.minecraft.world.level.material.Fluid

object UranusGenTags {
    val CRUDE_OIL_BUCKETS: TagKey<Item> = TagKey.create(Registries.ITEM, rloc("c", "buckets/crude_oil"))

    val CRUDE_OIL: TagKey<Fluid> = TagKey.create(Registries.FLUID, rloc("c", "crude_oil"))
}
