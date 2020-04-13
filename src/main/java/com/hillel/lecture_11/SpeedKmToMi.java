package com.hillel.lecture_11;

public class SpeedKmToMi implements ConverterInterface {




    @Override
    public double converter(double value) {
        return value * 0.6214;
    }
}
