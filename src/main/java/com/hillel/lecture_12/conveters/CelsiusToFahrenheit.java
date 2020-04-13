package com.hillel.lecture_12.conveters;

public class CelsiusToFahrenheit implements Converter {


    @Override
    public double converter(double value) throws ConverterCalculationException{
        if(value < 0) throw new ConverterCalculationException(value);
        return (value* 9/5) + 32;
    }
}
