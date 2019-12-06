package com.projecturanus.uranustech.energy

/**
 * An energy handler, stores or control energy flowing
 */
interface EnergyHandler {
    /**
     * Energy stored
     */
    var stored: Long

    /**
     * Energy capacity
     */
    var capacity: Long

    var maxAmperage: Long

    val isFull get() = stored >= capacity
    val free get() = capacity - stored

    fun getAmperage(): Long

    /**
     * Start charging energy from an energy handler.
     * Energy will be processed next tick.
     * @param onCharge receive energy transmitted every tick
     * @return transmitted electric current amount
     */
    fun charge(charger: EnergyHandler, onCharge: (Long) -> Unit, onComplete: () -> Unit)

    /**
     * Connect two energy handler and balance them.
     * Energy will be processed next tick.
     * @param onFlow receive energy transmitted every tick
     * @return transmitted electric current amount
     */
    fun flow(target: EnergyHandler, onFlow: (Long) -> Unit, onComplete: () -> Unit)

    fun flowBetween(target: EnergyHandler): FlowEnergyNet
}
