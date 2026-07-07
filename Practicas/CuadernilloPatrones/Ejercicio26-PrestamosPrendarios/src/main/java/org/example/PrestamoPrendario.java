package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrestamoPrendario extends Bien{
    private List<Bien> bienes;
    private static final double liquedez = 0.5;
    public PrestamoPrendario(List<Bien> bienes) {
        super(liquedez);
        this.bienes = bienes;
    }

    public PrestamoPrendario() {
        super(liquedez);
        this.bienes = new ArrayList<Bien>();
    }

    @Override
    public double calcularValor() {
        return this.bienes.stream().mapToDouble(bien -> bien.valorPrendario()).sum()    ;
    }

    public double valorPrendario() {
        return ( calcularValor()* liquedez );
    }

    public void agregarBien(Bien bien){
        this.bienes.add(bien);
    }
    public void eliminarBien(Bien bien){
        this.bienes.remove(bien);
    }
}
