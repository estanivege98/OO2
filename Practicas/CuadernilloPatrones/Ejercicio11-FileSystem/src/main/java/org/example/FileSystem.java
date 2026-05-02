package org.example;

import java.util.List;

public class FileSystem {
    private Unidad unidad;

    public FileSystem(){
        this.unidad = unidad;
    }

    public FileSystem(Unidad u){
        this.unidad = u;
    }

    public int tamañoTotalOcupado(){
        return this.unidad.tamanoTotalOcupado();
    }

    public Archivo archivoMasGrande(){
        return this.unidad.archivoMasGrande();
    }

    public Archivo archivoMasNuevo(){
        return this.unidad.archivoMasNuevo();
    }

    public Unidad buscar(String nombre){
        return this.unidad.buscar(nombre);
    }

    public List<Unidad> buscarTodos(String nombre){
        return this.unidad.buscarTodos(nombre);
    }

    public String listadoDeContenido(){
        return this.unidad.listadoDeContenido();
    }
}
