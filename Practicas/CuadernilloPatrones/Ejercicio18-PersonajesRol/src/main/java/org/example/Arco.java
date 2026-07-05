package org.example;

public class Arco implements Arma {
    public int obtenerDaño(Armadura armadura) {
        return armadura.calcularDaño(this);
    }
}
