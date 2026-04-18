package org.example;

public class BuilderSinTACC extends SandwichBuilder{

    public BuilderSinTACC(){
        super();
    }

    public void colocarPan(){
        this.agregarIngrediente(new Ingrediente("Pan de Chipa", 150));
    }

    public void agregarPrincipal(){
        this.agregarIngrediente(new Ingrediente("Carne de pollo", 250));
    }

    public void agregarAderezo(){
        this.agregarIngrediente(new Ingrediente("Salsa Tártara", 18));
    }

    public void agregarAdicional(){
        this.agregarIngrediente(new Ingrediente("Verduras Grilladas", 200));
    }
}
