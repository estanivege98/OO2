package org.example;

public interface IBuilderComputadora {
    public void buildProcesador();
    public void buildRAM();
    public void buildAlmacenamiento();
    public void buildGPU();
    public void buildGabinete();
    public Computadora getComputadora();
}
