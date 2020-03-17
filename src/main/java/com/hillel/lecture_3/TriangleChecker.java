package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class TriangleChecker {

    @Step
    public String isTriangleIsosceles(int a, int b, int c) {

//        TODO implements result
        return getResult(a,b,c);
    }
    public static String getResult(int a, int b, int c){
        String result = "";
        if(a == b || a == c || b==c){
            result="Isosceles triangle!";
        }else {
            result="No isosceles triangle!";
        }

        return result;
    }
}
