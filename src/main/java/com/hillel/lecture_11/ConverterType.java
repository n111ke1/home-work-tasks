package com.hillel.lecture_11;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class ConverterType implements Converter {

    private String convertType;

    public void setConvertType(String convertType) {
        this.convertType = convertType;
    }

    @Override
    public double converter(double value) {
        switch (convertType) {
            case "metersToInches": return value * 39.37;
            case "inchesToMeters": return value / 39.37;
            case "milesToKilometres": return value * 1.609;
            case "kilometresToMiles": return value  / 1.609;
            case "speedKmToMi": return value * 0.6214;
            case "speedMiToKm": return value / 0.6214;
            case "celsiusToFahrenheit": return (value* 9/5) + 32;
            case "fahrenheitToCelsius": return (value - 32) * 5/9;
            case "celsiusToKelvin": return value + 273.16;
            case "kilogramsToPounds": return  value * 2.20462;
            case "poundsToKilograms": return  value / 2.20462;
        }
        return value;
    }
}
