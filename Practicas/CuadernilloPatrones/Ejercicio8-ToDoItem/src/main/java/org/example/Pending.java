package org.example;

public class Pending extends State{

    public void start(ToDoItem context){
        context.changeState(new InProgress());
    }

    public void togglePause(ToDoItem context){
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pausa o en progreso");
    }

    public void finish(ToDoItem context){
        throw new RuntimeException("El objeto ToDoItem no se encuentra en progreso");
    }

    public void addComment(ToDoItem context, String comment){
        context.getComments().add(comment);
    }
}
