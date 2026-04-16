package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TopografiasTest {
    TopografiaAgua topoAgua;
    TopografiaTierra topoTierra;
    TopografiaMixta topoMixta1;
    TopografiaMixta topoMixta2;

    @BeforeEach
    void setUp() throws Exception {
        topoAgua = new TopografiaAgua();
        topoTierra = new TopografiaTierra();
        topoMixta1 = new TopografiaMixta();
        topoMixta2 = new TopografiaMixta();
    }

    @Test
    public void test_inicializacion_mixta() {
        // La topografía mixta no debería retornar ningún valor al principio
        Assertions.assertEquals(0, topoMixta1.proporcionAgua(), 0.0000001);
    }

    @Test
    public void test_agregarComponente_mixta(){
        topoMixta1.agregarComponente(topoAgua);
        topoMixta1.agregarComponente(topoTierra);
        topoMixta1.agregarComponente(topoAgua);
        topoMixta1.agregarComponente(topoAgua);


        RuntimeException thrown2 = Assertions.assertThrows(
                RuntimeException.class, () -> topoMixta1.agregarComponente(new TopografiaAgua()),
                "No pueden agregarse mas de 4 objetos"
        );
    }

    @Test
    public void test_calcularProporcionAgua(){
        Assertions.assertEquals(1, topoAgua.proporcionAgua(), 0.0000001);
        Assertions.assertEquals(0, topoTierra.proporcionAgua(), 0.0000001);

        topoMixta1.agregarComponente(topoAgua);
        topoMixta1.agregarComponente(topoTierra);

        Assertions.assertEquals(0.5, topoMixta1.proporcionAgua(), 0.0000001);

        topoMixta1.agregarComponente(new TopografiaAgua());

        Assertions.assertEquals(0.66, topoMixta1.proporcionAgua(), 0.01);

        topoMixta1.agregarComponente(topoMixta2);

        topoMixta2.agregarComponente(new TopografiaAgua());
        topoMixta2.agregarComponente(new TopografiaTierra());

        Assertions.assertEquals(0.625, topoMixta1.proporcionAgua(), 0.0000001);
    }

    @Test
    public void test_es_igual_a_agua() {
        TopografiaAgua topoAgua2 = new TopografiaAgua();
        Assertions.assertTrue(topoAgua.esIgualA(topoAgua2));
        Assertions.assertFalse(topoAgua.esIgualA(topoTierra));
        Assertions.assertFalse(topoAgua.esIgualA(topoMixta1));
    }

    @Test
    public void test_es_igual_a_tierra() {
        TopografiaTierra topoTierra2 = new TopografiaTierra();
        Assertions.assertTrue(topoTierra.esIgualA(topoTierra2));
        Assertions.assertFalse(topoTierra.esIgualA(topoAgua));
        Assertions.assertFalse(topoTierra.esIgualA(topoMixta1));
    }
}
