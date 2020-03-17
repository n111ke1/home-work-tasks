package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

//        TODO implements result
        String result = getString(value);
        return result;
    }

    public static String getString(String normalString) {
        char[] str = normalString.toCharArray();
        String reverString = "";
        for (int i = str.length - 1; i >= 0; i--) {
           reverString += String.valueOf(normalString.charAt(i));
        }
        return reverString;
    }
}




