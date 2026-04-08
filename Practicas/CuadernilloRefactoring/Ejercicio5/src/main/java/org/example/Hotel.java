package org.example;

public class Hotel {
    private double nightPrice;
    private double discountRate;

    public Hotel(double nightPrice, double discountRate) {
        this.nightPrice = nightPrice;
        this.discountRate = discountRate;
    }

    private double nightPrice() {
        return this.nightPrice;
    }

    private double discountRate() {
        return this.discountRate;
    }

    public double getFinalPrice(){ return this.nightPrice() * this.discountRate(); }
}
