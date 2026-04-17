package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class ElementoQuimicoFactory {

    public Union getUnion(List<ElementoQuimico> elementos){
        return new Union(elementos);
    }

    public Atomo getHidrogeno(){
        return new Atomo("Hidrogeno", "H", 1, 1, false);
    }

    public Atomo getOxigeno(){
        return new Atomo("Oxigeno", "O", 16, -2, false);
    }

    public Atomo getCloro(){
        return new Atomo("Cloro", "Cl", 35, -1, false);
    }

    public Atomo getSodio(){
        return new Atomo("Sodio", "Na", 23, 1, true);
    }

    public Atomo getCalcio(){
        return new Atomo("Calcio", "Ca", 40, 2, true);
    }
}
