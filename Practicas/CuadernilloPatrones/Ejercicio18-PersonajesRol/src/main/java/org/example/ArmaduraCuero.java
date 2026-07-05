package org.example;

public class ArmaduraCuero implements Armadura{

    public int calcularDaño(Arco arco){
        return 5;

    }

    public int calcularDaño(Espada espada){
        return 8;
    }

    public int calcularDaño(Baston baston){
        return 2;
    }

    public int calcularDaño(Martillo martillo){
        return 10;
    }
}
