package org.example;

import java.util.List;

public class CelsiusDecorator extends WeatherDecorator{
    public CelsiusDecorator(WeatherData weatherData) {
        super(weatherData);
    }

    @Override
    public double getTemperatura() {
        return this.devolverTempEnCelcius(this.weatherData.getTemperatura());
    }

    private double devolverTempEnCelcius(double temperatura) {
        return (temperatura - 32) * 5 / 9;
    }

    public List<Double> getTemperaturas(){
        List<Double> temperaturasFahrenheit = this.weatherData.getTemperaturas();
        return temperaturasFahrenheit.stream()
                .map(tempF -> this.devolverTempEnCelcius(tempF))
                .toList();
    }

    @Override
    public String displayData() {
        return "Temperatura: " + getTemperatura() + "°C\n" +
               "Presión: " + getPresion() + " hPa\n" +
               "Radiación Solar: " + getRadiacionSolar() + " W/m²";
    }
}
