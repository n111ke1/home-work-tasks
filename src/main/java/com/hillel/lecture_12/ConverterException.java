package com.hillel.lecture_12;

public class ConverterException extends Exception{
    private String operation;
    public String getOperation() {
        return operation;
    }
    public ConverterException(String operation) {
        super("This operation doesn't valid");
    }

}
