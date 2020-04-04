package com.hillel.lecture_10;

public class Simple_calculator extends Calculator {

    public String getPercent(int number, int percentage){
        int n = setInteger1(number);
        int p = setPercentage(percentage);
        int k = (int) ((n * p) /100.0d);
        return k + " is " + p + "%" +" of "+ n;
}

    @Override
    String getResult(Object object) {
        return "Result in SimpleCalculator equal: " + object;
    }
}