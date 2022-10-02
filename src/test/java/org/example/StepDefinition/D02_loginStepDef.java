package org.example.StepDefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_login;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_login login = new P02_login();
    SoftAssert soft = new SoftAssert();


    @Given("user go to login page")
    public void go_to_login_page(){
        login.login_link().click();

    }

    @When("^user login with \"(.*)\" \"(.*)\" and \"(.*)\"$")
    public void valid_login(String type,String email , String password){
     login.enter_email(type).sendKeys(email);
     login.enter_password().sendKeys(password);
     login.remember().click();
    }

    @And("user press on login button")
    public void press_login_button(){
        //login.login_btn().click();
        login.enter_password().sendKeys(Keys.ENTER);
    }

    @Then("user login to the system successfully")
    public void success_login(){
        String expectedUrl= "https://demo.nopcommerce.com/";
       String url=  login.getUrl();
       soft.assertTrue(url.contains(expectedUrl));
        soft.assertTrue(login.is_display().isDisplayed());
        soft.assertAll();


    }
    @Then("user could not login to the system")
    public void failed_login(){
        String error_expected = "Login was unsuccessful.";
        String actual_failed_message=login.failed_message().getText();
        soft.assertTrue(actual_failed_message.contains(error_expected));
        String color_msg = login.failed_message_color().getCssValue("color");
        String expected_color = "red";
        //String color = Color.fromString("rgba(252, 186, 3,1)").asHex();
        soft.assertTrue(color_msg.contains(expected_color));
       // soft.assertAll();

    }
}
