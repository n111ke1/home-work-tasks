package com.hillel.lecture_12.conveters;

public class CelsiusToKelvin implements Converter {
    @Override
    public double converterValue(double value) throws ConverterCalculationException {
        if(value < 0) throw new ConverterCalculationException(value);
        return value + 273.16;
    }
}
