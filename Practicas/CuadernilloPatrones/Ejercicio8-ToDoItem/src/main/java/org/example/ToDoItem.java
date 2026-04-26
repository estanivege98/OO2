package org.example;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class ToDoItem {
    private String name;
    private LocalDateTime tiempoInicial;
    private LocalDateTime tiempoFinal;
    private List<String> comentarios;

    public ToDoItem(String name){
        this.name = name;

    }

    public void start(){

    }

    public void togglePause(){

    }

    public void finish(){

    }

    public Duration workedTime(){

    }

    public void addComment(String comment){

    }

    public List<String> getComments(){
        return this.comentarios;
    }

    public void changeState(State state){

    }
}
