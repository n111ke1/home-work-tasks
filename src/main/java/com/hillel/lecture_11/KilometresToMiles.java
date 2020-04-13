package com.hillel.lecture_11;

public class KilometresToMiles implements ConverterInterface {
    @Override
    public double converter(double value) {
        return value  / 1.609;
    }
}
