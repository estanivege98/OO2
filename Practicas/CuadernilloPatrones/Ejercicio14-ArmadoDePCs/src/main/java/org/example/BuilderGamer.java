package org.example;

public class BuilderGamer implements IBuilderComputadora{
    private Computadora computadora;
    private Catalogo catalogo;

    public BuilderGamer(Catalogo catalogo) {
        this.computadora = new Computadora();
        this.catalogo = catalogo;
    }

    public Computadora getComputadora() {
        return this.computadora;
    }

    public void buildProcesador() {
        this.computadora.agregarComponente(this.catalogo.getComponente("Procesador Gamer"));
        agregarPadTermico();
        agregarCooler();
    }

    public void buildRAM(){
        this.computadora.agregarComponente(this.catalogo.getComponente("32 GB RAM"));
        this.computadora.agregarComponente(this.catalogo.getComponente("32 GB RAM"));
    }

    public void buildAlmacenamiento(){
        this.computadora.agregarComponente(this.catalogo.getComponente("1TB SSD"));
        this.computadora.agregarComponente(this.catalogo.getComponente("500GB SSD"));
    }

    public void buildGPU(){
        this.computadora.agregarComponente(this.catalogo.getComponente("RTX 4090"));
    }

    public void buildGabinete(){
        this.computadora.agregarComponente(this.catalogo.getComponente("Gabinete Gamer"));
        agregarFuente();
    }

    private void agregarPadTermico(){
        this.computadora.agregarComponente(this.catalogo.getComponente("Pad Térmico"));
    }

    private void agregarCooler(){
        this.computadora.agregarComponente(this.catalogo.getComponente("Cooler"));
    }

    private void agregarFuente(){
        double cantidadWatts = this.computadora.getConsumo() + (this.computadora.getConsumo() * 0.5);
        this.computadora.agregarComponente(this.catalogo.getComponente("Fuente " + cantidadWatts + "W"));
    }
}
