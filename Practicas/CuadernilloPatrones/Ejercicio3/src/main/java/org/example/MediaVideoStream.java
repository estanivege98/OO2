package org.example;
/* Adaptador entre interfaz Media y VideoStream */
public class MediaVideoStream implements Media{

    private VideoStream videoStream;
    public void play(){
        this.videoStream.reproduce();
    }
}
