package org.example;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Componente> componentes;

    public Catalogo(){
        this.componentes = new ArrayList<Componente>();
    }

    public Catalogo(List<Componente> componentes){
        this.componentes = componentes;
    }

    public Componente getComponente(String descripcion){
        return this.componentes.stream().filter(c -> c.getDescripcion().equals(descripcion)).findFirst().get();
    }
}
