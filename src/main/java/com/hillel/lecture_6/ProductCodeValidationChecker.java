package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

//        TODO implements result
        boolean isValid = false;
        char[] checkValid = code.toCharArray();
        for (char s : checkValid) {
            if (Character.isLowerCase(s)) {
                return false;
            }
            String[] str = code.split(" ");
            String toDig = str[0];
            int target = Integer.parseInt(str[1]);
            String digits = toDig.replaceAll("\\D+", "");
            int[] ints = new int[digits.length() / 2];
            for (int i = 0; i < digits.length(); i += 2) {
                ints[i / 2] = Integer.parseInt(digits.substring(i, i + 2));
            }
            int result = 1;
            for (int num : ints) {
                result *= num;
            }
            System.out.println(result);
            isValid = result == target;
        }
            return isValid;
        }
    }

