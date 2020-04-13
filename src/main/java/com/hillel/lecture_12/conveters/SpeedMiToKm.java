package com.hillel.lecture_12.conveters;

public class SpeedMiToKm implements Converter {
    @Override
    public double converter(double value)throws ConverterCalculationException {
        if(value < 0) throw new ConverterCalculationException(value);
        return value / 0.6214;
    }
}
