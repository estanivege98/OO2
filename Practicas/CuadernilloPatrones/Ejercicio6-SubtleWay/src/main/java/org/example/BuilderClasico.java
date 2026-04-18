package org.example;

public class BuilderClasico extends SandwichBuilder{

    public BuilderClasico(){
        super();
    }

    public void colocarPan(){
        this.agregarIngrediente(new Ingrediente("Pan Brioche", 100));
    }

    public void agregarPrincipal(){
        this.agregarIngrediente(new Ingrediente("Carne de ternera", 300));
    }

    public void agregarAderezo(){
        this.agregarIngrediente(new Ingrediente("Mayonesa", 20));
    }

    public void agregarAdicional(){
        this.agregarIngrediente(new Ingrediente("Tomate", 80));
    }
}
