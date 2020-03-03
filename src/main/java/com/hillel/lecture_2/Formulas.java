package com.hillel.lecture_2;

import io.qameta.allure.Step;

import static java.lang.Math.*;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    @Step
    public double calculate9Formula(double x) {
        double a = 3;
        double b = 8;
        double result = 1.1*pow(E, -x)+abs(cos(sqrt(PI*x)))-a/b;
//        TODO implement formula 9
        return result;
    }

    @Step
    public double calculate10Formula(double x) {
        double a = 1;
        double b = 3;
        double result = a/b * sqrt(abs(sin(x))) * cbrt(pow(E, 0.12 * x));
//        TODO implement formula 10
        return result;
    }

    @Step
    public double calculate11Formula(double x) {
        double a = 2;
        double b = 1;
        double c = 7;
        double result = a * PI * x - abs(sin(sqrt(10.5 * x))) * b / (cbrt(pow(x,a)) + b/c);
//        TODO implement formula 11
        return result;
    }

    @Step
    public double calculate12Formula(double x) {
        double a = 1;
        double b = 2;
        double result = log(sqrt(abs(b - x))+1.2)*a/(b + pow(E, -x)) + cbrt(b/x);
//        TODO implement formula 12
        return result;
    }

    @Step
    public double calculate13Formula(double x) {
        double a = 5;
        double b = 2;
        double c = 4;
        double d = 1;
        double result = pow(pow(E,-b+x), d/a)*d/sqrt((pow(x,b) +pow(x,c) + log(abs(x - 3.14))));
//        TODO implement formula 13
        return result;
    }
}
