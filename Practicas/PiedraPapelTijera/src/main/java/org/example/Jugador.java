package org.example;

public class Jugador {
    private Eleccion eleccion;

    public void jugar(Eleccion eleccionOponente){
        if(eleccion.esEmpate(this.eleccion, eleccionOponente)){
            System.out.println("Empate");
        }
        else{
            System.out.println(eleccion.quienGana(this.eleccion, eleccionOponente));
        }
    }
}
