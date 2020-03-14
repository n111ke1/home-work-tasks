package com.hillel.lecture_4;

import io.qameta.allure.Step;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {

//        TODO implements result
        int result = 0;
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(value%2);
            value = value/2;
        }
        while ( value != 0);
            result = Integer.parseInt((sb.reverse().toString()));
        return result;
    }

    @Step
    public int fromBinaryToDecimal(int value) {

//        TODO implements result
        int result = 0;
        String str = String.valueOf(value);
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i)== '1'){
                result += pow(2,str.length()-1-i);
            }
        }
        return result;
    }
}
