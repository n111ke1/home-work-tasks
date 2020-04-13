package com.hillel.lecture_12.conveters;

public class ConverterCalculationException extends  Exception {
    private double value;
    public double getNumber(){return value;}

    public ConverterCalculationException(double value) {
        super("Value should be great than 0");
    }
}
