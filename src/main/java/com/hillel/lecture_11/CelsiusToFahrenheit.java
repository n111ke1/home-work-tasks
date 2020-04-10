package com.hillel.lecture_11;

public class CelsiusToFahrenheit implements Converter {


    @Override
    public double converter(double value) {
        return (value* 9/5) + 32;
    }
}
