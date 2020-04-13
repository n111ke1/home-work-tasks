package com.hillel.lecture_12.conveters;

public class MilesToKilometres implements Converter {
    @Override
    public double converter(double value) throws ConverterCalculationException{
        if(value < 0) throw new ConverterCalculationException(value);
        return value * 1.609;
    }
}
