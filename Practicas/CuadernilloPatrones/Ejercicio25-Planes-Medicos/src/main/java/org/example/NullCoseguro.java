package org.example;

public class NullCoseguro implements ICoseguro {
    @Override
    public double getMontoCoberturaViaje() {
        return 0;
    }
    @Override
    public int getDescuento() {
        return 0;
    }
    @Override
    public int getAntiguedad() {
        return 0;
    }
}
