package org.example;

public class LightMix extends ProcessStep {

    @Override
    public boolean basicExecute(MixingTank tank) {
        double temp = tank.temperature();
        tank.heatPower(100);
        try {
            delay(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(tank.temperature() - temp == 10 ) {
            tank.mixerPower(5);
            return true;
        } else {
            return false;
        }
    }
}
