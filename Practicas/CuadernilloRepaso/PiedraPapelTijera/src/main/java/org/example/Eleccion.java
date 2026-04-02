package org.example;

public interface Eleccion {

    public String jugarContraPiedra();
    public String jugarContraPapel();
    public  String jugarContraTijera();
    public  String jugarContraLagarto();
    public  String jugarContraSpock();

    public String contra(Eleccion jugada);
}
