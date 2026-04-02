package org.example;

public class Tijera implements Eleccion{
    public Tijera() {}
    @Override
    public String jugarContraPiedra(){
        return "Pierde";
    }
    @Override
    public String jugarContraPapel(){
        return "Gana";
    }
    @Override
    public String jugarContraTijera(){
        return "Empate";
    }
    @Override
    public String jugarContraLagarto(){
        return "Gana";
    }
    @Override
    public String jugarContraSpock(){
        return "Pierde";
    }

    @Override
    public String contra(Eleccion jugada){
        return jugada.jugarContraTijera();
    }
}
