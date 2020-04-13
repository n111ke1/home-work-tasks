package com.hillel.lecture_11;

public class InchesToMeters implements ConverterInterface {
    @Override
    public double converter(double value) {
        return value / 39.37;
    }
}
