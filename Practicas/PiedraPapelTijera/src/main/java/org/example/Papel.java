package org.example;

public class Papel extends Eleccion{

    public String quienGana(Eleccion e1, Eleccion e2) {
        if(e2.getClass().equals(Piedra.class)){
            return "Papel cubre piedra";
        }
        else if(e2.getClass().equals(Tijera.class)){
            return "Papel pierde con tijera";
        }
        else if(e2.getClass().equals(Spock.class)){
            return "Papel desaprueba Spock";
        }
        else return "Papel es comido por lagarto";
    }
}
