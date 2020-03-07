package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class NumberInWordChecker {

    @Step
    public String getNumberIfElse(int number) {
        //        TODO implements result
        String result = "";
        if(number == 1){
            result = "ONE";
        }
        if(number == 2){
            result = "TWO";
        }
        if(number == 3){
            result = "THREE";
        }
        if(number == 4){
            result = "FOUR";
        }
        if(number == 5){
            result = "FIVE";
        }
        if(number == 6){
            result = "SIX";
        }
        if(number == 7){
            result = "SEVEN";
        }
        if(number == 8){
            result = "EIGHT";
        }
        if(number == 9){
            result = "NINE";
        }
        if(number > 9){
            result = "OTHER";
        }
        return result;
    }

    @Step
    public String getNumberSwitchCase(int number) {
        //        TODO implements result
        String result = "";
        switch (number){
            case 1:
                result = "ONE";
                break;
            case 2:
                result = "TWO";
                break;
            case 3:
                result = "THREE";
                break;
            case 4:
                result = "FOUR";
                break;
            case 5:
                result = "FIVE";
                break;
            case 6:
                result = "SIX";
                break;
            case 7:
                result = "SEVEN";
                break;
            case 8:
                result = "EIGHT";
                break;
            case 9:
                result = "NINE";
                break;
          default:
              result = "OTHER";
        }

        return result;
    }
}
