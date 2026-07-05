package org.example;

public class Martillo implements Arma {
    public int obtenerDaño(Armadura armadura) {
        return armadura.calcularDaño(this);
    }
}
