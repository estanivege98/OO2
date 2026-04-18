package org.example;

/* No puedo evitar que vengan hacia a mi los sanguches de miga */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
public class SandwichesTest {

    final int COSTO_ESPERADO_CLASICO = 500;
    final int COSTO_ESPERADO_VEGETARIANO = 420;
    final int COSTO_ESPERADO_VEGANO = 620;
    final int COSTO_ESPERADO_SINTACC = 618;

    private Sandwich clasico;
    private Sandwich vegetariano;
    private Sandwich vegano;
    private Sandwich sinTACC;

    private SubtleWay empleadoSubtleWay;
    @BeforeEach
    void setUp() throws Exception{
        empleadoSubtleWay = new SubtleWay();
        clasico = empleadoSubtleWay.pedirSandwich(new BuilderClasico());
        vegetariano = empleadoSubtleWay.pedirSandwich(new BuilderVegetariano());
        vegano = empleadoSubtleWay.pedirSandwich(new BuilderVegano());
        sinTACC = empleadoSubtleWay.pedirSandwich(new BuilderSinTACC());
    }

    @Test
    public void TestSandwichClasico() {
        Assertions.assertEquals(COSTO_ESPERADO_CLASICO, clasico.calcularPrecio());
    }

    @Test
    public void TestSandwichVegetariano(){
        Assertions.assertEquals(COSTO_ESPERADO_VEGETARIANO, vegetariano.calcularPrecio());
    }

    @Test
    public void TestSandwichVegano(){
        Assertions.assertEquals(COSTO_ESPERADO_VEGANO, vegano.calcularPrecio());
    }

    @Test
    public void TestSandwichSinTACC(){
        Assertions.assertEquals(COSTO_ESPERADO_SINTACC, sinTACC.calcularPrecio());
    }
}
