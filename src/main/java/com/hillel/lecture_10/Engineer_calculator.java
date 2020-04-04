package com.hillel.lecture_10;

public class Engineer_calculator extends Calculator {

    @Override
    String getResult(Object object) {
        return "Result in EngineerCalculator equal: " + object;
    }

    public String getCos(double number){
       double num = setInteger1(number);
        return String.valueOf(Math.cos(num));
    }

    public String getSin(double number){
        double num = setInteger1(number);
        return String.valueOf(Math.sin(num));
    }

    public String getSqrt(double number){
        double num = setInteger1(number);
        return String.valueOf(Math.sqrt(num));
    }



}
