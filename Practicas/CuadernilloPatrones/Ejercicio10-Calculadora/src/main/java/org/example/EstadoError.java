package org.example;

public class EstadoError implements IState{
    public EstadoError(){}

    public String getResultado(Calculadora contexto){
        return "Error";
    }

    public void borrar(Calculadora contexto){
        contexto.setValorAcumulado(0);
        contexto.cambiarEstado(new EstadoInicial());
    }

    public void setValor(Calculadora contexto, double valor){

    }

    public void mas(Calculadora contexto){

    }

    public void menos(Calculadora contexto){

    }

    public void por(Calculadora contexto){

    }

    public void dividido(Calculadora contexto){

    }
}
