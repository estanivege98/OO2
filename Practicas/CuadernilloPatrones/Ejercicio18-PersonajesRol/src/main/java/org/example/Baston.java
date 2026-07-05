package org.example;

public class Baston implements Arma {
    public int obtenerDaño(Armadura armadura) {
        return armadura.calcularDaño(this);
    }
}
