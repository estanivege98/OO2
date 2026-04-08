package org.example;

public class Publicacion {
    private String texto;
    private int likes;
    public Publicacion(String texto) {
        this.texto = texto;
        this.likes = 0;
    }
    public void darLike() { likes++; }
    public void darDislike() { likes--; }
    private int impacto() { //se realizo Rename Method (antes era procesar())
        return likes * 3;
    }
    public int alcance() { //se realizo Rename Method (antes era calcular)
        return impacto() * 10;
    }
}
