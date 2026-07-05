package org.example;

import java.time.LocalDate;
import java.util.List;

public class FileOO2 implements IFile{
    private String nombre;
    private String extension;
    private int tamanio;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private List<String> permisos;


    public FileOO2(String nombre, String extension, int tamanio, LocalDate fechaCreacion, LocalDate fechaModificacion, List<String> permisos) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamanio = tamanio;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.permisos = permisos;

    }

    public String prettyPrint(){
        return this.nombre;
    }

    public FileOO2 getFile(){
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public String getExtension() {
        return extension;
    }

    public int getTamanio() {
        return tamanio;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }
    public List<String> getPermisos() {
        return permisos;
    }
}
