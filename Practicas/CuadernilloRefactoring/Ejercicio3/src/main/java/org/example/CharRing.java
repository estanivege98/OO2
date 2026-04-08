package org.example;

public class CharRing extends Ring<Character> {
    private char[] source;

    public CharRing(String src) {
        source = src.toCharArray();
        idx = 0;
    }

    public Character next() {
        if(source.length == 0){
            return (char) 0;
        }
        if (idx >= source.length)
            idx = 0;
        return source[idx++];
    }
}
