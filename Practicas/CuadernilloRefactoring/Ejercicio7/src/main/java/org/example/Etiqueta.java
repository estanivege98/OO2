package org.example;

abstract class Etiqueta {
    protected String nombreProducto;
    protected double precio;

    public Etiqueta(String nombre, double precio) {
        this.nombreProducto = nombre;
        this.precio = precio;
    }

    public String getNombreProducto(){
        return nombreProducto;
    }

    public double getPrecio(){
        return precio;
    }

    public void generar(){
        imprimirEncabezado();
        System.out.println("Producto: " + getNombreProducto());
        imprimirPrecios();
        System.out.println("-----------------------");
    }

    protected abstract void imprimirEncabezado();
    protected abstract void imprimirPrecios();
}
