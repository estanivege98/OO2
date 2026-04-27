package org.example;

import java.util.List;

public class Pelicula {
    private String titulo;
    private int anio;
    private double puntaje;
    private List<Pelicula> similares;

    public Pelicula(String titulo, int anio, double puntaje, List<Pelicula> similares) {
        this.titulo = titulo;
        this.anio = anio;
        this.puntaje = puntaje;
        this.similares = similares;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getAnio() {
        return this.anio;
    }

    public double getPuntaje() {
        return this.puntaje;
    }

    public List<Pelicula> getSimilares() {
        return this.similares;
    }

    public void agregarSimilar(Pelicula pelicula) {
        if (!this.similares.contains(pelicula)){
            this.similares.add(pelicula);
            pelicula.agregarSimilar(this);
        }
    }
}
