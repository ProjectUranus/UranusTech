package dev.lasm.uranustech.geology.init

import dev.lasm.uranustech.api.chemical.material.ref
import dev.lasm.uranustech.data.FluidGeneratorModel
import dev.lasm.uranustech.data.UranusTechMaterialFluids

/** Geology uses the material registry's crude oil, including its block and bucket. */
object UranusGenFluids {
    val CRUDE_OIL_ENTRY = requireNotNull(UranusTechMaterialFluids[ref("crude_oil"), FluidGeneratorModel.LIQUID]) {
        "Crude oil must be registered before initializing geology"
    }
    val CRUDE_OIL_TYPE = CRUDE_OIL_ENTRY.type
    val CRUDE_OIL = CRUDE_OIL_ENTRY.source
    val FLOWING_CRUDE_OIL = CRUDE_OIL_ENTRY.flowing
}
