package com.hillel.lecture_9;

import io.qameta.allure.Step;

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
