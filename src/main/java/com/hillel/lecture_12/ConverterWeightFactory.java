package com.hillel.lecture_12;


import com.hillel.lecture_12.conveters.Converter;
import com.hillel.lecture_12.conveters.KilogramsToPounds;
import com.hillel.lecture_12.conveters.PoundsToKilograms;

public class ConverterWeightFactory implements Type {
    final public static String KILOGRAMS_TO_POUNDS = "kilogramsToPounds";
    final public static String POUNDS_TO_KILOGRAMS = "poundsToKilograms";

    @Override
    public Converter converterOperation(String operation) throws ConverterException {
            if (operation.equals(KILOGRAMS_TO_POUNDS)|operation.equals(POUNDS_TO_KILOGRAMS)) {
            switch (operation) {
                case KILOGRAMS_TO_POUNDS:
                    return new KilogramsToPounds();
                case POUNDS_TO_KILOGRAMS:
                    return new PoundsToKilograms();
                default: return null;
            }
        } else throw new ConverterException(operation);
    }
}




