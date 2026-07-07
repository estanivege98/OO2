package org.example;

public class Inmueble extends Bien {
    private String direccion;
    private double superficie;
    private double valorM2;

    public Inmueble(double liquidez, String direccion, double superficie, double valorM2) {
        super(liquidez);
        this.direccion = direccion;
        this.superficie = superficie;
        this.valorM2 = valorM2;
    }

    @Override
    public double calcularValor() {
        return this.valorM2 * this.superficie;
    }
}
