package org.example;

public class BuilderIntermedio implements IBuilderComputadora{
    private Computadora computadora;
    private Catalogo catalogo;
    public BuilderIntermedio(Catalogo catalogo){
        this.catalogo = catalogo;
        this.computadora = new Computadora();
    }

    public void buildProcesador(){
        this.computadora.agregarComponente(this.catalogo.getComponente("Procesador Intermedio"));
    }

    public void buildRAM(){
        this.computadora.agregarComponente(this.catalogo.getComponente("16GB RAM"));
    }

    public void buildAlmacenamiento() {
        this.computadora.agregarComponente(this.catalogo.getComponente("500GB SSD"));
    }

    public void buildGPU(){
        this.computadora.agregarComponente(this.catalogo.getComponente("GTX 1650"));
    }

    public void buildGabinete() {
        this.computadora.agregarComponente(this.catalogo.getComponente("Gabinete Intermedio"));
        agregarFuente();
    }

    private void agregarFuente(){
        this.computadora.agregarComponente(this.catalogo.getComponente("Fuente 800W"));
    }
    public Computadora getComputadora(){
        return this.computadora;
    }
}
