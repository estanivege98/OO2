package org.example;

public abstract class Eleccion {
    public boolean esEmpate(Eleccion e1, Eleccion e2) {
        if (e1.getClass().equals(e2.getClass())) {
            return true;
        }
        return false;
    }

    public abstract String quienGana(Eleccion e1, Eleccion e2);

}
