package org.example;

public class Espada implements Arma {
    public int obtenerDaño(Armadura armadura) {
        return armadura.calcularDaño(this);
    }
}
