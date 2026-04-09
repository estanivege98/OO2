package org.example;

import java.util.List;

public class Document {
    List<String> words;

    public long characterCount() {
        long count = this.words
                .stream()
                .mapToLong(w -> w.length())
                .sum();
        return count;
    }
    private long getWordsSize(){
        return this.words.size();
    }
    public long calculateAvg() {
        if(getWordsSize() == 0) return 0;
        return characterCount() / getWordsSize();
    }
// Resto del código que no importa
}
