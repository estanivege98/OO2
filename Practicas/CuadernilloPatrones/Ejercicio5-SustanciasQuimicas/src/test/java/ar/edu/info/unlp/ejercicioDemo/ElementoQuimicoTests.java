package ar.edu.info.unlp.ejercicioDemo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class ElementoQuimicoTests {
    private Atomo hidrogeno, oxigeno, cloro, sodio, calcio;
    private Union NaCa, NaCl, CaO, HO;
    private ElementoQuimicoFactory factory;
    private List<ElementoQuimico> elementosNaCa, elementosNaCl, elementosCaO, elementosHO;

    @BeforeEach
    public void setUp() {
        factory = new ElementoQuimicoFactory();
        this.hidrogeno = this.factory.getHidrogeno();
        this.oxigeno = this.factory.getOxigeno();
        this.cloro = this.factory.getCloro();
        this.sodio = this.factory.getSodio();
        this.calcio = this.factory.getCalcio();

        this.elementosNaCa = new ArrayList<>();
        this.elementosNaCl = new ArrayList<>();
        this.elementosCaO = new ArrayList<>();
        this.elementosHO = new ArrayList<>();

        this.elementosNaCa.add(this.sodio);
        this.elementosNaCa.add(this.calcio);
        this.NaCa = new Union(this.elementosNaCa);

        this.elementosNaCl.add(this.sodio);
        this.elementosNaCl.add(this.cloro);
        this.NaCl = new Union(this.elementosNaCl);

        this.elementosCaO.add(this.calcio);
        this.elementosCaO.add(this.oxigeno);
        this.CaO = new Union(this.elementosCaO);

        this.elementosHO.add(this.hidrogeno);
        this.elementosHO.add(this.oxigeno);
        this.HO = new Union(this.elementosHO);
    }

    @Test
    public void testFormula() {
        assertEquals(this.cloro.formula(), "Cl");
        assertEquals(this.NaCa.formula(), "NaCa");
        assertEquals(this.HO.formula(), "HO");

    }

    @Test
    public void testPesoMolecular() {
        assertEquals(this.cloro.pesoMolecular(), 35);
        assertEquals(this.CaO.pesoMolecular(), 56);
        assertEquals(this.NaCl.pesoMolecular(), 58);

    }

    @Test
    public void testCarga() {
        assertEquals(this.sodio.carga(), 1);
        assertEquals(this.HO.carga(), -1);
        assertEquals(this.NaCl.carga(), 0);

    }

    @Test
    public void testEsValida() {
        assertTrue(this.calcio.esValida());
        assertFalse(this.NaCa.esValida());
        assertTrue(this.NaCl.esValida());

    }
}
