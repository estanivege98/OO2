package org.example;

public class Gold extends Membresia{

    @Override
    public double getTasaPlazoFijo(){
        return 0.06;
    }

    @Override
    public int getMinimoDiasPlazoFijo(){
        return 30;
    }

    @Override
    public int getParkingBonos(){
        return 24;
    }
}
