package org.example;

public class EstadoInicial implements IState{
    public EstadoInicial(){

    }

    public String getResultado(Calculadora contexto){
        return "" + contexto.getValorAcumulado();
    }

    public void borrar(Calculadora contexto){
        contexto.setValorAcumulado(0);
    }

    public void setValor(Calculadora contexto, double valor){
        contexto.setValorActual(valor);
    }

    public void mas(Calculadora contexto){
        contexto.cambiarEstado(new EstadoSumando());
    }

    public void menos(Calculadora contexto){
        contexto.cambiarEstado(new EstadoRestando());
    }

    public void por(Calculadora contexto){
        contexto.cambiarEstado(new EstadoMultiplicando());
    }

    public void dividido(Calculadora contexto){
        contexto.cambiarEstado(new EstadoDividiendo());
    }
}
