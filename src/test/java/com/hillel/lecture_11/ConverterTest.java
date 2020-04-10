//package com.hillel.lecture_11;
//
//import org.testng.annotations.Test;
//
//import static org.testng.Assert.assertEquals;
//
///**
// * Created by alpa on 10/17/19
// */
//public class ConverterTest {
//
//
//    private ConverterType converter = new ConverterType();
//
//    @Test
//    public void celsiusToFahrenheitTest() {
//        double expectedResult = 50.0;
//        converter.converterType("celsiusToFahrenheit");
//        assertEquals(converter.converter(10), expectedResult);
//    }
//
//    @Test
//    public void fahrenheitToCelsiusTest() {
//        double expectedResult = 10.0;
//        converter.setConvertType("fahrenheitToCelsius");
//        assertEquals(converter.converter(50), expectedResult);
//    }
//
//    @Test
//    public void celsiusToKelvinTest() {
//        double expectedResult = 283.16;
//        converter.setConvertType("celsiusToKelvin");
//        assertEquals(converter.converter(10), expectedResult);
//    }
//
//    @Test
//    public void metersToInchesTest() {
//        double expectedResult = 196.85;
//        converter.setConvertType("metersToInches");
//        assertEquals(converter.converter(5), expectedResult);
//
//    }
//
//    @Test
//    public void inchesToMetersTest() {
//        double expectedResult = 1.27000254000508;
//        converter.setConvertType("inchesToMeters");
//        assertEquals(converter.converter(50), expectedResult);
//    }
//
//    @Test
//    public void milesToKilometresTest() {
//        double expectedResult = 16.09;
//        converter.setConvertType("milesToKilometres");
//        assertEquals(converter.converter(10), expectedResult);
//    }
//
//    @Test
//    public void kilometresToMilesTest() {
//        double expectedResult = 6.215040397762586;
//        converter.setConvertType("kilometresToMiles");
//        assertEquals(converter.converter(10), expectedResult);
//    }
//
//    @Test
//    public void kilogramsToPoundsTest() {
//        double expectedResult = 22.0462;
//        converter.setConvertType("kilogramsToPounds");
//        assertEquals(converter.converter(10), expectedResult);
//    }
//
//    @Test
//    public void poundsToKilogramsTest() {
//        double expectedResult = 11.339822735890994;
//        converter.setConvertType("poundsToKilograms");
//        assertEquals(converter.converter(25), expectedResult);
//    }
//
//    @Test
//    public void speedKmToMiTest() {
//        double expectedResult = 6.2139999999999995;
//        converter.setConvertType("speedKmToMi");
//        assertEquals(converter.converter(10), expectedResult);
//    }
//
//    @Test
//    public void speedMiToKmTest() {
//        double expectedResult = 16.0926939169617;
//        converter.setConvertType("speedMiToKm");
//        assertEquals(converter.converter(10), expectedResult);
//    }
//
//}
