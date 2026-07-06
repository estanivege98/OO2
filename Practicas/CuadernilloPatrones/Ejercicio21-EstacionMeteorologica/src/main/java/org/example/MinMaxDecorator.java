package org.example;

public class MinMaxDecorator extends WeatherDecorator{
    public MinMaxDecorator(WeatherData weatherData) {
        super(weatherData);
    }

    @Override
    public String displayData(){
        return this.weatherData.displayData() + " " + "Minimo: " + this.weatherData.getTemperaturas().stream()
                .mapToDouble(t -> t).min().orElse(0) + " Maximo: " + this.weatherData.getTemperaturas().stream()
                .mapToDouble(t -> t).max().orElse(0);
    }
}
