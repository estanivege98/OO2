package org.example;

public class Finished extends State{

    public void start(ToDoItem context){
        // nada...
    }

    public void togglePause(ToDoItem context){
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pausa o en progreso");
    }

    public void finish(ToDoItem context){
        // nada
    }

    public void addComment(ToDoItem context, String comment){
        // nada
    }
}
