package org.example;

public class Calculadora {
    private double valorAcumulado;
    private double valorActual;
    private IState estado;

    public Calculadora(){
        this.valorAcumulado = 0;
        this.valorActual = 0;
        this.estado = new EstadoInicial();
    }

    public String getResultado(){
        return ("Resultado: " + this.estado.getResultado(this));
    }

    public void mas(){
        this.estado.mas(this);
    }

    public void menos(){
        this.estado.menos(this);
    }

    public void por(){
        this.estado.por(this);
    }

    public void dividido(){
        this.estado.dividido(this);
    }

    public void borrar(){
        this.estado.borrar(this);
    }

    // setValor para los estados
    public void setValor(double valor){
        this.estado.setValor(this, valor);
    }

    public void setValorActual(double valor){
        this.valorActual = valor;
    }

    public void setValorAcumulado(double valor){
        this.valorAcumulado = valor;
    }

    public double getValorAcumulado(){
        return this.valorAcumulado;
    }

    public double getValorActual(){
        return this.valorActual;
    }

    public void cambiarEstado(IState estado){
        this.estado = estado;
    }

    public IState getEstado(){
        return this.estado;
    }
}
