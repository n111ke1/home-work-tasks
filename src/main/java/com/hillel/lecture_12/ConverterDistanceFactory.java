package com.hillel.lecture_12;

import com.hillel.lecture_11.*;

public class ConverterDistanceFactory {

    public Converter converter(String operation) throws ConverterException {


            switch (operation) {
                case "metersToInches":
                    if(!operation.equals("metersToInches")) throw new ConverterException();
                    return new MetersToInches();
                case "inchesToMeters":
                    if(!operation.equals("inchesToMeters")) throw new ConverterException();
                    return new InchesToMeters();
                case "milesToKilometres":
                    if(!operation.equals("milesToKilometres")) throw new ConverterException();
                    return new MilesToKilometres();
                case "kilometresToMiles":
                    if(!operation.equals("kilometresToMiles")) throw new ConverterException();
                    return new KilometresToMiles();
                default: return null;
            }
    }
}

