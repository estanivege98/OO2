package org.example;

public interface Topografia {
    public double proporcionAgua();
    public double proporcionTierra();
    public boolean esIgualA(Topografia t);
    default boolean esIgualAAgua(TopografiaAgua t) { return false; }
    default boolean esIgualATierra(TopografiaTierra t) { return false; }
    default boolean esIgualAPantano(TopografiaPantano t) { return false; }
    default boolean esIgualAMixta(TopografiaMixta t) { return false; }
}
