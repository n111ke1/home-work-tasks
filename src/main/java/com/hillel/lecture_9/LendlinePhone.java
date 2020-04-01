package com.hillel.lecture_9;


public class LendlinePhone extends Phone {

    private String phoneNumber;

    public String setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }

    public String callOnNumber(){
        return "You call on " +this.phoneNumber;
    }

    @Override
    public String down() {
       return "You finish your talk on Lendline Phone";
    }
}
