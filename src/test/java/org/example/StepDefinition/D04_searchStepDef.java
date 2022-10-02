package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P04_homePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class D04_searchStepDef {
    P04_homePage homePage = new P04_homePage();
    @Given("user click on search field")
    public void search()
    {
        homePage.search_field().click();
    }

    @And("user search with {string}")
    public void userSearchWith(String text) {
        homePage.search_field().sendKeys(text);
        homePage.search_field().sendKeys(Keys.ENTER);
    }

    @Then("user could find  {string} relative words")
    public void userCouldFindRelativeWords(String word) {
        String text = null;
        for (int i = 0; i < homePage.getData().size(); i++) {
            text = homePage.getData().get(i).getText().toLowerCase();
        }
        Assert.assertTrue(text.contains(word));


    }


    @Then("user could find  {string} inside product detail page")
    public void userCouldFindInsideProductDetailPage(String word1) {

        String serial_value= homePage.verify_serial().getText();
        Assert.assertTrue(word1.contains(serial_value));
    }
}
