package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DiscountCountChecker {

    @Step
    public double checkDiscountCount(double price) {

//        TODO implements result
        double result = 0.0;
        double discPrice = 1000d;
        if(price > discPrice){
            result = price-(price*0.15);
        }
        else{
            System.out.println("You don't have discount");
        }
        return result;
    }
}
