package org.example;

public class ArqueroBuilder implements PersonajeBuilder {
    private Personaje personaje;

    public ArqueroBuilder(Personaje personaje) {
        this.personaje = personaje;
    }

    public void equiparArmadura(){
        this.obtenerPersonaje().setArmadura(new ArmaduraCuero());
    }

    public void equiparArma(){
        this.obtenerPersonaje().setArma(new Arco());
    }

    public void agregarHabilidades(){
        this.obtenerPersonaje().addHabilidad(new Habilidad("Disparos de flecha"));
    }

    public Personaje obtenerPersonaje(){
        return personaje;
    }
}
