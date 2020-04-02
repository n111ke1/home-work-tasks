package com.hillel.lecture_9;

import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PhoneTest {
  LendlinePhone lendlinePhone = new LendlinePhone();
  CellPhone cellPhone = new CellPhone();


  @Test
    public void checkCallOnLendlinePhone(){
      Assert.assertEquals(lendlinePhone.call(lendlinePhone.call(lendlinePhone.setType("lendline"))),
              "You calling on lendline phone");
  }
  @Test
  public void checkWhichNumberYouCall(){
      String phoneNumber = lendlinePhone.setPhoneNumber("0931212321");
      Assert.assertEquals(lendlinePhone.callOnNumber(),"You call on " +phoneNumber);
  }

    @Test
    public void checkCallOnCellPhone(){
        Assert.assertEquals(cellPhone.call(cellPhone.call(cellPhone.setType("cell"))),"You calling on cell phone");
    }

    @Test
    public void lendlinePhoneDown(){
      Assert.assertTrue(lendlinePhone.down().contains("Lendline"));

    }

    @Test
    public void cellPhoneDown(){
        Assert.assertTrue(cellPhone.down().contains("mobile"));
    }

    @Test(dataProvider = "phoneModel")
    public void checkOsOnPhone(String model,String os){
        Assert.assertEquals(cellPhone.choseOS(cellPhone.setModel(model)),os);
    }

    @Test
    public void sendMessageChecker(){
    Assert.assertEquals(cellPhone.sendMessage(cellPhone.setTextMessage("some text")),"Your message has been sent");
    }

    @Test(dataProvider = "phoneType")
    public void checkProviderForPhone(String type, String res){
      Phone phone = new Phone();
      Assert.assertEquals(phone.nameOfYourProvider(phone.setType(type)),res);
    }

    @Test
    public void checkMessageWhenCellPhoneCalling(){
      Assert.assertEquals(cellPhone.call(),"Your phone is call'ing");

    }

  @Test
  public void checkObjects(){
    lendlinePhone.equals(cellPhone);
  }

  @Test
  public void checkHash(){
    Assert.assertTrue(lendlinePhone.hashCode() == cellPhone.hashCode());
  }


    @DataProvider(name = "phoneType")
    public static Object[][] phoneType() {
        return new Object[][]{
                {"lendlinePhone","you have Lendline provider"},
                {"cellPhone","you have Mobile provider"},
                {"radioPhone","we dont have provider fpr your phone"},
        };
    }

    @DataProvider(name = "phoneModel")
    public static Object[][] phoneModel() {
        return new Object[][]{
                {"iphone","ios"},
                {"samsung","android"},
                {"xaomi","We don't know this model"},
        };
    }

}
