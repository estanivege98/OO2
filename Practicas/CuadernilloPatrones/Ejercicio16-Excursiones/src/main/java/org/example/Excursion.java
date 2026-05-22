package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
    private List<Usuario> listaProvisorio;
    private List<Usuario> listaDefinitiva;
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precio;
    private int cupoMinimo;
    private int cupoMaximo;
    private IStateExcursion estadoExcursion;
    private String puntodeEncuentro;

    public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, double precio, int cupoMinimo, int cupoMaximo, IStateExcursion estadoExcursion,  String puntodeEncuentro) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
        this.cupoMinimo = cupoMinimo;
        this.cupoMaximo = cupoMaximo;
        this.listaProvisorio = new ArrayList<>();
        this.listaDefinitiva = new ArrayList<>();
        this.estadoExcursion = estadoExcursion;
        this.puntodeEncuentro = puntodeEncuentro;
    }

    public void setEstadoExcursion(IStateExcursion estadoExcursion) {
        this.estadoExcursion = estadoExcursion;
    }

    public void inscribir(Usuario unUsuario) {
        this.estadoExcursion.inscribir(unUsuario, this);
    }

    public String obtenerInformacion(){
        return estadoExcursion.obtenerInformacion(this);
    }

    public void agregarInscripto(Usuario unUsuario){
        this.listaProvisorio.add(unUsuario);
    }

    public void moverProvisorioADefinitivo(){
        this.listaDefinitiva.addAll(this.listaProvisorio);
        this.listaProvisorio.clear();
    }

    private int cantidadInscriptos(){
        return this.listaProvisorio.size();
    }

    public boolean seAlcanzoCupoMaximo(){
        return  (this.cantidadInscriptos() >= this.cupoMaximo);
    }

    public boolean seAlcanzoCupoMinimo(){
        return (this.cantidadInscriptos() >= this.cupoMinimo);
    }

    public List<String> obtenerMailInsciptos(){
        return this.listaProvisorio.stream().map(Usuario::getEmail).collect(Collectors.toList());
    }

    public int faltantesParaMinimo(){
        return Math.max(0, this.cupoMinimo - this.cantidadInscriptos());
    }

    public int faltantesParaMaximo(){
        return Math.max(0, this.cupoMaximo - this.cantidadInscriptos());
    }

    public String getNombre() {
        return this.nombre;
    }
    public LocalDate getFechaInicio() {
        return this.fechaInicio;
    }
    public LocalDate getFechaFin() {
        return this.fechaFin;
    }
    public double getPrecio() {
        return this.precio;
    }
    public String getPuntodeEncuentro() {
        return this.puntodeEncuentro;
    }
}
