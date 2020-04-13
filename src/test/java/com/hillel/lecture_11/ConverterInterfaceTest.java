package com.hillel.lecture_11;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by alpa on 10/17/19
 */
public class ConverterInterfaceTest {


    private ConverterTypeFactory converter = new ConverterTypeFactory();


    @Test
    public void celsiusToFahrenheitTest() {

        double expectedResult = 50.0;
        assertEquals(converter.converterType("celsiusToFahrenheit").converter(10), expectedResult);
    }

    @Test
    public void fahrenheitToCelsiusTest() {
        double expectedResult = 10.0;
        assertEquals(converter.converterType("fahrenheitToCelsius").converter(50), expectedResult);
    }

    @Test
    public void celsiusToKelvinTest() {
        double expectedResult = 283.16;
        assertEquals(converter.converterType("celsiusToKelvin").converter(10), expectedResult);
    }

    @Test
    public void metersToInchesTest() {
        double expectedResult = 196.85;
        assertEquals(converter.converterType("metersToInches").converter(5), expectedResult);

    }

    @Test
    public void inchesToMetersTest() {
        double expectedResult = 1.27000254000508;
        assertEquals(converter.converterType("inchesToMeters").converter(50), expectedResult);
    }

    @Test
    public void milesToKilometresTest() {
        double expectedResult = 16.09;
        assertEquals(converter.converterType("milesToKilometres").converter(10), expectedResult);
    }

    @Test
    public void kilometresToMilesTest() {
        double expectedResult = 6.215040397762586;
        assertEquals(converter.converterType("kilometresToMiles").converter(10), expectedResult);
    }

    @Test
    public void kilogramsToPoundsTest() {
        double expectedResult = 22.0462;
        assertEquals(converter.converterType("kilogramsToPounds").converter(10), expectedResult);
    }

    @Test
    public void poundsToKilogramsTest() {
        double expectedResult = 11.339822735890994;
        assertEquals(converter.converterType("poundsToKilograms").converter(25), expectedResult);
    }

    @Test
    public void speedKmToMiTest() {
        double expectedResult = 6.2139999999999995;
        assertEquals(converter.converterType("speedKmToMi").converter(10), expectedResult);
    }

    @Test
    public void speedMiToKmTest() {
        double expectedResult = 16.0926939169617;
        assertEquals(converter.converterType("speedMiToKm").converter(10), expectedResult);
    }

}
