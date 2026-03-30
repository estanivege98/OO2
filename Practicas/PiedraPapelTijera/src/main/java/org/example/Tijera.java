package org.example;

public class Tijera extends Eleccion{

    public String quienGana(Eleccion e1, Eleccion e2) {
        if(e2.getClass().equals(Piedra.class)){
            return "Tijera pierde con piedra";
        }
        else if(e2.getClass().equals(Papel.class)){
            return "Tijera corta papel" ;
        }
        else if(e2.getClass().equals(Lagarto.class)){
            return "Tiejra decapita lagarto";
        }
        else return "Tijera es rota por Spock";
    }
}
