package org.example;

public abstract class SandwichBuilder {

    private Sandwich producto;

    public SandwichBuilder(){
        this.producto = new Sandwich();
    }

    public abstract void colocarPan();
    public abstract void agregarPrincipal();
    public abstract void agregarAderezo();
    public abstract void agregarAdicional();

    public Sandwich obtenerSandwich(){
        this.colocarPan();
        this.agregarPrincipal();
        this.agregarAderezo();
        this.agregarAdicional();
        return this.producto;
    }

    protected void agregarIngrediente(IIngrediente c){
        this.producto.agregarIngrediente(c);
    }
}
