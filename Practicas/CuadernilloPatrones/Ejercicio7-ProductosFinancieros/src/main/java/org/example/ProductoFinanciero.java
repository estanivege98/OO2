package org.example;

import java.util.Date;

public abstract class ProductoFinanciero {
    private Date fechaOperacion;

    public ProductoFinanciero(){
        this.fechaOperacion = new Date();
    }

    public abstract double retornoInversion(double montoInicial);
}
