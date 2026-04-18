package org.example;

public class BuilderVegano extends SandwichBuilder{
    public BuilderVegano(){
        super();
    }

    public void colocarPan(){
        this.agregarIngrediente(new Ingrediente("Pan Integral", 100));
    }

    public void agregarPrincipal(){
        this.agregarIngrediente(new Ingrediente("Milanesa de Girgolas", 500));
    }

    public void agregarAdicional(){
        this.agregarIngrediente(new Ingrediente("Nada", 0));
    }

    public void agregarAderezo(){
        this.agregarIngrediente(new Ingrediente("Salsa Criolla", 20));
    }
}
