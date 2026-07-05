package org.example;

public class DecoratorExtension extends DecoratorFile{

    public DecoratorExtension(IFile component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        String extension = this.getFile().getExtension();
        String cadena = this.getComponent().prettyPrint();
        return (cadena + " - " + extension);
    }
}
