package com.projecturanus.uranustech.api.energy

interface EnergyNet: EnergyInterface {
    val netInterfaces: MutableList<EnergyInterface>
}

class FlowEnergyNet(override val netInterfaces: MutableList<EnergyInterface> = mutableListOf()) : EnergyNet {
    override var maxAmperage: Long
        get() = getAmperage()
        set(value) {}

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
