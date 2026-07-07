package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler implements IBien{

    private LocalDate comienzoContrato;
    private LocalDate finContrato;
    private double costoMensual;

    public Alquiler(LocalDate comienzoContrato, LocalDate finContrato, double costoMensual) {
        this.comienzoContrato = comienzoContrato;
        this.finContrato = finContrato;
        this.costoMensual = costoMensual;
    }

    @Override
    public double calcularValor(){
        return calcularCostoAlquiler();
    }

    @Override
    public double valorPrendario(){
        return 0.7 * this.calcularValor();
    }

    private double calcularCostoAlquiler(){
        int meses = (int) ChronoUnit.MONTHS.between(comienzoContrato, finContrato);
        return meses * costoMensual;
    }
}
