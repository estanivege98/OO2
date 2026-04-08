package org.example;

import java.time.LocalDate;

public class HotelStay extends Product {
    private double cost; /*Encapsulate Field: anteriormente era un campo publico, debo hacer un metodo getCost() para que las otras clases
     * puedan consultar el costo. Se tienen que cambiar los test tambien*/
    private TimePeriod timePeriod;
    private Hotel hotel;

    public HotelStay(double cost, TimePeriod timePeriod, Hotel hotel) {
        this.cost = cost;
        this.timePeriod = timePeriod;
        this.hotel = hotel;
    }
    public double getCost(){
        return this.cost;
    }

    public LocalDate startDate() {
        return this.timePeriod.start();
    }

    public LocalDate endDate() {
        return this.timePeriod.end();
    }

    public double priceFactor() {
        return this.cost / this.price();
    }

    public double price() {
        return this.timePeriod.duration() * this.hotel.nightPrice() * this.hotel.discountRate();
    }
}
