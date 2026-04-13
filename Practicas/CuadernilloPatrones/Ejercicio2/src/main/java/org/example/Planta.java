package org.example;

public class Planta extends Empleado{
    private boolean casado;
    private int cantHijos;
    private int antiguedad;

    private double casadoConHijos(){
        double cantADevolver = 0;
        if(casado){
            cantADevolver += 5000.0;
        }
        cantADevolver += cantHijos * 2000.0;
        return cantADevolver;
    }

    protected double sueldo(){
        return 50000.0 + (antiguedad * 2000.0) + casadoConHijos();
    }
}
