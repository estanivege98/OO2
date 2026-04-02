package org.example;

public class ReTweet implements Tweets {
    private Tweet origen;

    public ReTweet(Tweet origen) {
        this.origen = origen;
    }
}
