package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

//        TODO implements result
        String result = "";
        StringBuilder sb = new StringBuilder();
        char[]str = value.toCharArray();
        for (int i = str.length -1; i >= 0 ; i--) {
            result = String.valueOf(sb.append(value.charAt(i)));
        }
        return result;
    }

}
