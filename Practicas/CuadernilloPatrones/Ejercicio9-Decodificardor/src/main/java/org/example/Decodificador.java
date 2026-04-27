package org.example;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
    private ISugeridor sugeridor;
    private List<Pelicula> peliculasVistas;
    private List<Pelicula> peliculasSugeridas;

    public Decodificador(List<Pelicula> grilla, List<Pelicula> peliculasVistas,ISugeridor sugeridor){
        this.sugeridor = sugeridor;
        this.peliculasSugeridas = grilla != null ? grilla : new ArrayList<Pelicula>();
        this.peliculasVistas = peliculasVistas != null ? peliculasVistas : new ArrayList<Pelicula>();
    }

    public void configurarSugeridor(ISugeridor sugeridor){
        this.sugeridor = sugeridor;
    }

    private List<Pelicula> pelisNoVistas(){
        return this.peliculasSugeridas.stream()
                .filter(pelicula -> !peliculasVistas.contains(pelicula))
                .toList();
    }

    public List<Pelicula> obtenerSugerencias(){
        return this.sugeridor.obtenerSugerencias(this.pelisNoVistas(), peliculasVistas);
    }
}
