package org.example;

public class Silver extends Membresia{

    public Silver(){
        super();
    }

    @Override
    public double getTasaPlazoFijo() {
        return 0;
    }

    public int getMinimoDiasPlazoFijo(){
        return 0;
    }

    public int getParkingBonos(){
        return 0;
    }
}
