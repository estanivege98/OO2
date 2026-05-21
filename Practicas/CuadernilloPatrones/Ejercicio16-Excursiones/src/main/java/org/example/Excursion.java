package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
    private List<Usuario> listaProvisorio;
    private List<Usuario> listaDefinitiva;
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precio;
    private int cupoMinimo;
    private int cupoMaximo;

    public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, double precio, int cupoMinimo, int cupoMaximo) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
        this.cupoMinimo = cupoMinimo;
        this.cupoMaximo = cupoMaximo;
        this.listaProvisorio = new ArrayList<>();
        this.listaDefinitiva = new ArrayList<>();
    }
}
