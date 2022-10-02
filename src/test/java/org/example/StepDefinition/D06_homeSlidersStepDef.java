package org.example.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P06_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
P06_homePage homePage = new P06_homePage();
    @Given("user find  slider and user will ask if it is clickable or not")
    public void is_clickable(){
 homePage.find_slider().isEnabled();

    }

    @Then("user will ask if it the same {string}")
    public void userWillAskIfItTheSame(String url) {
        String expected_link=url;
        homePage.slider_click().click();
        String link= Hooks.driver.getCurrentUrl();
        Assert.assertFalse(link.contains(expected_link));

    }


}
