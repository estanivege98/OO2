package org.example;

public class PromedioDecorator extends WeatherDecorator{
    public PromedioDecorator(WeatherData weatherData) {
        super(weatherData);
    }

    @Override
    public String displayData(){
        return this.weatherData.displayData() + " " + "Promedio: " + this.weatherData.getTemperaturas().stream()
                .mapToDouble(t -> t).average().orElse(0);
    }
}
