package com.hillel.lecture_11;

public class PoundsToKilograms implements Converter {
    @Override
    public double converter(double value) {
        return value / 2.20462;
    }
}