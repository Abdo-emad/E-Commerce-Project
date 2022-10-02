package org.example.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.loginOutline;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class outlinelogin {
    loginOutline homePage = new loginOutline();

@Given("user navigates to Facebook")
public void navigate_to_facebook(){
 homePage.facebook_link().click();

}

    @When("^I enter Username as \"(.*)\" and Password as \"(.*)\"$")
    public void enter_data(String username,String password){
    homePage.user_name().sendKeys(username);
    homePage.user_password().sendKeys(password);
    homePage.user_password().sendKeys(Keys.ENTER);

    }


    @Then("login should be unsuccessful")
    public void failed_login(){
     String expected_msg="The email address or mobile number you entered isn't connected to an account";
     String ac_msg = homePage.error_msg().getText();
        Assert.assertTrue(ac_msg.contains(expected_msg));

    }


}
