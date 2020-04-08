package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class WeightConverter {

    @Step
    public double kilogramsToPounds(double kilograms) {
//        TODO implements result
        double result = kilograms * 2.20462;
        return result;
    }

    @Step
    public double poundsToKilograms(double pounds) {
//        TODO implements result
        return pounds / 2.2046;
    }

}
