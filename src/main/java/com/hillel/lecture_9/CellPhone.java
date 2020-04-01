package com.hillel.lecture_9;

import io.qameta.allure.Step;


public class CellPhone extends Phone {

 private String textMessage;
 private String model;

 @Step
 public String setTextMessage(String textMessage) {
  this.textMessage = textMessage;
  return textMessage;
 }
 @Step
 public String setModel(String model) {
  this.model = model;
  return model;
 }

@Step
 public String sendMessage(String textMessage){
  if(!this.textMessage.isEmpty()){
  return "Your message has been sent";
 }else{
   return "Your message is empty";
  }

 }

@Step
 public String choseOS(String model){
if(model.equalsIgnoreCase("iphone")||model.equalsIgnoreCase("samsung")){
  switch (this.model){
   case "iphone":
    return "ios";
   case "samsung":
    return "android";
   default:
   return  "your phone is sheet";
  }
}else{
  return "We don't know this model";
 }
  }


 @Override
 public String down() {
  return "Your finished your talk on mobile phone";
 }



}




