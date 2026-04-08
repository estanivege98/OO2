package org.example;

import java.time.LocalDate;

public class CarRental extends Product {
    private double cost; /*Encapsulate Field: anteriormente era un campo publico, debo hacer un metodo getCost() para que las otras clases
    * puedan consultar el costo. Se tienen que cambiar los test tambien*/

    private Company company;

    public CarRental(double cost, TimePeriod timePeriod, Company company) {
        super(timePeriod);
        this.cost = cost;
        this.company = company;
    }

    public double getCost(){
        return this.cost;
    }
    // Para aplicar Pull-up method primero debo aplicar Pull-up Field en la clase Product
    // luego mover los metodos a la clase abstracta

    /* En el metodo price tiene una mala responsabilidad y envidia de atributos,
    porque le pide a la clase company atributos para que haga una cuenta que tranquilamente
    lo puede resolver la clase y luego devolverlo. Aplico move method a la clase company y luego lo llamo desde el metodo price
    * */
    public double price() {
        return this.company.getFinalPrice();
    }

    public double cost() {
        return this.cost;
    }
}
