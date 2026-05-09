package org.example;

public class Director {

    private IBuilderComputadora builder;

    public Director( IBuilderComputadora builder){
        this.builder = builder;
    }

    public void cambiarBuilderComputadora(IBuilderComputadora builder){
        this.builder = builder;
    }

    public Computadora construirComputadora(){
        this.builder.buildProcesador();
        this.builder.buildRAM();
        this.builder.buildAlmacenamiento();
        this.builder.buildGPU();
        this.builder.buildGabinete();
        return this.builder.getComputadora();
    }
}
