package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {

    @Step
    public String fromDecimalToHexadecimal(int value) {

        char res[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        return deciminalToHexadecimal(value, res);
    }


//        TODO implements result

        public static String deciminalToHexadecimal(int value,  char... res) {
            String result = "";
            while (value > 0) {
                result = res[value % 16] + result;
                value = value / 16;
            }
            return result;
        }


    @Step
    public int fromHexadecimalToDecimal(String value) {

//        TODO implements result
        String hstr = "0123456789ABCDEF";
        return hexaToDeciminal(value, hstr);
    }

    public static int hexaToDeciminal(String value, String hstr) {

        int result = 0;
        for (int i = 0; i < value.length(); i++) {
            char val= value.charAt(i);
            int n = hstr.indexOf(val);
            result = 16*result + n;
        }

        return result;
    }
}
