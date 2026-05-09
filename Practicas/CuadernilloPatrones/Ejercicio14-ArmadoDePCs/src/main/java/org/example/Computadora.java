package org.example;

import java.util.ArrayList;
import java.util.List;

public class Computadora {
    private List<Componente> componentes;
    public Computadora() {
        this.componentes = new ArrayList<>();
    }

    public void agregarComponente(Componente comp) {
        this.componentes.add(comp);
    }
    public List<Componente> getComponentes() {
        return this.componentes;
    }
    public double getConsumo(){
        return this.componentes.stream().mapToDouble(Componente::getConsumo).sum();
    }
    public double getPrecio(){
        return this.componentes.stream().mapToDouble(Componente::getPrecio).sum() * 1.21;
    }
}
