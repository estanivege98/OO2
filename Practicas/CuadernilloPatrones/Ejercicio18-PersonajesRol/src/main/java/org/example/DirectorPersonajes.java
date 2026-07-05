package org.example;

public class DirectorPersonajes {
    private PersonajeBuilder personajeBuilder;
    public Personaje crearPersonaje(PersonajeBuilder personajeBuilder) {
        this.personajeBuilder = personajeBuilder;
        personajeBuilder.equiparArmadura();
        personajeBuilder.equiparArma();
        personajeBuilder.agregarHabilidades();
        return personajeBuilder.obtenerPersonaje();
    }


}
