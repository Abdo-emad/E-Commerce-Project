package org.example.StepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P03_homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage curr_homepage = new P03_homePage();

    @Given("user click on currencies select")
    public void go_to_website_page() {
      curr_homepage.select_euro().selectByIndex(1);

    }


    @Then("verify Euro Symbol")
    public void verify_euro(){
        String e =null;
        for (int i = 0; i < 4; i++) {
            List<WebElement> elements =  curr_homepage.verify_text();
           e = elements.get(i).getText();
        }
        String expected = "€";
        Assert.assertTrue(e.contains(expected));
    }
}
