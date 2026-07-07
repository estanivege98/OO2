package org.example;

public class Inmueble implements IBien {
    private String direccion;
    private double superficie;
    private double valorM2;

    public Inmueble(String direccion, double superficie, double valorM2) {
        this.direccion = direccion;
        this.superficie = superficie;
        this.valorM2 = valorM2;
    }

    @Override
    public double calcularValor() {
        return this.calcularValorM2();
    }

    @Override
    public double valorPrendario() {
        return 0.7 * this.calcularValor();
    }

    private double calcularValorM2(){
        return valorM2 * superficie;
    }
}
