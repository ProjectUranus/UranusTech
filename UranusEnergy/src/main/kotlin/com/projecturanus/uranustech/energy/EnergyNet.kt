package com.projecturanus.uranustech.energy

interface EnergyNet: EnergyInterface {
    val netInterfaces: List<EnergyInterface>

    fun addInterface(energyInterface: EnergyInterface)
    fun removeInterface(energyInterface: EnergyInterface)
}

interface TickableEnergyNet : EnergyNet, Tickable

/**
 * Flowing energy net implementation, keeping energy load balancing
 */
class FlowEnergyNet(override val netInterfaces: MutableList<EnergyInterface> = mutableListOf()) : TickableEnergyNet {
    val capacitors = mutableListOf<EnergyCapacitor>()
    val chargedInterfaces = mutableListOf<Int>()

    val charging = mutableListOf<Pair<EnergyInterface, Long>>()

    override fun addInterface(energyInterface: EnergyInterface) {
        netInterfaces += energyInterface
        flush()
    }

    override fun removeInterface(energyInterface: EnergyInterface) {
        netInterfaces -= energyInterface
        flush()
    }

    override var maxAmperage: Long
        get() = netInterfaces.asSequence().map { it.maxAmperage }.sum()
        set(value) {}

    override fun getAmperage(): Long {
        return netInterfaces.asSequence().map { it.getAmperage() }.sum()
    }

    override fun charge(maxAmount: Long): Long {
        return 0
    }

    override fun discharge(maxAmount: Long): Long {
        return 0
    }

    override fun tick() {

    }

    fun flush() {
        chargedInterfaces.clear()
        capacitors.clear()
        capacitors.addAll(netInterfaces.asSequence().filter { it is EnergyCapacitor }.map { it as EnergyCapacitor })
        capacitors.asSequence().filter { it.isFull }.forEachIndexed { index, _ -> chargedInterfaces += index }
    }

}

class WeightedEnergyNet(override val netInterfaces: MutableList<EnergyInterface>, override var maxAmperage: Long) : EnergyNet {
    override fun addInterface(energyInterface: EnergyInterface) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeInterface(energyInterface: EnergyInterface) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAmperage(): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun charge(maxAmount: Long): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun discharge(maxAmount: Long): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
