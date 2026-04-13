package org.example;

public class Temporario extends Empleado{
    private int horasTrabajadas;
    private boolean casado;
    private int cantHijos;

    private double calcularCantHorasTrabajadas(){
        return horasTrabajadas * 300;
    }

    private double casadoConHijos(){
        double cantADevolver = 0;
        if(casado){
            cantADevolver += 5000.0;
        }
        cantADevolver += cantHijos * 2000.0;
        return cantADevolver;
    }

    protected double sueldo(){
        return 20000.0 + calcularCantHorasTrabajadas() + casadoConHijos();
    }
}
