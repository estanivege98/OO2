package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
public class PersonajesTest {
    DirectorPersonajes directorPersonajes;
    Personaje guerrero, arquero, mago, thoor;

    @BeforeEach
    void setUp() throws Exception {
        directorPersonajes = new DirectorPersonajes();
        guerrero = directorPersonajes.crearPersonaje(new GuerreroBuilder(new Personaje()));
        arquero = directorPersonajes.crearPersonaje(new ArqueroBuilder(new Personaje()));
        mago = directorPersonajes.crearPersonaje(new MagoBuilder(new Personaje()));
        thoor = directorPersonajes.crearPersonaje(new ThoorBuilder(new Personaje()));
    }

    @Test
    void testInicializacion(){
        Assertions.assertNotNull(guerrero);
        Assertions.assertEquals(100, guerrero.getVida());
    }

    @Test
    void testArqueroAtaca(){
        arquero.enfrentar(thoor);
        Assertions.assertEquals(97, thoor.getVida());
        arquero.enfrentar(guerrero);
        Assertions.assertEquals(98, guerrero.getVida());
        arquero.enfrentar(mago);
        Assertions.assertEquals(95, mago.getVida());
        arquero.enfrentar(arquero);
        Assertions.assertEquals(95, arquero.getVida());
    }

    @Test
    void testPersonajeSinVida(){
        for (int i = 0; i< 13; i++){
            guerrero.enfrentar(arquero);
        }

        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, ()-> guerrero.enfrentar(arquero), "El personaje guerrero no puede seguir atacando");
    }

}
