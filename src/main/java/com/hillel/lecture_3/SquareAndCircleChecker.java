package com.hillel.lecture_3;

import io.qameta.allure.Step;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {



    @Step
    public String checkCircleInSquare(double circleArea, double squareArea) {

//        TODO implements result
        return getResult(circleArea, squareArea);
    }

    public static String getResult(double circleArea, double squareArea){
        double back = sqrt(squareArea)/2;
        double radius = sqrt(circleArea/PI);
        String result = "";
         if (radius <= back) {
            result = ("The circle is in the square");
        } else {
                result = ("The circle is not in the square");
            }

        return result;
    }

    @Step
    public String checkSquareInCircle(double circleArea, double squareArea) {

//        TODO implements result
        return getRes(circleArea, squareArea);
    }
    public static String getRes(double circleArea, double squareArea){
        double diag = sqrt(2*squareArea);
        double D = 2*sqrt(circleArea/PI);
        String result = "";
        if (diag <= D) {
            result = ("The square is in the circle");
        } else {
            result = ("The square is not in the circle");
        }
        return result;
    }

}

