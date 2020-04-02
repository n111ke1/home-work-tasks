package com.hillel.lecture_8;

import io.qameta.allure.Step;
import org.apache.commons.lang3.math.Fraction;

public class FractionNumbers {

    private int numerator;
    private int denominator;

    public FractionNumbers(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Step
    public int getNumerator() {
        return numerator;
    }
    @Step
    public int getDenominator() {
        return denominator;
    }
    @Step
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    @Step
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Step
    public int plus(){
        return numerator + denominator;

    }

//    @Step
//    public Fraction add(Fraction fractionTwo) {
//        int numer = (numerator * fractionTwo.getDenominator()) +
//                (fractionTwo.getNumerator() * denominator);
//        int denr = denominator * fractionTwo.getDenominator();
//        return Fraction.getFraction(numer, denr);
//    }



    @Step
    public int minus(){
        return numerator - denominator;
    }

    @Step
    public int multiplay() {
        return numerator * denominator;
    }
    @Step
    public double divide(){
        double res = 0;
        double num = numerator;
        double den = denominator;
        if(den != 0){
            res =  num / den;
        }else {
            System.out.print("На 0 делить нельзя");
            return Double.NaN;
        }
        return res;
    }

    @Step
    @Override
    public String toString() {
       return "Fraction is: " + String.valueOf(Fraction.getFraction(numerator, denominator));
    }
}
