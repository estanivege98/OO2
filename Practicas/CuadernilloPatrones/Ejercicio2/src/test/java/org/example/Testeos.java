package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
public class Testeos {
    Temporario temporario1;
    Temporario temporario2;
    Pasante pasante1;
    Pasante pasante2;
    Planta planta1;
    Planta planta2;

    @BeforeEach
    void setUp(){
        temporario1 = new Temporario(100, true, 2);
        temporario2 = new Temporario(200, false, 0);
        pasante1 = new Pasante(5);
        pasante2 = new Pasante(0);
        planta1 = new Planta(1, true, 0);
        planta2 = new Planta(10, false, 3);
    }

    @Test
    void testSueldoTemporario(){
        assertEquals(52050.0, temporario1.sueldo());
        assertEquals(69600.0, temporario2.sueldo());
    }

    @Test
    void testSueldoPasante(){
        assertEquals(26900.0, pasante1.sueldo());
        assertEquals(17400.0, pasante2.sueldo());

    }

    @Test
    void testSueldoPlanta(){
        assertEquals(50150.0, planta1.sueldo());
        assertEquals(68200.0, planta2.sueldo());
    }
}
