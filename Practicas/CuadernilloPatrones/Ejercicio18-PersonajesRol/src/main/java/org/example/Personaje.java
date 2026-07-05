package org.example;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private String nombre;
    private Integer vida;
    private Arma arma;
    private Armadura armadura;
    private List<Habilidad> habilidades;

    public Personaje(){
        this.vida = 100;
        this.habilidades = new ArrayList<Habilidad>();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setArma(Arma arma){
        this.arma = arma;
    }

    public void setArmadura(Armadura armadura){
        this.armadura = armadura;
    }

    public void addHabilidad(Habilidad habilidad){
        this.habilidades.add(habilidad);
    }
    public int getVida(){
        return this.vida;
    }

    public void enfrentar(Personaje oponente){
        this.controlarSiTieneVida();
        oponente.controlarSiTieneVida();

        this.atacar(oponente);
    }

    private void atacar(Personaje oponente) {
        int calcularDaño = this.arma.obtenerDaño(oponente.armadura);
        oponente.restarVida(calcularDaño);
    }

    private void restarVida(int danio) {
        this.vida -= danio;
    }

    protected void controlarSiTieneVida() {
        if(!this.tieneVida()){
            throw new RuntimeException("No tiene Vida para atacar");
        }
    }

    private boolean tieneVida() {
        return this.vida > 0;
    }

    protected Armadura getArmadura() {
        return this.armadura;
    }
}
