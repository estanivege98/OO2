package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExcursionTest {

    @Test
    public void testInscribirDosUsuariosAlcanzaCupoMaximo() {
        Excursion e = new Excursion("Dos días en kayak bajando el Paraná",
                LocalDate.now(), LocalDate.now().plusDays(2),
                100.0, // precio
                1, // cupoMinimo
                2  // cupoMaximo
        );

        Usuario u1 = new Usuario("Juan", "Perez", "juan@example.com");
        Usuario u2 = new Usuario("Ana", "Lopez", "ana@example.com");

        e.inscribir(u1); // con cupoMinimo=1 al primer inscrito pasaria a definitivo
        e.inscribir(u2); // con cupoMaximo=2 al segundo inscrito deberia quedar lleno

        String info = e.obtenerInformacion();
        // checamos que la info indique que esta lleno o que el estado de maximo se dio
        assertTrue(info.contains("La excursion esta llena") || e.seAlcanzoCupoMaximo());
    }
}