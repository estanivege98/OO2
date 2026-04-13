package org.example;

public class Pasante extends Empleado{
    private int examenesRendidos;

    protected double sueldo(){
        return 15000.0 + (examenesRendidos * 2000.0);
    }
}
