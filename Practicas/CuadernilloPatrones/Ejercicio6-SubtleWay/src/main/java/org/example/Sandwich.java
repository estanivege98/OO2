package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private List<IIngrediente> ingredientes;

    public Sandwich(){
        this.ingredientes = new ArrayList<IIngrediente>();
    }

    public void agregarIngrediente(IIngrediente ingredientes) {
        this.ingredientes.add(ingredientes);
    }

    public double calcularPrecio(){
        return this.ingredientes.stream().mapToDouble(i -> i.calcularPrecio()).sum();
    }

    public List<IIngrediente> obtenerIngredientes(){
        return this.ingredientes;
    }
}
