package com.hillel.lecture_11;

public class CelsiusToFahrenheit implements ConverterInterface {


    @Override
    public double converter(double value) {
        return (value* 9/5) + 32;
    }
}
