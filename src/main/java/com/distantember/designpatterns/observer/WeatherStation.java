package com.distantember.designpatterns.observer;

/**
 * Created by jondann on 1/16/17.
 */
public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
