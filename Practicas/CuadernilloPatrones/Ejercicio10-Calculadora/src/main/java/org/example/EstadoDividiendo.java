package org.example;

public class EstadoDividiendo implements IState{


    public String getResultado(Calculadora contexto){
        return "" + contexto.getValorAcumulado();
    }

    public void borrar(Calculadora contexto){
        contexto.cambiarEstado(new EstadoError());
    }

    public void setValor(Calculadora contexto, double valor){
        double valorViejo = contexto.getValorActual();
        if(valor == 0){
            contexto.cambiarEstado(new EstadoError());
        } else {
            contexto.setValorActual(valor);
            contexto.setValorAcumulado(valorViejo / valor);
        }
    }

    public void mas(Calculadora contexto) {
        contexto.cambiarEstado(new EstadoError());
    }

    public void menos(Calculadora contexto){
        contexto.cambiarEstado(new EstadoError());
    }

    public void por(Calculadora contexto){
        contexto.cambiarEstado(new EstadoError());
    }

    public void dividido(Calculadora contexto) {
        contexto.cambiarEstado(new EstadoError());
    }
}
