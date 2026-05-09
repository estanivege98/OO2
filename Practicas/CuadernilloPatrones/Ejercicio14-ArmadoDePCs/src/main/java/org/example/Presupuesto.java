package org.example;

import java.time.LocalDate;

public class Presupuesto {
    private String cliente;
    private LocalDate fecha;
    private Computadora computadora;

    public Presupuesto(String cliente, LocalDate fecha, Computadora computadora){
        this.cliente = cliente;
        this.fecha = fecha;
        this.computadora = computadora;
    }

    public String getCliente() {
        return this.cliente;
    }
    public LocalDate getFecha() {
        return this.fecha;
    }
    public Computadora getComputadora() {
        return this.computadora;
    }
}
