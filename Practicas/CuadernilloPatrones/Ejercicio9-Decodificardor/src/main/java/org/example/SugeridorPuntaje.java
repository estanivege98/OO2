package org.example;

import java.util.List;

public class SugeridorPuntaje implements ISugeridor{
    public SugeridorPuntaje() {

    }
        public List<Pelicula> obtenerSugerencias(List<Pelicula> peliculasNoVistas, List<Pelicula> peliculasVistas) {
            return peliculasNoVistas.stream()
                    .sorted((p1, p2) -> {
                        int puntajeComparison = Double.compare(p2.getPuntaje(), p1.getPuntaje());
                        if (puntajeComparison == 0) {
                            return Integer.compare(p2.getAnio(), p1.getAnio());
                        }
                        return puntajeComparison;
                    })
                    .limit(3)
                    .toList();
        }
}
