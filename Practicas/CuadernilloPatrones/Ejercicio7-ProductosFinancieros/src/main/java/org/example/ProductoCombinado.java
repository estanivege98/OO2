package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductoCombinado {
    private List<ProductoFinanciero> productos;

    public ProductoCombinado(){
        this.productos = new ArrayList<ProductoFinanciero>();
    }

    public void agregarProducto(ProductoFinanciero p){
        this.productos.add(p);
    }

    public void removerProducto(ProductoFinanciero p){
        this.productos.remove(p);
    }

    public double retornoInversion(double montoInicial){
        this.productos.stream()
                .forEach(p -> montoInicial = p.retornoInversion(montoInicial));
        return montoInicial;
    }
}
