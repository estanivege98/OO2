package org.example;

import java.time.LocalDate;

public class Desconocido implements IMamifero{

    public Desconocido(){

    }

    public String getIdentificador(){
        return "Desconocido";
    }
    public String getEspecie(){
        return "Desconocido";
    }
    public LocalDate getFechaNacimiento(){
        return null;
    }
    public IMamifero getPadre(){
        return this;
    }
    public IMamifero getMadre(){
        return this;
    }
    public IMamifero getAbueloPaterno(){
        return this;
    }
    public IMamifero getAbueloMaterno(){
        return this;
    }
    public IMamifero getAbuelaPaterno(){
        return this;
    }
    public IMamifero getAbuelaMaterno(){
        return this;
    }
    public boolean tieneComoAncestroA(IMamifero unMamifero){
        return false;
    }

    public void setIdentificador(String identificador){}
    public void setEspecie(String especie){}
    public void setFechaNacimiento(LocalDate fechaNacimiento){}
    public void setPadre(IMamifero padre){}
    public void setMadre(IMamifero madre){}
}
