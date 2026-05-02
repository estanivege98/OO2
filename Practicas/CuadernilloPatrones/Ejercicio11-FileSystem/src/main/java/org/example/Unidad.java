package org.example;

import java.time.LocalDate;
import java.util.List;

public interface Unidad {
    public int tamanoTotalOcupado();
    public Archivo archivoMasGrande();
    public Archivo archivoMasNuevo();
    public Unidad buscar(String nombre);
    public List<Unidad> buscarTodos(String nombre);
    public String listadoDeContenido();
}
