package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_register;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import static org.example.StepDefinition.Hooks.driver;


public class D01_registerStepDef {
    P01_register register = new P01_register();
    SoftAssert softAssert = new SoftAssert();


    @Given("user go to register page")
    public void goRegisterPage()
    {
    register.register_Link().click();

    }

    @When("user select gender type")
    public void gender_type(){
        register.setMale().click();
    }
    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void enter_name(String fname,String lname){
        register.fName().sendKeys(fname);
        register.lName().sendKeys(lname);
    }
    @And("user enter date of birth")
    public void enter_date(){
        register.Day("21");
        register.Month("4");
        register.Year("2000");
    }
   @And("^user enter email \"(.*)\" field$")
   public void enter_email(String email){
        register.Email().sendKeys(email);
   }
   @And("^user fills Password fields \"(.*)\" \"(.*)\"$")
   public void enter_password(String pass,String pass1){
        register.Password().sendKeys(pass);
        register.ConfirmPassword().sendKeys(pass1);
   }
   @And("user clicks on register button")
   public void click_register_button(){
        register.registerButton().click();
   }
   @Then("success message is displayed")
   public void success_message(){
        String expectedMessage = "Your registration completed";
        String actualMessage = "Your registration completed";
        String color =register.getMessageColor().getCssValue("color");
        String expectedColor= "green";
        softAssert.assertTrue(actualMessage.contains(expectedMessage));
        softAssert.assertTrue(color.contains(expectedColor));

   }


}

//    @Then("user enter data and create an account")
//    public void EnterDataToRegister(){
//        register.setMale().click();
//        register.fName().sendKeys("hi");
//        register.lName().sendKeys("hello");
//        register.Day("21");
//    }