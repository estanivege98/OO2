package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugeridordNovedad implements ISugeridor{

    public SugeridordNovedad(){

    }

    public List<Pelicula> obtenerSugerencias(List<Pelicula> peliculasNoVistas, List<Pelicula> peliculasVistas){
        return peliculasNoVistas.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getAnio(), p1.getAnio()))
                .limit(3).toList();
    }
}
