package org.example;

public class Paused extends State{
    public void start(ToDoItem context){

    }

    public void togglePause(ToDoItem context){
        context.changeState(new InProgress());
    }

    public void finish(ToDoItem context){
        context.changeState(new Finished());
    }

    public void addComment(ToDoItem context, String comment){
        context.addComment(comment);
    }
}
