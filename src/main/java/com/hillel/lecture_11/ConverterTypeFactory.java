package com.hillel.lecture_11;

/**
 * Created by alpa on 10/17/19
 */
public class ConverterTypeFactory {


    public ConverterInterface converterType(String convertType) {
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
