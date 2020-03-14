package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class FibonacciNumbersChecker {

    @Step
    public int[] getFibonacciNumbers(int number) {

//        TODO implements result
        int[] result = { };
        int[] el = new int[number];
        el[0] = 0;
        el[1] = 1;
        for (int i = 2; i < el.length; i++) {
            el[i] = el[i - 1] + el[i - 2];
            result = el;
        }
        return result;
    }

}
