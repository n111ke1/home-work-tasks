package com.hillel.lecture_9;

import io.qameta.allure.Step;

import java.util.Objects;

public class Phone {

    private String type;
    private String os;
    private String provider;

    public String setType(String type) {
        this.type = type;
        return type;
    }


    @Step
    public String call(){
        return "Your phone is call'ing";
    }

    @Step
    public String call(String type) {
        return "You calling on " +this.type+ " phone" ;
    }
    @Step
    public String down(){

        return "You finished your talk";
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(type, phone.type) &&
                Objects.equals(os, phone.os) &&
                Objects.equals(provider, phone.provider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, os, provider);
    }

    @Step
    public String nameOfYourProvider(String type){
       switch (type){
           case "lendlinePhone":
               return "you have Lendline provider";
           case "cellPhone":
               return "you have Mobile provider";
           default:
               return "we dont have provider fpr your phone";

       }



    }
}
