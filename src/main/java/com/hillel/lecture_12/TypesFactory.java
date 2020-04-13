package com.hillel.lecture_12;

public class TypesFactory  {
        ConverterType converterType;

    public TypesFactory(ConverterType converterType) {
        this.converterType = converterType;
    }

    public Type createConverterTypes(){
        switch (this.converterType){
            case SPEED:
               return new ConverterSpeedFactory();
            case WEIGHT:
               return new ConverterWeightFactory();
            case DISTANCE:
               return new ConverterDistanceFactory();
            case TEMPERATURE:
               return new ConverterTemparatureFactory();
        }
        return null;
    }
}
