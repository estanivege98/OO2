package org.example;

public class Papel implements Eleccion{

    public Papel(){}
    @Override
    public String jugarContraPiedra(){
        return "Gana";
    }
    @Override
    public String jugarContraPapel(){
        return "Empate";
    }
    @Override
    public String jugarContraTijera(){
        return "Pierde";
    }
    @Override
    public String jugarContraLagarto(){
        return "Pierde";
    }
    @Override
    public String jugarContraSpock(){
        return "Gana";
    }
    @Override
    public String contra(Eleccion jugada) {
        return jugada.jugarContraPapel();
    }
}
