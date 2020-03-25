package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {

//        TODO implements result
        String result = "";
        result = word.toUpperCase();
        return result;
    }

    @Step
    public String toLowerCase(String word) {

//        TODO implements result
        String result = "";
        result = word.toLowerCase();

        return result;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {

//        TODO implements result
        String result = "";
        if(sentence.contains(".")) {
            String[] s = sentence.split("\\. ");
            for (String i : s) {
                System.out.println(i);
                result += i.substring(0, 1).toUpperCase() + i.substring(1)+ ". ";
            }
            result = result.substring(0,result.length()-2);
        }else
        result = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);

        return result;
        }




    @Step
    public String eachLetterToUpperCase(String sentence) {

//        TODO implements result
        String result = "";
        String[] str = sentence.split(" ");
        for (String i : str) {
            result += i.substring(0,1).toUpperCase() + i.substring(1) + " ";
        }
        result = result.trim();
        return result;
    }
}
