package com.hillel.lecture_12;

import com.hillel.lecture_12.conveters.Converter;
import com.hillel.lecture_12.conveters.ConverterCalculationException;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.hillel.lecture_12.ConverterSpeedFactory.SPEED_KM_TO_MI;
import static com.hillel.lecture_12.ConverterSpeedFactory.SPEED_MI_TO_KM;

public class ConverterTest {

    @Test
    public void speedTest() throws ConverterException, ConverterCalculationException {
    TypesFactory typesSpeed = new TypesFactory(ConverterType.SPEED);
        Assert.assertEquals(typesSpeed.createConverterTypes().converterOperation(SPEED_KM_TO_MI).converterValue(10d), 6.2139999999999995);
        Assert.assertEquals(typesSpeed.createConverterTypes().converterOperation(SPEED_MI_TO_KM).converterValue(50d), 80.46346958480851);
}

    /**Exeception Tests**/
    @Test(expectedExceptions = ConverterCalculationException.class )
    public void negativeValueTest() throws ConverterException, ConverterCalculationException {
        TypesFactory typesSpeed = new TypesFactory(ConverterType.SPEED);
        Assert.assertEquals(typesSpeed.createConverterTypes().converterOperation(SPEED_KM_TO_MI).converterValue(-4d),6.2139999999999995);
    }

    @Test(expectedExceptions = ConverterException.class)
    public void notValidOperationNameTest() throws ConverterException, ConverterCalculationException {
        TypesFactory typesSpeed = new TypesFactory(ConverterType.SPEED);
        Assert.assertEquals(typesSpeed.createConverterTypes().converterOperation("notValidName").converterValue(4d), 6.2139999999999995);
    }


}


