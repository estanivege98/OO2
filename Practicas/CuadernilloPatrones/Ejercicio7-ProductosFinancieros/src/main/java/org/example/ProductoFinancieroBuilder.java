package org.example;

import java.time.LocalDate;

public class ProductoFinancieroBuilder {
    private ProductoCombinado productoActual;
    private Membresia membresia;

    public ProductoFinancieroBuilder(Membresia m){
        this.membresia = m;
        this.productoActual = new ProductoCombinado(LocalDate.now());
    }

    public void agregarDolares(double valorCompra) {
        this.productoActual.agregarProducto(new CompraDolares(LocalDate.now(), valorCompra));
    }

    public void agregarPesos(double valorCompra) {
        this.productoActual.agregarProducto(new CompraPesos(LocalDate.now(), valorCompra));
    }

    public void agregarPlazoFijo(int dias) {
        int diasFinal = Math.max(dias, membresia.getMinimoDiasPlazoFijo());
        this.productoActual.agregarProducto(new PlazoFijo(LocalDate.now(), diasFinal, membresia.getTasaPlazoFijo()));
    }

    public void agregarBonoBajoRiesgo() {
        this.productoActual.agregarProducto(new CompraBonoBajoRiesgo(LocalDate.now(), membresia.getParkingBonos()));
    }

    public void agregarBonoAltoRiesgo() {
        this.productoActual.agregarProducto(new CompraBonoAltoRiesgo(LocalDate.now(), membresia.getParkingBonos()));
    }

    public ProductoFinanciero build() {
        ProductoCombinado result = this.productoActual;
        return result;
    }
}
