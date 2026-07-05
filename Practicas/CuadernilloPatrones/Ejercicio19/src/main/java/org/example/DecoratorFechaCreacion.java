package org.example;

import java.time.LocalDate;

public class DecoratorFechaCreacion extends DecoratorFile{

    public DecoratorFechaCreacion(IFile component) {
        super(component);
    }

    public String prettyPrint(){
        String fechaCreacion = this.getFile().getFechaCreacion().toString();
        String cadena = this.getComponent().prettyPrint();
        return (cadena + " - " + fechaCreacion);
    }
}
