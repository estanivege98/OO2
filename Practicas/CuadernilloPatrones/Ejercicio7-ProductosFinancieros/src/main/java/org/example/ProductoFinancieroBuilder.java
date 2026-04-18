package org.example;

public class ProductoFinancieroBuilder {
    private ProductoCombinado productoActual;
    private Membresia membresia;

    public ProductoFinancieroBuilder(Membresia m){
        this.membresia = m;
        this.productoActual = new ProductoCombinado();
    }


}
