package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {

//        TODO implements result
        int result = 0;
        String[] sen = sentence.replaceAll("[^a-zA-Z ]", "").split(" ");
        for (String i :sen) {
            if(i.length() == wordLength){
            result++;
            }
        }
        return result;
    }
}



