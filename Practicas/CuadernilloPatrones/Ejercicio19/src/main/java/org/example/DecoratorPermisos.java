package org.example;

import java.util.List;

public class DecoratorPermisos extends DecoratorFile{
    public DecoratorPermisos(IFile component) {
        super(component);
    }

    public String prettyPrint(){
        List<String> permisos = this.getFile().getPermisos();
        String cadena = this.getComponent().prettyPrint();
        return (cadena + " - " + permisos.toString());
    }
}
