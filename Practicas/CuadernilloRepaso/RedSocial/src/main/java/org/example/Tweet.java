package org.example;

public class Tweet implements Tweets {
    private String texto;


    public Tweet() {

    }

    public void crearTweet(String texto) {
        if(texto != null && texto.length() <= 280) {
            this.texto = texto;
        }
    }

    public String getTexto() {
        return this.texto;
    }

}
