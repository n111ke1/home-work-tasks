package com.hillel.lecture_10;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void simpleCalculatorTest(){
        Simple_calculator sc = new Simple_calculator();
        sc.setInteger1(1);
        sc.setInteger2(2);
        Assert.assertEquals(sc.getResult(sc.add()),"Result in SimpleCalculator equal: " +sc.add());
        Assert.assertEquals(sc.getResult(sc.sabtraction()), "Result in SimpleCalculator equal: " +sc.sabtraction());
        Assert.assertEquals(sc.getResult(sc.multiplay()),"Result in SimpleCalculator equal: " +sc.multiplay());
        Assert.assertEquals(sc.getResult(sc.division()),"Result in SimpleCalculator equal: " +sc.division());
       Assert.assertEquals(sc.getPercent(100,10),"10 is 10% of 100");
    }

    @Test
    public void engineerCalculatorBasicFunctionTest(){
        EngineerCalculator ec = new EngineerCalculator();
        ec.setInteger1(1);
        ec.setInteger2(3);
        Assert.assertEquals(ec.getResult(ec.add()),"Result in EngineerCalculator equal: " +ec.add());
        Assert.assertEquals(ec.getResult(ec.sabtraction()), "Result in EngineerCalculator equal: " +ec.sabtraction());
        Assert.assertEquals(ec.getResult(ec.multiplay()),"Result in EngineerCalculator equal: " +ec.multiplay());
        Assert.assertEquals(ec.getResult(ec.division()),"Result in EngineerCalculator equal: " +ec.division());

    }
    @Test(dataProvider = "number")
    public void engineerCalculatorSpecialFunctionTest(double number, double res) {
        EngineerCalculator ec = new EngineerCalculator();
        Assert.assertEquals(ec.getResult(ec.cos(number)), "Result in EngineerCalculator equal: " +ec.cos(number));
        Assert.assertEquals(ec.getResult(ec.sin(30)), "Result in EngineerCalculator equal: " +ec.sin(30) );
        Assert.assertEquals(ec.getResult(ec.sqrt(number)), "Result in EngineerCalculator equal: " +res);
    }


    @DataProvider(name = "number")
    public static Object[][] number() {
        return new Object[][]{
                {0.25, 0.5},
                {9, 3},
                {400, 20},

        };
    }


}
