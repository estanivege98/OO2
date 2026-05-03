package org.example;

import java.time.LocalDate;

public class AutoEnAlquiler {
    private String marca;
    private int cantidadPlazas;
    private double precioPorDia;
    private IPoliticaCancelacion politicaCancelacion;

    public AutoEnAlquiler(String marca, int cantidadPlazas, double precioPorDia, IPoliticaCancelacion politicaCancelacion){
        this.marca = marca;
        this.cantidadPlazas = cantidadPlazas;
        this.precioPorDia = precioPorDia;
        this.politicaCancelacion = politicaCancelacion;
    }

    public double getPrecioPorDia(){
        return this.precioPorDia;
    }

    public double montoAReembolsar(LocalDate fechaCancelacion, double monto, LocalDate fechaReserva){
        return this.politicaCancelacion.montoAReembolsar(fechaCancelacion, monto, fechaReserva);
    }
}
