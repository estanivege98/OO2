package org.example;

import java.time.LocalDate;

public class CarRental extends Product {
    private double cost; /*Encapsulate Field: anteriormente era un campo publico, debo hacer un metodo getCost() para que las otras clases
    * puedan consultar el costo. Se tienen que cambiar los test tambien*/
    private TimePeriod timePeriod;
    private Company company;

    public CarRental(double cost, TimePeriod timePeriod, Company company) {
        this.cost = cost;
        this.timePeriod = timePeriod;
        this.company = company;
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

    public double price() {
        return this.company.price() * this.company.promotionRate();
    }

    public double cost() {
        return this.cost;
    }
}
