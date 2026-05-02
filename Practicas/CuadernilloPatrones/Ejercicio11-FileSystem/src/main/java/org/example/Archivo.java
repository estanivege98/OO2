package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Archivo implements Unidad{
    private String nombre;
    private LocalDate fecha;
    private int tamano;

    public Archivo(String nombre, int tamano){
        this.nombre = nombre;
        this.tamano = tamano;
        this.fecha = LocalDate.now();
    }

    public String getNombre(){
        return this.nombre;
    }

    public LocalDate getFecha(){
        return this.fecha;
    }

    private int getTamano(){
        return this.tamano;
    }

    public boolean estaVacio(){
        return (this.tamano <= 32);
    }

    public boolean esArchivo(){
        return true;
    }

    public int tamanoTotalOcupado(){
        return getTamano();
    }

    public Archivo archivoMasGrande(){
        return this;
    }

    public Archivo archivoMasNuevo(){
        return this;
    }

    public Unidad buscar(String nombre){
        if (this.nombre.equals(nombre)){
            return this;
        }
        return null;
    }

    public List<Unidad> buscarTodos(String nombre){
        List<Unidad> lista = new ArrayList<Unidad>();
        if (this.nombre.equals(nombre)){
            lista.add(this);
            return lista;
        }
        return lista;
    }

    public String listadoDeContenido() {
        return "/" + this.nombre + "\n";
    }

}
