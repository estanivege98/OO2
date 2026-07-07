package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Bien{

    private LocalDate comienzoContrato;
    private LocalDate finContrato;
    private double costoMensual;

    public Alquiler(double liquidez, LocalDate comienzoContrato, LocalDate finContrato, double costoMensual) {
        super(liquidez);
        this.comienzoContrato = comienzoContrato;
        this.finContrato = finContrato;
        this.costoMensual = costoMensual;
    }

    @Override
    public double calcularValor(){
        return calcularCostoAlquiler();
    }
    // Cambiar el 0.9 etc a una variable constante
    // arriba, es un composite con un Template

    private double calcularCostoAlquiler(){
        int meses = (int) ChronoUnit.MONTHS.between(comienzoContrato, finContrato);
        return meses * costoMensual;
    }
}
