package com.projecturanus.uranustech.api.energy

import com.google.common.primitives.Longs.min
import kotlin.math.abs

open class EnergyContainer(override var capacity: Long, override var maxAmperage: Long, override var stored: Long = 0) : EnergyCapacitor {
    val charges = mutableListOf<Triple<EnergyCapacitor, (Long) -> Unit, () -> Unit>>()
    val flows = mutableListOf<Triple<EnergyCapacitor, (Long) -> Unit, () -> Unit>>()

    override fun tick() {
        charges.removeAll { (isFull || it.first.stored <= 0).apply { if (this) it.third() } }
        charges.forEach { (handler, listener) ->
            val amperage = min(handler.getAmperage(), getAmperage(), handler.stored, free)
            listener(amperage)
            stored += amperage
            handler.stored -= amperage
        }
        flows.removeAll { (abs(it.first.stored - stored) <= 1 || isFull || it.first.isFull).apply { if (this) it.third() } }
        flows.forEach { (handler, listener) ->
            if (stored > handler.stored) {
                val amperage = min(handler.getAmperage(), getAmperage(), stored - handler.stored, handler.free)
                stored -= amperage
                handler.stored += amperage
                listener(-amperage)
            } else {
                val amperage = min(handler.getAmperage(), getAmperage(), handler.stored - stored, free)
                stored += amperage
                handler.stored -= amperage
                listener(amperage)
            }
        }
    }

    override fun getAmperage() = maxAmperage

    override fun charge(charger: EnergyCapacitor, onCharge: (Long) -> Unit, onComplete: () -> Unit) {
        charges += Triple(charger, onCharge, onComplete)
    }

    override fun flow(target: EnergyCapacitor, onFlow: (Long) -> Unit, onComplete: () -> Unit) {
        flows += Triple(target, onFlow, onComplete)
    }

    override fun flowBetween(target: EnergyCapacitor): FlowEnergyNet {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun toString(): String {
        return "EnergyContainer(capacity=$capacity, maxAmperage=$maxAmperage, stored=$stored)"
    }
}

/**
 * Transmit energy instantly
 */
class InstantEnergyContainer(override var stored: Long = 0, override var capacity: Long) : EnergyCapacitor {
    override var maxAmperage = Long.MAX_VALUE

    override fun getAmperage() = Long.MAX_VALUE

    override fun charge(charger: EnergyCapacitor, onCharge: (Long) -> Unit, onComplete: () -> Unit) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun flow(target: EnergyCapacitor, onFlow: (Long) -> Unit, onComplete: () -> Unit) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun flowBetween(target: EnergyCapacitor): FlowEnergyNet {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun tick() {
        // Do nothing
    }
}
