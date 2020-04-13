package com.hillel.lecture_12;

import com.hillel.lecture_11.*;

public class ConverterWeightFactory {

    public Converter converter(String operation) throws ConverterException{
        switch (operation) {
            case "kilogramsToPounds":
                if(!operation.equals("kilogramsToPounds")) throw new ConverterException();
                return  new KilogramsToPounds();
            case "poundsToKilograms":
                if(!operation.equals("kilogramsToPounds")) throw new ConverterException();
                return  new PoundsToKilograms();
            default: return null;
        }
    }
}
