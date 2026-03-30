package org.example;

public class Lagarto extends Eleccion{
    public String quienGana(Eleccion e1, Eleccion e2) {
        if(e2.getClass().equals(Papel.class)){
            return "Lagarto come papel";
        }
        else if(e2.getClass().equals(Spock.class)){
            return "Lagarto envenena Spock";
        }
        else if(e2.getClass().equals(Tijera.class)){
            return "Lagarto es decapitado por tijera";
        }
        else {
            return "Lagarto es aplastado por piedra";
        }
    }
}
