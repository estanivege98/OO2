package org.example;

import java.time.LocalDate;

public abstract class ProductoFinanciero {
    private LocalDate fechaOperacion;

    public ProductoFinanciero(LocalDate fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public abstract double retornoInversion(double montoInicial);
}
