package com.hillel.lecture_12;
import com.hillel.lecture_12.conveters.CelsiusToFahrenheit;
import com.hillel.lecture_12.conveters.CelsiusToKelvin;
import com.hillel.lecture_12.conveters.Converter;
import com.hillel.lecture_12.conveters.FahrenheitToCelsius;

public class ConverterTemparatureFactory implements Type {

    final static String CELSIUS_TO_FAHRENHEIT = "celsiusToFahrenheit";
    final static String FAHRENHEIT_TO_CELSIUS = "fahrenheitToCelsius";
    final static String CELSIUS_TO_KELVIN = "celsiusToKelvin";

    public Converter converterOperation(String operation) throws ConverterException{
        if(operation.equals(CELSIUS_TO_FAHRENHEIT)|operation.equals(FAHRENHEIT_TO_CELSIUS)|operation.equals(CELSIUS_TO_KELVIN)) {
            switch (operation) {
                case CELSIUS_TO_FAHRENHEIT: return new CelsiusToFahrenheit();
                case FAHRENHEIT_TO_CELSIUS: return new FahrenheitToCelsius();
                case CELSIUS_TO_KELVIN: return new CelsiusToKelvin();
                default: return null;
            }
        }else throw new ConverterException(operation);
    }

}

