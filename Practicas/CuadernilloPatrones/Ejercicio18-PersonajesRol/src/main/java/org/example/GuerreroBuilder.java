package org.example;

public class GuerreroBuilder implements PersonajeBuilder{

    private Personaje personaje;

    public GuerreroBuilder(Personaje personaje){
        this.personaje = personaje;
    }

    public void equiparArmadura(){
        this.obtenerPersonaje().setArmadura(new ArmaduraAcero());
    }
    public void equiparArma(){
        this.obtenerPersonaje().setArma(new Espada());
    }
    public void agregarHabilidades(){
        this.obtenerPersonaje().addHabilidad(new Habilidad("Combate cuerpo a cuerpo"));
    }
    public Personaje obtenerPersonaje(){
        return this.personaje;
    }
}
