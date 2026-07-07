package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Automovil extends Bien {
    private LocalDate modelo;
    private int kilometraje;
    private double costo0km;

    public Automovil(double liquedez, LocalDate modelo, int kilometraje, double costo0km) {
        super(liquedez);
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.costo0km = costo0km;
    }

    @Override
    public double calcularValor() {
        double valor = this.costo0km * this.kilometraje;
        return valor - ( (valor * 0.1) * this.aniosAntiguedad());
    }

    private int aniosAntiguedad(){
        return (int) ChronoUnit.YEARS.between(modelo, LocalDate.now());
    }
}
