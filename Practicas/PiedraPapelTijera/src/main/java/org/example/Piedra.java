package org.example;

public class Piedra extends Eleccion{

    public String quienGana(Eleccion e1, Eleccion e2) {
        if(e2.getClass().equals(Papel.class)){
            return "Piedra pierde con papel";
        }
        else if(e2.getClass().equals(Tijera.class)){
            return "Piedra aplasta tijera";
        }
        else if(e2.getClass().equals(Lagarto.class)){
            return "Piedra aplasta lagarto";
        }
        else {
            return "Piedra es vaporizada por Spock";
        }
    }
}
