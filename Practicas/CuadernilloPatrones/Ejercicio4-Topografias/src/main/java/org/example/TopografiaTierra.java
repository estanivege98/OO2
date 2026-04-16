package org.example;

public class TopografiaTierra implements Topografia{

    @Override
    public double proporcionAgua(){
        return 0;
    }

    @Override
    public double proporcionTierra(){
        return 1;
    }

    @Override
    public boolean esIgualA(Topografia t){
        return t.esIgualATierra(this);
    }

    @Override
    public boolean esIgualATierra(TopografiaTierra t) {
        return true;
    }
}
