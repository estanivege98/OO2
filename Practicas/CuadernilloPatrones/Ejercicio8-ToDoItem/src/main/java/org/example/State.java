package org.example;

import java.time.LocalDateTime;

public abstract class State {
    public LocalDateTime workedTime(){
        return LocalDateTime.now();
    }

    public abstract void start(ToDoItem context);
    public abstract void togglePause(ToDoItem context);
    public abstract void finish(ToDoItem context);
    public abstract void addComment(ToDoItem context, String comment);
}
