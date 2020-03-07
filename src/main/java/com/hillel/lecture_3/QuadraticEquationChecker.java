package com.hillel.lecture_3;

import io.qameta.allure.Step;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = "";
        double d = pow(b,2) - 4*a*c;
        double x1 = (-b + sqrt(d))/(2*a);
        double x2 = (-b - sqrt(d))/(2*a);

        if(d > 0 && a!=0){
            result = "Discriminant: "+d+", x1: "+x1+", x2: "+x2+"";
        }
        else if(a==0){
            result = "The 'a' coefficient should not be zero!";
        }
        else if(d==0){
           if(x1==x2) {
            result = "Two real, identical roots: [x1 && x2] = "+x1+"";
            }
        }
       else if(d<0) {
           result = "No roots on the set of real numbers!";
       }

        return result;
    }

}
