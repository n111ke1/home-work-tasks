package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    @Step
    public int[] fromMinToMax(int[] values) {

//        TODO implements result
        int[] result = new int[0];
        int indexMin = 0;
        int valueMin = 0;
        for (int i = 0; i < values.length ; i++) {
             valueMin = values[i];
             indexMin = i;
            for (int j = i+1; j < values.length; j++) {
                if(values[j] < valueMin){
                    indexMin = j;
                    valueMin = values[j];
                }
            }
            if(values[i] != values[indexMin]) {
                values[indexMin] = values[i];
                values[i] = valueMin;
            }
        }
        for (int i:values) {
        System.out.println(i);
        }
        result=values;
        return result;
    }

    @Step
    public int[] fromMaxToMin(int[] values) {

//        TODO implements result
        int[] result = new int[0];

        int indexMax = 0;
        int valueMax = 0;
        for (int i = 0; i < values.length ; i++) {
            valueMax = values[i];
            indexMax = i;
            for (int j = i+1; j < values.length; j++) {
                if(values[j] > valueMax){
                    indexMax = j;
                    valueMax = values[j];
                }
            }
            if(values[i] != values[indexMax]) {
                values[indexMax] = values[i];
                values[i] = valueMax;
            }
        }
        for (int i:values) {
            System.out.println(i);
        }
        result=values;

        return result;
    }
}
