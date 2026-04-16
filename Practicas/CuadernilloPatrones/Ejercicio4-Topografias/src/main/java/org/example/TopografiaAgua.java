package org.example;

public class TopografiaAgua implements Topografia{

    @Override
    public double proporcionAgua(){
        return 1;
    }

    @Override
    public double proporcionTierra(){
        return 0;
    }

    @Override
    public boolean esIgualA(Topografia t){
        return t.esIgualAAgua(this);
    }

    @Override
    public boolean esIgualAAgua(TopografiaAgua t) {
        return true;
    }
}
