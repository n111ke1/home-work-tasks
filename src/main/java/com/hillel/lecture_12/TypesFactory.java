package com.hillel.lecture_12;

public class TypesFactory {

    public Object createConverterTypes(ConverterType converterType){

        switch (converterType){
            case SPEED:
               return new ConverterSpeedFactory();
            case WEIGHT:
               return new ConverterWeightFactory();
            case DISTANCE:
               return new ConverterDistanceFactory();
            case TEMPERATURE:
               return new ConverterTemparatureFactory();
            default: return  null;
        }


    }
}
