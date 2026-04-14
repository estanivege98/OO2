package org.example;

public class Pasante extends Empleado{
    private int examenesRendidos;

    public Pasante(int cExamenes){
        this.examenesRendidos = cExamenes;
    }

    @Override
    protected double calcularBasico(){
        return 20000.0;
    }

    @Override
    protected double calcularAdicional(){
        return (examenesRendidos * 2000.0);
    }
}
