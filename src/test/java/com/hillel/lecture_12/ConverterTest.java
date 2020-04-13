package com.hillel.lecture_12;

import org.testng.annotations.Test;

public class ConverterTest {


    @Test
    public void speedTest() {
    TypesFactory typesFactory = new TypesFactory();
    typesFactory.createConverterTypes(ConverterType.SPEED);

}


    @Test
    public void negativeValueTest(){

    }


}


