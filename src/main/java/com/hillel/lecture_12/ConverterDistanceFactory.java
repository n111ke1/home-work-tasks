package com.hillel.lecture_12;

import com.hillel.lecture_12.conveters.*;

public class ConverterDistanceFactory implements Type {
    final public static String METERS_TO_INCHES = "metersToInches";
    final public static String INCHES_TO_METERS = "inchesToMeters";
    final public static String MILES_TO_KILOMETRES = "milesToKilometres";
    final public static String KILOMETRES_TO_MILES = "kilometresToMiles";
    @Override
    public Converter converterOperation(String operation) throws ConverterException {
        if (operation.equals(METERS_TO_INCHES) | operation.equals(INCHES_TO_METERS)| operation.equals(MILES_TO_KILOMETRES)| operation.equals(KILOMETRES_TO_MILES)) {
            switch (operation) {
                case METERS_TO_INCHES:
                    return new MetersToInches();
                case INCHES_TO_METERS:
                    return new InchesToMeters();
                case MILES_TO_KILOMETRES:
                    return new MilesToKilometres();
                case KILOMETRES_TO_MILES:
                    return new KilometresToMiles();
                default: return null;
            }
        }else throw new ConverterException(operation);

    }
}

