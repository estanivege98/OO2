package org.example;

import java.time.LocalDate;

public class HotelStay extends Product {
    private double quote; /*Encapsulate Field: anteriormente era un campo publico, debo hacer un metodo getCost() para que las otras clases
     * puedan consultar el costo. Se tienen que cambiar los test tambien*/

    private Hotel hotel;

    public HotelStay(double quote, TimePeriod timePeriod, Hotel hotel) {
        super(timePeriod);
        this.quote = quote;
        this.hotel = hotel;
    }
    public double getCost(){
        return this.quote;
    }

    // Para aplicar Pull-up method primero debo aplicar Pull-up Field en la clase Product
    // luego mover los metodos a la clase abstracta

    public double priceFactor() {
        return this.quote / this.price();
    } /* Al cambiar de "cost" a "quote" no es necesario cambiar los test porque ya existe el metodo "getCost" el cual devuelve lo mismo
    pero con otro nombre*/

    /* En el metodo price tiene una mala responsabilidad y envidia de atributos,
    porque le pide a la clase hotel atributos para que haga una cuenta que tranquilamente
    lo puede resolver la clase y luego devolverlo Aplico move method a la clase hotel y luego lo llamo desde el metodo price
    * */
    public double price() {
        return this.timePeriod.duration() * this.hotel.getFinalPrice();
    }
}
