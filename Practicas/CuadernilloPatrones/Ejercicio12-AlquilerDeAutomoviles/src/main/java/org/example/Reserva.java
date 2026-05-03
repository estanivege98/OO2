package org.example;

import java.time.LocalDate;

public class Reserva {
    private LocalDate fecha;
    private int cantidadDias;
    private AutoEnAlquiler autoEnAlquiler;
    private Usuario conductor;

    public Reserva(LocalDate fecha, int cantidadDias, AutoEnAlquiler automovil, Usuario conductor){
        this.fecha = fecha;
        this.cantidadDias = cantidadDias;
        this.autoEnAlquiler = automovil;
        this.conductor = conductor;
    }

    public double montoAPagar(){
        double autoPrecioPorDia = this.autoEnAlquiler.getPrecioPorDia();
        return (autoPrecioPorDia * cantidadDias);
    }

    public double montoAReembolsar(LocalDate fechaCancelacion){
        return this.autoEnAlquiler.montoAReembolsar(fechaCancelacion, this.montoAPagar(), this.fecha);
    }
}
