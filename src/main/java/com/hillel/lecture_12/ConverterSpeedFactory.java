package com.hillel.lecture_12;


import com.hillel.lecture_12.conveters.Converter;
import com.hillel.lecture_12.conveters.SpeedKmToMi;
import com.hillel.lecture_12.conveters.SpeedMiToKm;

public class ConverterSpeedFactory {


    public Converter converter(String operation) throws ConverterException {

        switch (operation) {
            case "speedKmToMi":
                if(!operation.equals("speedKmToMi")) throw new ConverterException();
                return new SpeedKmToMi();
            case "speedMiToKm":
                if(!operation.equals("speedMiToKm")) throw new ConverterException();
                return new SpeedMiToKm();
            default: return null;
        }
    }
}
