package org.example;

public class PlazoFijo extends ProductoFinanciero{
    private int cantidadDias;
    private double interes;

    @Override
    public double retornoInversion(double montoInicial) {
        return 0;
    }
}
