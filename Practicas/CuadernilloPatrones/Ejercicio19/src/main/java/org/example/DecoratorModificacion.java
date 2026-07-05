package org.example;

import java.time.LocalDate;

public class DecoratorModificacion extends DecoratorFile{
    public DecoratorModificacion(IFile component){
        super(component);
    }

    public String prettyPrint(){
        String fechaModificacion = this.getFile().getFechaModificacion().toString();
        String cadena = this.getComponent().prettyPrint();
        return (cadena + " - " + fechaModificacion);
    }
}
