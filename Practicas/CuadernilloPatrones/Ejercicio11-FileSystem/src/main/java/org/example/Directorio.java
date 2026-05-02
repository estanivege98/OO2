package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio implements Unidad{
    public String nombre;
    public LocalDate fecha;
    public List<Unidad> contenido;

    public Directorio(String nombre){
        this.nombre = nombre;
        this.fecha = LocalDate.now();
        this.contenido = new ArrayList<Unidad>();
    }

    public int tamanoTotalOcupado() {
        return 32 + this.contenido.stream().mapToInt(Unidad::tamanoTotalOcupado).sum();
    }
    public Archivo archivoMasGrande(){
        return this.contenido.stream()
                .map(u -> u.archivoMasGrande())
                .filter(a -> a != null)
                .max(Comparator.comparingInt(Archivo::tamanoTotalOcupado))
                .orElse(null);
    }
    public Archivo archivoMasNuevo(){
        return this.contenido.stream()
                .map(u -> u.archivoMasNuevo())
                .filter(a -> a != null)
                .max(Comparator.comparing(Archivo::getFecha))
                .orElse(null);
    }
    public Unidad buscar(String nombre){
        if(this.contenido.equals(nombre)){
            return this;
        }
        return this.contenido.stream()
                .map(u -> u.buscar(nombre))
                .filter(u -> u != null)
                .findFirst()
                .orElse(null);
    }
    public List<Unidad> buscarTodos(String nombre){
        List<Unidad> lista = new ArrayList<Unidad>();
        if(this.contenido.equals(nombre)){
            lista.add(this);
        }
        this.contenido.stream()
                .map(u -> u.buscarTodos(nombre))
                .forEach(lista::addAll);
        return lista;
    }
    public String listadoDeContenido(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.nombre).append("/\n");
        for (Unidad u : this.contenido){
            sb.append("  ").append(u.listadoDeContenido()).append("\n");
        }
        return sb.toString();
    }
}
