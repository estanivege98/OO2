package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class TopografiaMixta implements Topografia{
    private List<Topografia> componentes;

    public TopografiaMixta(){
        componentes = new ArrayList<Topografia>();
    }

    public void agregarComponente(Topografia componente) {
        if (this.componentes.size() >= 4) {
            throw new RuntimeException("No pueden agregarse mas de 4 objetos");
        }
        this.componentes.add(componente);
    }


    public double proporcionAgua(){
        return this.componentes.stream().mapToDouble(t -> t.proporcionAgua()).average().orElse(0);
    }

    public double proporcionTierra(){
        return this.componentes.stream().mapToDouble(t -> t.proporcionTierra()).average().orElse(0);
    }

    @Override
    public boolean esIgualA(Topografia t){
         return t.esIgualAMixta(this);
    }
    
    @Override
    public boolean esIgualAMixta(TopografiaMixta mix){
        boolean mismoTamaño = (this.componentes.size() == mix.componentes.size());
        boolean elementosIguales = IntStream.range(0, this.componentes.size())
            .allMatch(i -> this.componentes.get(i).esIgualA(mix.componentes.get(i)));
        return mismoTamaño && elementosIguales;
    }
}
