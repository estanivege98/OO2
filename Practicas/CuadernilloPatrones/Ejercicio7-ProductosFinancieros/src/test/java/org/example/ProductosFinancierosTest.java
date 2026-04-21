package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductosFinancierosTest {
    private Gold userGold;
    private Silver userSilver;

    @BeforeEach
    public void setUp() {
        userGold = new Gold();
        userSilver = new Silver();
    }

    @Test
    public void testTasasPlazoFijoSegunMembresia() {
        // Silver: Tasa del 5%
        ProductoFinancieroBuilder builderSilver = new ProductoFinancieroBuilder(userSilver);
        builderSilver.agregarPlazoFijo(35);
        ProductoFinanciero pSilver = builderSilver.build();
        assertEquals(105.0, pSilver.retornoInversion(100.0), 0.01, "Plazo fijo Silver debería sumar 5% de interés");

        // Gold: Tasa del 6%
        ProductoFinancieroBuilder builderGold = new ProductoFinancieroBuilder(userGold);
        builderGold.agregarPlazoFijo(30);
        ProductoFinanciero pGold = builderGold.build();
        assertEquals(106.0, pGold.retornoInversion(100.0), 0.01, "Plazo fijo Gold debería sumar 6% de interés");
    }

    @Test
    public void testValoresLimiteBonoBajoRiesgo() {
        ProductoFinancieroBuilder builder = new ProductoFinancieroBuilder(userGold);
        builder.agregarBonoBajoRiesgo();
        ProductoFinanciero bono = builder.build();

        // Bajo Riesgo: Variación del -10% al 10%. Para $100, el rango esperado es [90, 110]
        for (int i = 0; i < 1000; i++) {
            double retorno = bono.retornoInversion(100.0);
            assertTrue(retorno >= 90.0 && retorno <= 110.0, "El valor " + retorno + " se salió de los límites [-10%, +10%]");
        }
    }

    @Test
    public void testValoresLimiteBonoAltoRiesgo() {
        ProductoFinancieroBuilder builder = new ProductoFinancieroBuilder(userSilver);
        builder.agregarBonoAltoRiesgo();
        ProductoFinanciero bono = builder.build();

        // Alto Riesgo: Variación del -70% al 70%. Para $100, el rango esperado es [30, 170]
        for (int i = 0; i < 1000; i++) {
            double retorno = bono.retornoInversion(100.0);
            assertTrue(retorno >= 30.0 && retorno <= 170.0, "El valor " + retorno + " se salió de los límites [-70%, +70%]");
        }
    }

    @Test
    public void testProductoCombinadoCadenaMultiplicadora() {
        ProductoFinancieroBuilder builder = new ProductoFinancieroBuilder(userGold);

        // Dolares devuelve el capital intacto, luego PlazoFijo (Gold) le suma 6%.
        builder.agregarDolares(200);
        builder.agregarPlazoFijo(30);
        ProductoFinanciero p = builder.build();

        // Invertimos $100 iniciales -> Dólares deja $100 -> PlazoFijo aplica 6% -> Resultado = 106.
        assertEquals(106.0, p.retornoInversion(100.0), 0.01);
    }

    @Test
    public void testProducto1_Silver() {
        // Producto 1 (según tu código anterior): Dólares + Plazo Fijo + Bono Bajo Riesgo
        ProductoFinancieroBuilder builder = new ProductoFinancieroBuilder(userSilver);
        builder.agregarDolares(100);
        builder.agregarPlazoFijo(30); // Silver ajustará mínimo a 35 días automáticamente
        builder.agregarBonoBajoRiesgo();
        ProductoFinanciero producto1 = builder.build();

        double retorno = producto1.retornoInversion(100.0);
        // Dólares (100) -> PlazoFijo 5% (105) -> BonoRiesgo +-10%
        assertTrue(retorno >= 94.5 && retorno <= 115.5, "Producto 1 falló sus límites de ganancia");
    }

    @Test
    public void testProducto2_Silver() {
        // Producto 2 (según tu código anterior): Pesos + Bono Alto Riesgo
        ProductoFinancieroBuilder builder = new ProductoFinancieroBuilder(userSilver);
        builder.agregarPesos(100);
        builder.agregarBonoAltoRiesgo();
        ProductoFinanciero producto2 = builder.build();

        double retorno = producto2.retornoInversion(100.0);
        // Pesos (100) -> BonoAltoRiesgo +-70%
        assertTrue(retorno >= 30.0 && retorno <= 170.0, "Producto 2 falló sus límites de ganancia");
    }

    @Test
    public void testProducto3_Gold() {
        // Producto 3: Plazo Fijo + Bono Bajo Riesgo + Bono Alto Riesgo
        ProductoFinancieroBuilder builder = new ProductoFinancieroBuilder(userGold);
        builder.agregarPlazoFijo(60);
        builder.agregarBonoBajoRiesgo();
        builder.agregarBonoAltoRiesgo();
        ProductoFinanciero producto3 = builder.build();

        // El cálculo varía bastante, verificamos que devuelve un valor positivo y ejecutable.
        double retorno = producto3.retornoInversion(100.0);
        assertTrue(retorno > 0, "El Producto 3 debe retornar un valor válido de mercado");
    }

    @Test
    public void testProducto4_Gold() {
        // Producto 4 (Combinación inferida del resto de la tabla)
        ProductoFinancieroBuilder builder = new ProductoFinancieroBuilder(userGold);
        builder.agregarPesos(200);
        builder.agregarDolares(100);
        builder.agregarPlazoFijo(45);
        ProductoFinanciero producto4 = builder.build();

        double retorno = producto4.retornoInversion(1000.0);
        // Pesos -> Dolares -> Plazo Fijo Gold (6%) = 1000 * 1.06 = 1060
        assertEquals(1060.0, retorno, 0.01, "El Producto 4 falló el encadenamiento de capital");
    }
}
