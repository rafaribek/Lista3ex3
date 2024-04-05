package br.cesul.app;

import br.cesul.shape.TemperatureConverter;

public class Main {
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = 37;

        System.out.println(fahrenheit + " Fahrenheit é " + TemperatureConverter.fahrenheitToCelsius(fahrenheit) + " Celsius");
        System.out.println(celsius + " Celsius é " + TemperatureConverter.celsiusToFahrenheit(celsius) + " Fahrenheit");
    }
}
