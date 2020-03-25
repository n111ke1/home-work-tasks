package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {

    @Step
    public String applySquareWordPattern(String word) {

        String result = "";
//        TODO implements result
        for (int i = 0; i < word.length() ; i++) {
        String str = "";
        str = word.substring(i) + word.substring(0,i) +", ";
        if(i==word.length()-1){
            str = word.substring(i) + word.substring(0,i);
        }
        result += str;
        }

        return result;
    }


}
