package com.hillel.lecture_12;

import com.hillel.lecture_12.conveters.Converter;

public interface Type {
    public Converter converterOperation(String operation) throws ConverterException;

}
