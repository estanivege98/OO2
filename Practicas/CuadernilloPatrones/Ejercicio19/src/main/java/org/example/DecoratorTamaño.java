package org.example;

public class DecoratorTamaño extends DecoratorFile{
    public DecoratorTamaño(IFile component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        int tamaño = this.getFile().getTamanio();
        String cadena = this.getComponent().prettyPrint();
        return (cadena + " - " + tamaño);
    }
}
