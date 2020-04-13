package com.hillel.lecture_11;

public class MilesToKilometres implements ConverterInterface {
    @Override
    public double converter(double value) {
        return value * 1.609;
    }
}
