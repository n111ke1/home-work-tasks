package com.hillel.lecture_10;

public class EngineerCalculator extends Calculator {

    @Override
    String getResult(Object object) {
        return "Result in EngineerCalculator equal: " + object;
    }

    public String cos(double number){
       double num = setInteger1(number);
        return String.valueOf(Math.cos(num));
    }

    public String sin(double number){
        double num = setInteger1(number);
        return String.valueOf(Math.sin(num));
    }

    public String sqrt(double number){
        double num = setInteger1(number);
        return String.valueOf(Math.sqrt(num));
    }



}
