package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class MinValueChecker {

    @Step
    public int getValue(int[] values) {

//        TODO implements result
        int result = 0;
        int minValue = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
                result = minValue;
            }
        }

        return result;
    }

}
