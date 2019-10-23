package com.projecturanus.uranustech.api.energy

/**
 * Energy stability system
 * Used to reduce calculations and optimize stable energy systems
 */
interface EnergyStability {
    val stabilized: Boolean
    val stableAmperage: Long
    val expectedStableTicks: Long
}
