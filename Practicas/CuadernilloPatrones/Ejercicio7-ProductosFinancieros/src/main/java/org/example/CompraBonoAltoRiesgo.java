package org.example;

import java.time.LocalDate;
import java.util.Random;

public class CompraBonoAltoRiesgo extends ProductoFinanciero{
    private int parking;


    public CompraBonoAltoRiesgo(LocalDate fechaOperacion, int parking){
        super(fechaOperacion);
        this.parking = parking;
    }
    @Override
    public double retornoInversion(double montoInicial){
        Random rand =  new Random();
        int variacion = rand.nextInt(141) - 70;
        return montoInicial + (montoInicial * variacion / 100.0);
    }

}
