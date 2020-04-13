package com.hillel.lecture_12.conveters;

public class FahrenheitToCelsius implements Converter {
    @Override
    public double converterValue(double value) throws ConverterCalculationException {
        if(value < 0) throw new ConverterCalculationException(value);
        return (value - 32) * 5/9;
    }
}
