package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class PalindromeChecker {

    @Step
    public boolean isPalindrome(String value) {

//        TODO implements result
        boolean result = false;
        char str[] = value.toCharArray();
        String revStr = "";
        for (int i = str.length - 1; i >= 0; i--) {
                revStr += value.charAt(i);
        result = revStr.equalsIgnoreCase(value);
        }
        return result;
    }

}
