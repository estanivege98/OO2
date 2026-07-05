package org.example;

public class ArmaduraAcero implements Armadura{
    public int calcularDaño(Arco arco){
        return 2;
    }
    public int calcularDaño(Espada espada){
        return 3;
    }
    public int calcularDaño(Baston baston){
        return 1;
    }
    public int calcularDaño(Martillo martillo){
        return 4;
    }
}
