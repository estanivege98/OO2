package org.example;

import java.util.*;

public class Twitter {
    private List<Usuario> listaUsuarios = new LinkedList<Usuario>();

    public Twitter(){
    }

    public void agregarUsuario(Usuario usuario){
        this.listaUsuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario){

        this.listaUsuarios.remove(usuario);
    }

    public boolean verificarNombre(String nombre){
        return this.listaUsuarios.stream()
                .anyMatch(u -> nombre.equals(u.getNombre()));
    }
}
