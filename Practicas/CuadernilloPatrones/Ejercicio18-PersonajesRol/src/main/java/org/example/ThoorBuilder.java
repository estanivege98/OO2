package org.example;

public class ThoorBuilder implements PersonajeBuilder {
    private Personaje personaje;

    public ThoorBuilder(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void equiparArmadura() {
        personaje.setArmadura(new ArmaduraHierro());
    }

    @Override
    public void equiparArma() {
        personaje.setArma(new Martillo());
    }

    @Override
    public void agregarHabilidades() {
        personaje.addHabilidad(new Habilidad("Lanzar rayos"));
        personaje.addHabilidad(new Habilidad("Combate a distancia"));
    }

    @Override
    public Personaje obtenerPersonaje() {
        return personaje;
    }
}
