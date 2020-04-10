package com.hillel.lecture_11;

/**
 * Created by alpa on 10/17/19
 */
public class ConverterType {

//    private String convertType;
//
//    public void setConvertType(String convertType) {
//        this.convertType = convertType;
//    }

//    @Override
//    public double converter(double value) {
//        switch (convertType) {
//            case "metersToInches": return value * 39.37;
//            case "inchesToMeters": return value / 39.37;
//            case "milesToKilometres": return value * 1.609;
//            case "kilometresToMiles": return value  / 1.609;
//            case "speedKmToMi": return value * 0.6214;
//            case "speedMiToKm": return value / 0.6214;
//            case "celsiusToFahrenheit": return (value* 9/5) + 32;
//            case "fahrenheitToCelsius": return (value - 32) * 5/9;
//            case "celsiusToKelvin": return value + 273.16;
//            case "kilogramsToPounds": return  value * 2.20462;
//            case "poundsToKilograms": return  value / 2.20462;
//        }
//        return value;
//    }

    public Converter converterType(String convertType) {
        switch (convertType) {
            case "metersToInches": return new MetersToInches();
            case "inchesToMeters": return new InchesToMeters();
            case "milesToKilometres": return new MilesToKilometres();
            case "kilometresToMiles": return new KilometresToMiles();
            case "speedKmToMi": return new SpeedKmToMi();
            case "speedMiToKm": return new SpeedMiToKm();
            case "celsiusToFahrenheit": return new CelsiusToFahrenheit();
            case "fahrenheitToCelsius": return new FahrenheitToCelsius();
            case "celsiusToKelvin": return new CelsiusToKelvin();
            case "kilogramsToPounds": return  new KilogramsToPounds();
            case "poundsToKilograms": return  new PoundsToKilograms();
            default: return null;
        }
    }


}
