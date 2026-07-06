package org.example;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation implements WeatherData{
    protected double temperatura;
    protected double presion;
    protected double radiacionSolar;
    protected List<Double> temperaturas;

    public HomeWeatherStation(double temperatura, double presion, double radiacionSolar, List<Double> temperaturas) {
        this.temperatura = temperatura;
        this.presion = presion;
        this.radiacionSolar = radiacionSolar;
        this.temperaturas = temperaturas;
    }
    public double getTemperatura() {
        return this.temperatura;
    }

    public double getPresion() {
        return this.presion;
    }

    public double getRadiacionSolar() {
        return this.radiacionSolar;
    }

    public List<Double> getTemperaturas(){
        return this.temperaturas;
    }

    public String displayData() {
        return "Temperatura F: " + this.getTemperatura() +
                " Presión atmosf: " + this.getPresion() +
                " Radiación solar: " + this.getRadiacionSolar();
    }
}
