package org.example;

import java.util.List;

public abstract class WeatherDecorator implements WeatherData{
    protected WeatherData weatherData;

    public WeatherDecorator(WeatherData weatherData){
        this.weatherData = weatherData;
    }

    public double getTemperatura(){
        return weatherData.getTemperatura();
    }

    public double getPresion(){
        return weatherData.getPresion();
    }

    public double getRadiacionSolar(){
        return weatherData.getRadiacionSolar();
    }

    public List<Double> getTemperaturas(){
        return weatherData.getTemperaturas();
    }

    public String displayData(){
        return weatherData.displayData();
    }
}
