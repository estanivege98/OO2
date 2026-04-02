package org.example;
import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
public class JugadasTest {
    Eleccion jugada1;
    Eleccion jugada2;
    Eleccion jugada3;
    @BeforeEach
    public void setUp(){
         jugada1 = new Piedra();
         jugada2 = new Tijera();
         jugada3 = new Papel();
    }

    @Test
    public void TestGanar(){
        assertEquals("Gana", jugada1.jugarContraTijera());
    }

    @Test
    public void TestPerder(){
        assertEquals("Pierde", jugada1.jugarContraPapel());
    }

    @Test
    public void TestEmpate(){
        assertEquals("Empate", jugada2.jugarContraTijera());
    }
}
