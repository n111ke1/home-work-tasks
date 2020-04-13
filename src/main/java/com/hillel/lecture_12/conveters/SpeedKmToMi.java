package com.hillel.lecture_12.conveters;

public class SpeedKmToMi implements Converter {


    @Override
    public double converter(double value) throws ConverterCalculationException {
        if(value < 0) throw new ConverterCalculationException(value);
        System.out.println(value * 0.6214);
        return value * 0.6214;
    }
}
