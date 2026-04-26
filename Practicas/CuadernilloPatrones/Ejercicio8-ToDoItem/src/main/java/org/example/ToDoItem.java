package org.example;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    private String name;
    private LocalDateTime tiempoInicial;
    private LocalDateTime tiempoFinal;
    private List<String> comentarios;
    private State estado;
    public ToDoItem(String name){
        this.name = name;
        this.estado = new Pending();
        this.comentarios = new ArrayList<String>();
    }

    public ToDoItem(){

    }

    public void start(){
        this.estado.start(this);
    }

    public void togglePause(){
        this.estado.togglePause(this);
    }

    public void finish(){
        this.estado.finish(this);
    }

    public Duration workedTime(){
        if (this.estado != null) {
            return Duration.between(this.tiempoInicial, this.estado.workedTime());
        }
        throw new RuntimeException("El objeto estado no está inicializado");
    }

    public void addComment(String comment){
        this.estado.addComment(this, comment);
    }

    public List<String> getComments(){
        return this.comentarios;
    }

    public void changeState(State state){
        this.estado = state;
    }

    public State getState(){
        return this.estado;
    }
}
