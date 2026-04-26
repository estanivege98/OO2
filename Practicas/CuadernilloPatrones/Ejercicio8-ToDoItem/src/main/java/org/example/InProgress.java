package org.example;

public class InProgress extends State{
    public void start(ToDoItem context){
        // nada
    }

    public void togglePause(ToDoItem context){
        context.changeState(new Paused());
    }

    public void finish(ToDoItem context){
        context.changeState(new Finished());
    }

    public void addComment(ToDoItem context, String comment){
        context.addComment(comment);
    }
}
