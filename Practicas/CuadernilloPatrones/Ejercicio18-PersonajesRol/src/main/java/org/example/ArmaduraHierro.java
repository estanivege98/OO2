package org.example;

public class ArmaduraHierro implements Armadura{
    public int calcularDaño(Arco arco){
        return 3;
    }

    public int calcularDaño(Espada espada){
        return 5;
    }

    public int calcularDaño(Baston baston){
        return 1;
    }

    public int calcularDaño(Martillo martillo){
        return 6;
    }
}
