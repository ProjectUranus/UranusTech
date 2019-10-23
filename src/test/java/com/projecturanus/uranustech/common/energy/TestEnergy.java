package com.projecturanus.uranustech.common.energy;

import com.projecturanus.uranustech.api.energy.EnergyContainer;
import org.junit.Test;

import java.util.Random;

public class TestEnergy {
    @Test
    public void testEnergy() {
        EnergyContainer container = new EnergyContainer(1000, 5, 500);
        EnergyContainer container2 = new EnergyContainer(3000, 3, 0) {
            Random random = new Random();

            @Override
            public long getAmperage() {
                return random.nextInt(8);
            }
        };
        for (int i = 0; i < 5000; i++) {
            container.tick();
            container2.tick();
        }
        System.out.println("Container 1: " + container);
        System.out.println("Container 2: " + container2);
    }
}
