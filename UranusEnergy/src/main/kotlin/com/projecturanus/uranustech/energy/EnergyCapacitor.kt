package com.projecturanus.uranustech.energy

interface EnergyInterface {
    /**
     * Max amperage output
     */
    var maxAmperage: Long

    /**
     * Amperage at current tick
     */
    fun getAmperage(): Long

    fun charge(maxAmount: Long): Long
    fun discharge(maxAmount: Long): Long
}

/**
 * An energy handler, stores or control energy flowing
 */
interface EnergyCapacitor: EnergyInterface, Tickable {
    /**
     * Energy stored
     */
    var stored: Long

    /**
     * Energy capacity
     */
    var capacity: Long

    val isFull get() = stored >= capacity
    val free get() = capacity - stored

    override fun charge(maxAmount: Long): Long {
        assert(maxAmount > 0)
        return if (maxAmount > free) {
            val currentFree = free
            stored = capacity
            currentFree
        } else {
            stored += maxAmount
            maxAmount
        }
    }

    override fun discharge(maxAmount: Long): Long {
        assert(maxAmount > 0)
        return if (maxAmount > stored) {
            val currentStored = stored
            stored = 0
            currentStored
        } else {
            stored -= maxAmount
            maxAmount
        }
    }

    /**
     * Start charging energy from an energy handler.
     * Energy will be processed next tick.
     * @param onCharge receive energy transmitted every tick
     * @return transmitted electric current amount
     */
    fun charge(charger: EnergyCapacitor, onCharge: (Long) -> Unit, onComplete: () -> Unit)

    /**
     * Connect two energy handler and balance them.
     * Energy will be processed next tick.
     * @param onFlow receive energy transmitted every tick
     * @return transmitted electric current amount
     */
    fun flow(target: EnergyCapacitor, onFlow: (Long) -> Unit, onComplete: () -> Unit)

    fun flowBetween(target: EnergyCapacitor): FlowEnergyNet
}
