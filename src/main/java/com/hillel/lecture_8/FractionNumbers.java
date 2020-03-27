package com.hillel.lecture_8;

import io.qameta.allure.Step;
import org.apache.commons.lang3.math.Fraction;
public class FractionNumbers {

    private int numerator;
    private int denomenator;

    public FractionNumbers(int numerator, int denomenator){
        this.numerator = numerator;
        this.denomenator = denomenator;
    }

    @Step
    public int getNumerator() {
        return numerator;
    }
    @Step
    public int getDenomenator() {
        return denomenator;
    }
    @Step
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    @Step
    public void setDenomenator(int denomenator) {
        this.denomenator = denomenator;
    }

    @Step
    public int plus(){
        return numerator + denomenator;
    }

    @Step
    public int minus(){
        return numerator - denomenator;
    }

    @Step
    public int multiplay() {
        return numerator * denomenator;
    }
    @Step
    public double divide(){
        double res = 0;
        double num = numerator;
        double den = denomenator;
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
       return "Fraction is: " + String.valueOf(Fraction.getFraction(numerator, denomenator));
    }
}
