package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductoCombinado extends ProductoFinanciero {
    private List<ProductoFinanciero> productos;

    public ProductoCombinado(LocalDate fechaOperacion){
        super(fechaOperacion);
        this.productos = new ArrayList<ProductoFinanciero>();
    }

    public void agregarProducto(ProductoFinanciero p){
        this.productos.add(p);
    }

    public void removerProducto(ProductoFinanciero p){
        this.productos.remove(p);
    }

    public double retornoInversion(double montoInicial){
        double actualMonto = montoInicial;
        for (ProductoFinanciero p : this.productos) {
            actualMonto = p.retornoInversion(actualMonto);
        }
        return actualMonto;
    }
}
