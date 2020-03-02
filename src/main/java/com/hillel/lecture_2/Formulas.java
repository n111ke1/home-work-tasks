package com.hillel.lecture_2;

import io.qameta.allure.Step;

import static java.lang.Math.*;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    @Step
    public double calculate9Formula(double x) {
        double pi = 3.1415;
        double result = pow(exp(1.1), -x) + abs(cos(sqrt(pi * x))) - 3/8;
//        TODO implement formula 9
        return result;
    }

    @Step
    public double calculate10Formula(double x) {
        double result = 0.0;
//        TODO implement formula 10
        return result;
    }

    @Step
    public double calculate11Formula(double x) {
        double result = 0.0;
//        TODO implement formula 11
        return result;
    }

    @Step
    public double calculate12Formula(double x) {
        double result = 0.0;
//        TODO implement formula 12
        return result;
    }

    @Step
    public double calculate13Formula(double x) {
        double result = 0.0;
//        TODO implement formula 13
        return result;
    }
}
