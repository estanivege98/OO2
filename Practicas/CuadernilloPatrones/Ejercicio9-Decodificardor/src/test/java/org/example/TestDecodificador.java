package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDecodificador {
    private Pelicula thor;
    private Pelicula capitanAmerica;
    private Pelicula ironMan;
    private Pelicula dunkirk;
    private Pelicula rocky;
    private Pelicula rambo;

    private List<Pelicula> grilla;
    private List<Pelicula> peliculasVistas;

    private Decodificador decodificador;

    @BeforeEach
    public void setUp() {
        thor = new Pelicula("Thor", 2007, 7.9, new ArrayList<>());
        capitanAmerica = new Pelicula("Capitan America", 2016, 7.8, new ArrayList<>());
        ironMan = new Pelicula("Iron Man", 2010, 7.9, new ArrayList<>());
        dunkirk = new Pelicula("Dunkirk", 2017, 7.9, new ArrayList<>());
        rocky = new Pelicula("Rocky", 1976, 8.1, new ArrayList<>());
        rambo = new Pelicula("Rambo", 1979, 7.8, new ArrayList<>());

        thor.agregarSimilar(capitanAmerica);
        thor.agregarSimilar(ironMan);
        capitanAmerica.agregarSimilar(ironMan);
        rocky.agregarSimilar(rambo);

        grilla = new ArrayList<>(Arrays.asList(thor, capitanAmerica, ironMan, dunkirk, rocky, rambo));
        peliculasVistas = new ArrayList<>(Arrays.asList(thor, rocky));

        decodificador = new Decodificador(grilla, peliculasVistas, new SugeridordNovedad());
    }

    @Test
    public void testSugerencias() {
        // configure al decodificador para que sugiera por similaridad (ii)
        decodificador.configurarSugeridor(new SugeridodSimilaridad());

        // solicite al mismo decodificador las sugerencias
        List<Pelicula> sugerenciasSimilaridad = decodificador.obtenerSugerencias();

        // Verificamos que devuelve: Capitán América, Iron man, Rambo
        assertEquals(3, sugerenciasSimilaridad.size());
        assertTrue(sugerenciasSimilaridad.contains(capitanAmerica));
        assertTrue(sugerenciasSimilaridad.contains(ironMan));
        assertTrue(sugerenciasSimilaridad.contains(rambo));


        // configure al mismo decodificador para que sugiera por puntaje (iii)
        decodificador.configurarSugeridor(new SugeridorPuntaje());

        // solicite al mismo decodificador las sugerencias
        List<Pelicula> sugerenciasPuntaje = decodificador.obtenerSugerencias();

        // Verificamos que devuelve: Dunkirk, Iron man, Capitan America
        assertEquals(3, sugerenciasPuntaje.size());
        assertTrue(sugerenciasPuntaje.contains(dunkirk));
        assertTrue(sugerenciasPuntaje.contains(ironMan));
        assertTrue(sugerenciasPuntaje.contains(capitanAmerica));
    }
}
