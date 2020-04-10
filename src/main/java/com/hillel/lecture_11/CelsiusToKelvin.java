package com.hillel.lecture_11;

public class CelsiusToKelvin implements Converter {
    @Override
    public double converter(double value) {
        return value + 273.16;
    }
}
