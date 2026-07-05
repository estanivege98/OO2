package org.example;

public class MagoBuilder implements PersonajeBuilder {
    private Personaje personaje;

    public MagoBuilder(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void equiparArmadura() {
        personaje.setArmadura(new ArmaduraCuero());
    }

    @Override
    public void equiparArma() {
        personaje.setArma(new Baston());
    }

    @Override
    public void agregarHabilidades() {
        personaje.addHabilidad(new Habilidad("Magia"));
        personaje.addHabilidad(new Habilidad("Combate a distancia"));
    }

    @Override
    public Personaje obtenerPersonaje() {
        return this.personaje;
    }
}
