package com.hillel.lecture_11;

import com.hillel.lecture_12.conveters.Converter;
import com.hillel.lecture_12.conveters.ConverterCalculationException;

public class PoundsToKilograms implements ConverterInterface {
    @Override
    public double converter(double value) {
        return value / 2.20462;
    }


}
