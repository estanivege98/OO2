package org.example;

public class BuilderVegetariano extends SandwichBuilder{
    public BuilderVegetariano(){
        super();
    }

    public void colocarPan(){
        this.agregarIngrediente(new Ingrediente("Pan con Semillas", 120));
    }

    public void agregarPrincipal(){
        this.agregarIngrediente(new Ingrediente("Provoleta Grillada", 200));
    }

    public void agregarAderezo(){
        this.agregarIngrediente(new Ingrediente("Nada", 0));
    }

    public void agregarAdicional(){
        this.agregarIngrediente(new Ingrediente("Berenjenas al Escabeche", 100));
    }
}
