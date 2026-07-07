package org.example;

public abstract class Bien {
    private double liquedez;

    public Bien(double liquedez){
        this.liquedez = liquedez;
    }
    public abstract double calcularValor();

    public double valorPrendario(){
        return this.liquedez * this.calcularValor();
    }
}
