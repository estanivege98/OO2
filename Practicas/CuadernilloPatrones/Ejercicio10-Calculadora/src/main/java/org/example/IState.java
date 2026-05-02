package org.example;

public interface IState {
    public String getResultado(Calculadora contexto);
    public void borrar(Calculadora contexto);
    public void setValor(Calculadora contexto, double valor);
    public void mas(Calculadora contexto);
    public void menos(Calculadora contexto);
    public void por(Calculadora contexto);
    public void dividido(Calculadora contexto);
}
