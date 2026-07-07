package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Coseguro implements ICoseguro {
    private String nombre;
    private int descuento;
    private LocalDate fechaIngreso;
    private double montoCoberturaViaje;

    public Coseguro(String nombre, int descuento, LocalDate fechaIngreso, double montoCoberturaViaje) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.fechaIngreso = fechaIngreso;
        this.montoCoberturaViaje = montoCoberturaViaje;
    }

    @Override
    public int getDescuento() {
        return this.descuento;
    }

    @Override
    public int getAntiguedad() {
        return (int) ChronoUnit.DAYS.between(fechaIngreso, LocalDate.now());
    }

    @Override
    public double getMontoCoberturaViaje() {
        return this.montoCoberturaViaje;
    }
}
