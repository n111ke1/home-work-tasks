package com.hillel.lecture_12.conveters;

public class KilogramsToPounds implements Converter {
    @Override
    public double converterValue(double value) throws ConverterCalculationException {
        if(value < 0) throw new ConverterCalculationException(value);
        return value * 2.20462;
    }
}
