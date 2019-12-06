package com.projecturanus.uranustech.energy

import com.projecturanus.uranustech.api.energy.EnergyContainer
import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

class TestEnergy {
    @Test
    fun testEnergy() {
        val container = EnergyContainer(1000, 5, 500)
        val container2: EnergyContainer = object : EnergyContainer(3000, 3, 0) {
            var random = Random()
            override fun getAmperage(): Long {
                return random.nextInt(8).toLong()
            }
        }
        container2.charge(container, {}) {}
        for (i in 0..4999) {
            container.tick()
            container2.tick()
        }
        println("Container 1: $container")
        println("Container 2: $container2")
        assertEquals(container2.stored, 500)
    }
}
