package com.hillel.lecture_12.conveters;

public class PoundsToKilograms implements Converter {
    @Override
    public double converter(double value) throws ConverterCalculationException {
        if(value < 0) throw new ConverterCalculationException(value);
        return value / 2.20462;
    }
}
