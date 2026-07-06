package org.example;

import java.time.LocalDate;

public class Mamifero implements IMamifero {
    private String identificador;
    private String especie;
    private LocalDate fechaNacimiento;
    private IMamifero padre;
    private IMamifero madre;


    public Mamifero(){
        this.identificador = "";
        this.especie = "";
        this.fechaNacimiento = LocalDate.now();
        this.padre = null;
        this.madre = null;
    }
    public String getIdentificador(){
        return "MamiferoNull";
    }
    public void setIdentificador(String identificador){
        this.identificador = identificador;
    }
    public String getEspecie(){
        return this.especie;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    public IMamifero getPadre(){
        return this.padre;
    }
    public void setPadre(IMamifero padre){
        this.padre = padre;
    }
    public IMamifero getMadre(){
        return this.madre;
    }
    public void setMadre(IMamifero madre){
        this.madre = madre;
    }
    public IMamifero getAbueloPaterno(){
        return this.padre.getPadre();
    }
    public IMamifero getAbuelaPaterno(){
        return this.padre.getMadre();
    }
    public IMamifero getAbueloMaterno(){
        return this.madre.getPadre();
    }
    public IMamifero getAbuelaMaterno(){
        return this.madre.getMadre();
    }

    public boolean tieneComoAncestroA(IMamifero unMamifero){
        return ((this.padre == unMamifero) || (this.madre == unMamifero)) || this.padre.tieneComoAncestroA(unMamifero) || this.madre.tieneComoAncestroA(unMamifero);
    }
}
