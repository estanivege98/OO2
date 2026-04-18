package org.example;
// Clase director
public class SubtleWay {
    //private Sandwich constructor;

    public Sandwich pedirSandwich(SandwichBuilder constructor){
        return constructor.obtenerSandwich();
    }
}
