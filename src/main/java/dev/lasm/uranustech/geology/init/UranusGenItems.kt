package dev.lasm.uranustech.geology.init

import dev.lasm.uranustech.UranusTech
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.BucketItem
import net.neoforged.neoforge.registries.DeferredItem

object UranusGenItems {
    val ROCK_ITEMS: Map<String, DeferredItem<BlockItem>> =
        (UranusGenBlocks.NATURAL_STONES + UranusGenBlocks.ROCK_VARIANTS).mapValues { (id, block) ->
            UranusTech.ITEMS.registerSimpleBlockItem(id, block)
        }

    val CRUDE_OIL_BUCKET: DeferredItem<BucketItem> = UranusGenFluids.CRUDE_OIL_ENTRY.bucket
}
