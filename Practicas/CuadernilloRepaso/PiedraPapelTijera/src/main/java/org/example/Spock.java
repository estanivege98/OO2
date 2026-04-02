package org.example;

public class Spock implements Eleccion{
    public Spock() {}
    @Override
    public String contra(Eleccion jugada) {
        return jugada.jugarContraSpock();
    }
    @Override
    public String jugarContraPiedra() {
        return "Gana";
    }
    @Override
    public String jugarContraPapel(){
        return "Pierde";
    }
    @Override
    public String jugarContraTijera(){
        return "Gana";
    }
    @Override
    public String jugarContraLagarto(){
        return "Pierde";
    }
    @Override
    public String jugarContraSpock() {
        return "Empate";
    }

}
