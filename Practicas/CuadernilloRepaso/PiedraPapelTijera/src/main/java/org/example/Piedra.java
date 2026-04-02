package org.example;

public class Piedra implements Eleccion{
    public Piedra() {}
    @Override
    public String jugarContraPiedra(){
        return "Empate";
    }
    @Override
    public String jugarContraPapel(){
        return "Pierde";
    }
    @Override
    public String jugarContraLagarto(){
        return "Gana";
    }
    @Override
    public String jugarContraTijera(){
        return "Gana";
    }
    @Override
    public String jugarContraSpock(){
        return "Pierde";
    }
    @Override
    public String contra(Eleccion jugada){
        return jugada.jugarContraPiedra();
    }
}
