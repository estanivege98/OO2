package org.example;

public class Temporario extends Empleado{
    private int horasTrabajadas;
    private boolean casado;
    private int cantHijos;

    public Temporario(int hTrabajadas, boolean casado, int cHijos){
        this.horasTrabajadas = hTrabajadas;
        this.casado = casado;
        this.cantHijos = cHijos;
    }

    @Override
    protected double calcularBasico(){
        return (horasTrabajadas * 300.0) + 20000.0;
    }

    @Override
    protected double calcularAdicional() {
        return (casado ? 5000.0 : 0.0) + (cantHijos * 2000.0);
    }
}
