package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Automovil implements IBien {
    private LocalDate modelo;
    private int kilometraje;
    private double costo0km;

    public Automovil(LocalDate modelo, int kilometraje, double costo0km) {
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.costo0km = costo0km;
    }

    @Override
    public double calcularValor() {
        double valor = this.costo0km * this.kilometraje;
        return valor - ( (valor * 0.1) * this.aniosAntiguedad());
    }

    @Override
    public double valorPrendario() {
        return 0.7 * this.calcularValor();
    }

    private int aniosAntiguedad(){
        return (int) ChronoUnit.YEARS.between(modelo, LocalDate.now());
    }
}
