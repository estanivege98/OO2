package org.example;

public class Spock extends Eleccion{
    public String quienGana(Eleccion e1, Eleccion e2) {
        if(e2.getClass().equals(Tijera.class)){
            return "Spock rompe tijera";
        }
        else if(e2.getClass().equals(Piedra.class)){
            return "Spock vaporiza piedra";
        }
        else if(e2.getClass().equals(Lagarto.class)){
            return "Spock es envenenado por lagarto";
        }
        else{
            return "Spock es desaprobado por papel";
        }
    }
}
