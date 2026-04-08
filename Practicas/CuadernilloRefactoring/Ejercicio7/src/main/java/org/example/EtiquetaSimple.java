package org.example;

class EtiquetaSimple extends Etiqueta {
    public EtiquetaSimple(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    protected void imprimirEncabezado() {
        System.out.println("--- ETIQUETA SIMPLE ---");
    }

    @Override
    protected void imprimirPrecios() {
        System.out.println("Precio: $" + getPrecio());
    }
}

