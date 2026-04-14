package org.example;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    private List<Media> files;

    public MediaPlayer() {
        this.files = new ArrayList<Media>();
    }

    public void addFile(Media media){
        this.files.add(media);
    }
}
