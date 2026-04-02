package org.example;

public class Lagarto implements Eleccion{
    public Lagarto(){

    }
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
        return "Pierde";
    }
    @Override
    public String jugarContraLagarto(){
        return "Empate";
    }
    @Override
    public String jugarContraSpock(){
        return "Gana";
    }

    @Override
    public String contra(Eleccion jugada) {
        return jugada.jugarContraLagarto();
    }
}
