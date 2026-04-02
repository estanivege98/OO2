package org.example;
import java.io.Console;
import java.util.List;
import java.util.LinkedList;
public class Usuario {
    private String screenName;
    private List<Tweets> listaTweets = new LinkedList<Tweets>();
    private Twitter plataforma;

    public Usuario(Twitter plataforma) {
        this.plataforma = plataforma;
    }

    public void crearMiCuenta(String screenName){
        if(!plataforma.verificarNombre(screenName)){
            this.screenName = screenName;
            plataforma.agregarUsuario(this);
        }
        else{
            System.out.println("Nombre existente");
        }
    }


    public String getNombre() {
        return this.screenName;
    }

    public void eliminarMiCuenta(){
        this.listaTweets.clear();
        this.plataforma.eliminarUsuario(this);
    }

    public void agregarTweet(Tweets tweet){
        this.listaTweets.add(tweet);
    }
}
