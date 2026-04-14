package org.example;

public class Planta extends Empleado{
    private boolean casado;
    private int cantHijos;
    private int antiguedad;

    public Planta(int antiguedad, boolean casado, int cHijos){
        this.antiguedad = antiguedad;
        this.casado = casado;
        this.cantHijos = cHijos;
    }

    @Override
    protected double calcularBasico(){
        return 50000.0;
    }

    @Override
    protected double calcularAdicional() {
        return (casado ? 5000.0 : 0.0) + (cantHijos * 2000.0) + (antiguedad * 2000.0);
    }
}
