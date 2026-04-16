package org.example;

public class TopografiaPantano implements Topografia{

    @Override
    public double proporcionAgua() {
        return 0.7;
    }

    @Override
    public double proporcionTierra() {
        return 0.3;
    }

    @Override
    public boolean esIgualA(Topografia t) {
        return t.esIgualAPantano(this);
    }

    @Override
    public boolean esIgualAPantano(TopografiaPantano t) {
        return true;
    }
}
