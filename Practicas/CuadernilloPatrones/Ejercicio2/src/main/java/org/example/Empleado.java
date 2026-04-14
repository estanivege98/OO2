package org.example;

public abstract class Empleado  {
    protected double sueldo(){
        double basico = this.calcularBasico();
        double adicional = this.calcularAdicional();
        double descuento = this.calcularDescuento();
        return basico + adicional - descuento;
    }

    protected abstract double calcularBasico();
    protected abstract double calcularAdicional();

    private double calcularDescuento(){
        double basico = this.calcularBasico() * 0.13;
        double adicional = this.calcularAdicional() * 0.05;
        return basico + adicional;
    }
}
