package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountLettersFrequenciesChecker {


    @Step
    public String countLettersFrequencies(String text, char letter) {
           char[]str = text.toCharArray();
           String result = "";
           int count = 0;
//        TODO implements result
        for (char i :str) {
            if(i==letter){
            count++;
            }
        }
        result = "Character '"+letter+"' repeated "+count+" times";
        return result;
    }
}
