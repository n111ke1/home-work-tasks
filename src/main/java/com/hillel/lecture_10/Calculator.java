package com.hillel.lecture_10;

abstract class Calculator {
    private int number1;
    private int number2;
    private int percentage;

    public int getPercentage() {
        return percentage;
    }

    public int setPercentage(int percentage) {
        this.percentage = percentage;
        return percentage;
    }

    public int setInteger1(int number1) {
        this.number1 = number1;
        return number1;
    }

    public double setInteger1(double number1) {
        this.number1 = (int) number1;
        return number1;
    }

    public int setInteger2(int number2) {
        this.number2 = number2;
        return number2;
    }


    public int add(){
        return this.number1 + this.number2;
    }

    public int sabtraction(){
        return this.number1 - this.number2;
    }


    public int multiplay(){
        return this.number1 * this.number2;
    }


    public double division(){
        return this.number1 / this.number2;
    }


    abstract String getResult(Object object);
}
