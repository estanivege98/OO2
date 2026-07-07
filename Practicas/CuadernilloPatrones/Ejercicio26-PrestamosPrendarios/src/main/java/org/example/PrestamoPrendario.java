package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrestamoPrendario implements IBien{
    private List<IBien> bienes;

    public PrestamoPrendario(List<IBien> bienes) {
        this.bienes = bienes;
    }

    public PrestamoPrendario() {
        this.bienes = new ArrayList<IBien>();
    }

    @Override
    public double calcularValor() {
        return this.valorPrendario();
    }

    public double valorPrendario() {
        return (this.bienes.stream().mapToDouble(bien -> bien.valorPrendario()).sum() * 0.5);
    }
}
