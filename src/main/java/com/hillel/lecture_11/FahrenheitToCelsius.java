package com.hillel.lecture_11;

public class FahrenheitToCelsius implements ConverterInterface {
    @Override
    public double converter(double value) {
        return (value - 32) * 5/9;
    }
}
