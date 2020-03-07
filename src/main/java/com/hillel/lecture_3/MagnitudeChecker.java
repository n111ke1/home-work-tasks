package com.hillel.lecture_3;

import io.qameta.allure.Step;

import static java.lang.Math.abs;

/**
 * Created by alpa on 10/22/19
 */
public class MagnitudeChecker {

    @Step
    public String getGreatestNumberByMagnitude(double a, double b) {
//        TODO implements result
        String result = "";
        if(abs(a)>abs(b)){
            result= "The number "+a+" has the greatest magnitude!";
        }
        else if(abs(a)==abs(b)){
            result = "The number "+a+" and "+b+" are equals by magnitude!";
        }
        else {
            result = "The number "+b+" has the greatest magnitude!";
        }

        return result;
    }
}
