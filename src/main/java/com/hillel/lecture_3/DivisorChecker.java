package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DivisorChecker {

    @Step
    public String checkDivisor(int divisor, int number) {
        //        TODO implements result
        return getResult(divisor, number);
    }
    public static String getResult(int divisor, int number){
        String result = "";
        if(divisor%number==0){
            result = "The number "+number+" is divisor of the number "+divisor+"";
        }
        if(divisor%number!=0){
            result = "The number "+number+" is not divisor of the number "+divisor+"";
        }
        return result;
    }
}
