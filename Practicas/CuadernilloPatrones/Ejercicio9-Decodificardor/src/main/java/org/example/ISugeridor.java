package org.example;

import java.util.List;

public interface ISugeridor {
    public List<Pelicula> obtenerSugerencias(List<Pelicula> peliculasNoVistas, List<Pelicula> peliculasVistas);
}
