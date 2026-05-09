package org.example;

public class BuilderBasico implements IBuilderComputadora{
    private Computadora computadora;
    private Catalogo catalogo;

    public BuilderBasico(Catalogo catalogo){
        this.catalogo = catalogo;
        this.computadora = new Computadora();
    }

    public void buildProcesador(){
        this.computadora.agregarComponente(this.catalogo.getComponente("Procesador Básico"));
    }

    public void buildRAM(){
        this.computadora.agregarComponente(this.catalogo.getComponente("8GB RAM"));
    }

    public void buildAlmacenamiento(){
        this.computadora.agregarComponente(this.catalogo.getComponente("500GB HDD"));
    }

    public void buildGPU(){

    }

    public void buildGabinete(){
        this.computadora.agregarComponente(this.catalogo.getComponente("Gabinete Estándar"));
    }

    public Computadora getComputadora(){
        return this.computadora;
    }
}
