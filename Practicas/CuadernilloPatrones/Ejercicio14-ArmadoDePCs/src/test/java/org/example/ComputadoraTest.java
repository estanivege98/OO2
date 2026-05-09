package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class ComputadoraTest {

    private Catalogo catalogo;

    @BeforeEach
    void setUp() {
        catalogo = new Catalogo(Arrays.asList(
                new Componente("Procesador Básico", "Procesador Básico", 100, 50),
                new Componente("8GB RAM", "8GB RAM", 50, 10),
                new Componente("500GB HDD", "500GB HDD", 40, 15),
                new Componente("Gabinete Estándar", "Gabinete Estándar", 60, 0),
                new Componente("Procesador Intermedio", "Procesador Intermedio", 200, 80),
                new Componente("16GB RAM", "16GB RAM", 100, 20),
                new Componente("500GB SSD", "500GB SSD", 80, 10),
                new Componente("GTX 1650", "GTX 1650", 150, 75),
                new Componente("Gabinete Intermedio", "Gabinete Intermedio", 80, 0),
                new Componente("Fuente 800W", "Fuente 800W", 70, 0),
                new Componente("Procesador Gamer", "Procesador Gamer", 400, 150),
                new Componente("Pad Térmico", "Pad Térmico", 10, 0),
                new Componente("Cooler", "Cooler", 30, 10),
                new Componente("32 GB RAM", "32 GB RAM", 200, 40),
                new Componente("1TB SSD", "1TB SSD", 150, 15),
                new Componente("RTX 4090", "RTX 4090", 1500, 450),
                new Componente("Gabinete Gamer", "Gabinete Gamer", 150, 0),
                new Componente("Fuente 1072.5W", "Fuente 1072.5W", 200, 0)
        ));
    }

    @Test
    void testComputadoraBasica() {
        IBuilderComputadora builder = new BuilderBasico(catalogo);
        Director director = new Director(builder);
        Computadora comp = director.construirComputadora();

        assertEquals(4, comp.getComponentes().size());
        assertEquals(75, comp.getConsumo());
        // Price: (100 + 50 + 40 + 60) * 1.21 = 250 * 1.21 = 302.5
        assertEquals(302.5, comp.getPrecio(), 0.01);
    }

    @Test
    void testComputadoraIntermedia() {
        IBuilderComputadora builder = new BuilderIntermedio(catalogo);
        Director director = new Director(builder);
        Computadora comp = director.construirComputadora();

        assertEquals(6, comp.getComponentes().size());
        assertEquals(185, comp.getConsumo());
        // Price: (200 + 100 + 80 + 150 + 80 + 70) * 1.21 = 680 * 1.21 = 822.8
        assertEquals(822.8, comp.getPrecio(), 0.01);
    }

    @Test
    void testComputadoraGamer() {
        IBuilderComputadora builder = new BuilderGamer(catalogo);
        Director director = new Director(builder);
        Computadora comp = director.construirComputadora();

        assertEquals(10, comp.getComponentes().size());
        // Consumo previo de partes = 150 + 0 + 10 + 40 + 40 + 15 + 10 + 450 = 715
        // Wait, the Gamer Builder calculates source watts when building Gabinete which is the last step.
        // It sums up actual components. So testing the build process is important.
        assertEquals(715, comp.getConsumo());

        // Price sum
        // 400 + 10 + 30 + 200 + 200 + 150 + 80 (wait, 500 gb ssd is 80) + 1500 + 150 + 200 = 2920 * 1.21 = 3533.2
        assertEquals(3533.2, comp.getPrecio(), 0.01);
    }
}
