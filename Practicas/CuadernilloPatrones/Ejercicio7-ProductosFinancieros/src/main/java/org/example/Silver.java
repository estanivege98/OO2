package org.example;

public class Silver extends Membresia {

    @Override
    public double getTasaPlazoFijo() {
        return 0.05;
    }

    @Override
    public int getMinimoDiasPlazoFijo(){
        return 35;
    }

    @Override
    public int getParkingBonos(){
        return 72;
    }
}
