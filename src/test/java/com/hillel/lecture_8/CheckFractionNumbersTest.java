package com.hillel.lecture_8;

import org.apache.commons.lang3.math.Fraction;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CheckFractionNumbersTest {


    @Test(dataProvider = "intProvider")
    public void plusTest(int numenator, int denamenator , int result){
    FractionNumbers fractionNumbers = new FractionNumbers(numenator, denamenator);
        assertEquals(fractionNumbers.plus(),result);
    }

//    @Test(dataProvider = "fractionProvider")
//    public void plusFractionTest(int numenator, int denamenator , Fraction fraction){
//        FractionNumbers fractionNumbers = new FractionNumbers(numenator, denamenator);
//        fractionNumbers.add(fraction );
////        assertEquals(fractionNumbers.plusFraction(fraction),res);
//    }




    @Test(dataProvider = "intProviderForMinus")
    public void minusTest(int numenator, int denamenator , int result){
        FractionNumbers fractionNumbers = new FractionNumbers(numenator, denamenator);
        assertEquals(fractionNumbers.minus(),result);
    }

    @Test(dataProvider = "intProviderForMultiPlay")
    public void multiPlayTest(int numenator, int denamenator , int result){
        FractionNumbers fractionNumbers = new FractionNumbers(numenator, denamenator);
        assertEquals(fractionNumbers.multiplay(),result);
    }

    @Test(dataProvider = "intProviderForDivide")
    public void divideTest(int numenator, int denamenator , double result){
        FractionNumbers fractionNumbers = new FractionNumbers(numenator, denamenator);
        assertEquals(fractionNumbers.divide(),result);
    }

    @Test
    public void getAnotherNumerator() {
        FractionNumbers fractionNumbers = new FractionNumbers(3, 2);
        fractionNumbers.setNumerator(5);
        assertEquals(fractionNumbers.getNumerator(), 5);
        assertEquals(fractionNumbers.getDenominator(), 2);
    }

    @Test
    public void getAnotherDenumerator() {
        FractionNumbers fractionNumbers = new FractionNumbers(3, 2);
        fractionNumbers.setDenominator(5);
        assertEquals(fractionNumbers.getNumerator(), 3);
        assertEquals(fractionNumbers.getDenominator(), 5);
    }

    @Test
    public void getOutput() {
        FractionNumbers fractionNumbers = new FractionNumbers(1, 2);
        fractionNumbers.toString().equals( "Fraction is: " + fractionNumbers.getNumerator() + "/"
                +fractionNumbers.getDenominator());
    }






    @DataProvider(name = "intProvider")
    public static Object[][] intProvider() {
        return new Object[][]{
                {3,4,7},
                {1,2,3},
                {0,4,4},
                {2,0,2},
        };
    }

    @DataProvider(name = "intProviderForMinus")
    public static Object[][] intProviderForMinus() {
        return new Object[][]{
                {3,4,-1},
                {5,2,3},
                {0,4,-4},
                {2,0,2},
        };
    }

    @DataProvider(name = "intProviderForMultiPlay")
    public static Object[][] intProviderForMultiPlay() {
        return new Object[][]{
                {3,4,12},
                {5,2,10},
                {0,4,0},
                {2,0,0},
        };
    }

    @DataProvider(name = "intProviderForDivide")
    public static Object[][] intProviderForDivide() {
        return new Object[][]{
                {3,4, 0.75},
                {4,2, 2.0},
                {0,4, 0.0},
                {2,0, Double.NaN},
        };
    }


}
