package org.example;

class EtiquetaDetalle extends Etiqueta {
    public EtiquetaDetalle(String nombre, double precio) {
        super(nombre, precio);
    }


    private double imprimirPrecioFinal() {
        return getPrecio();
    }

    private double imprimirPrecioSinImp() {
        return getPrecio() * 0.79;
    }

    @Override
    protected void imprimirEncabezado() {
        System.out.println("--- ETIQUETA DETALLE ---");
    }

    @Override
    protected void imprimirPrecios() {
        System.out.println("Precio sin imp.: $" + imprimirPrecioSinImp());
        System.out.println("Precio final: $" + imprimirPrecioFinal());
    }
}

