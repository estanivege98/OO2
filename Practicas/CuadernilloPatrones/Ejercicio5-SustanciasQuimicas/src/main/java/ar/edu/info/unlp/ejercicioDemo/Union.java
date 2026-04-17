package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Union implements ElementoQuimico{

    private List<ElementoQuimico> elementos = new ArrayList<ElementoQuimico>();

    public Union(List<ElementoQuimico> elementos){
        this.elementos = elementos;
    }

    public String formula(){
        return this.elementos.stream()
                .map(e -> e.formula())
                .collect(Collectors.joining());
    }

    public int pesoMolecular(){
        return this.elementos.stream()
                .mapToInt(e -> e.pesoMolecular())
                .sum();
    }

    public int carga(){
        return this.elementos.stream()
                .mapToInt(e -> e.carga())
                .sum();
    }

    public boolean esValida(){
        boolean isCurrentValid = this.elementos.stream()
                .filter(e -> e.esMetal())
                .count() <= 1;
        boolean areChildrenValid = this.elementos.stream()
                .allMatch(e -> e.esValida());
        return isCurrentValid && areChildrenValid;
    }

    public boolean esMetal() {
        return this.elementos.stream()
                .anyMatch(e -> e.esMetal());
    }
}
