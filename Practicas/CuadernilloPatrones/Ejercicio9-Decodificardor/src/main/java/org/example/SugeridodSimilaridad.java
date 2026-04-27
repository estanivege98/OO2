package org.example;

import java.util.List;

public class SugeridodSimilaridad implements ISugeridor{
    public SugeridodSimilaridad(){

    }

    public List<Pelicula> obtenerSugerencias(List<Pelicula> peliculasNoVistas, List<Pelicula> peliculasVistas) {
        return peliculasNoVistas.stream()
                .sorted((p1, p2) -> {
                    int similitudP1 = (int) peliculasVistas.stream()
                            .filter(pelicula -> pelicula.getSimilares().contains(p1))
                            .count();
                    int similitudP2 = (int) peliculasVistas.stream()
                            .filter(pelicula -> pelicula.getSimilares().contains(p2))
                            .count();
                    if (similitudP1 == similitudP2) {
                        return Integer.compare(p2.getAnio(), p1.getAnio());
                    }
                    return Integer.compare(similitudP2, similitudP1);
                })
                .limit(3)
                .toList();
    }
}
