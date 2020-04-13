package com.hillel.lecture_12;

import com.hillel.lecture_11.*;

public class ConverterTemparatureFactory {

    public Converter converter(String operation) throws ConverterException{
        switch (operation) {
            case "celsiusToFahrenheit":
                if(!operation.equals("celsiusToFahrenheit")) throw new ConverterException();
                return new CelsiusToFahrenheit();
            case "fahrenheitToCelsius":
                if(!operation.equals("fahrenheitToCelsius")) throw new ConverterException();
                return new FahrenheitToCelsius();
            case "celsiusToKelvin":
                if(!operation.equals("celsiusToKelvin")) throw new ConverterException();
                return new CelsiusToKelvin();
            default: return null;
        }
    }
}

