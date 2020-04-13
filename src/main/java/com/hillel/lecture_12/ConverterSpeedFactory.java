package com.hillel.lecture_12;

import com.hillel.lecture_12.conveters.Converter;
import com.hillel.lecture_12.conveters.SpeedKmToMi;
import com.hillel.lecture_12.conveters.SpeedMiToKm;

public class ConverterSpeedFactory implements Type {
    final public static String SPEED_KM_TO_MI = "speedKmToMi";
    final public static String SPEED_MI_TO_KM = "speedMiToKm";


    public Converter converterOperation(String operation) throws ConverterException {
        if (operation.equals(SPEED_KM_TO_MI) | operation.equals(SPEED_MI_TO_KM)) {
            switch (operation) {
                case SPEED_KM_TO_MI: return new SpeedKmToMi();
                case SPEED_MI_TO_KM: return new SpeedMiToKm();
                default: return null;
            }
        } else throw new ConverterException(operation);
    }
}

