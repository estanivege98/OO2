package org.example;

public class IntRing extends Ring<Integer> {

    private final int[] source;

    public IntRing(int[] src) {
        source = src;
        idx = 0;
    }

    public Integer next() {
        if (source.length == 0) {
            return 0;
        }
        if (idx >= source.length)
            idx = 0;
        return source[idx++];
    }

}
