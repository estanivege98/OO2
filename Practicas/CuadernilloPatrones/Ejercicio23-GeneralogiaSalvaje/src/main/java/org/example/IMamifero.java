package org.example;

import java.time.LocalDate;

public interface IMamifero {
    public String getIdentificador();
    public void setIdentificador(String id);
    public String getEspecie();
    public void setEspecie(String especie);
    public LocalDate getFechaNacimiento();
    public void setFechaNacimiento(LocalDate fechaNacimiento);
    public IMamifero getPadre();
    public void setPadre(IMamifero padre);
    public IMamifero getMadre();
    public void setMadre(IMamifero madre);
    public IMamifero getAbueloMaterno();
    public IMamifero getAbuelaMaterno();
    public IMamifero getAbueloPaterno();
    public IMamifero getAbuelaPaterno();
    public boolean tieneComoAncestroA(IMamifero unMamifero);
}
