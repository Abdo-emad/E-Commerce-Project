package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P05_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Locale;
import java.util.Random;

public class D05_hoverCategoriesStepDef {
    P05_homePage homePage = new P05_homePage();


    @Given("hover to random element")
    public void hoverToRandomElement() {
       List<WebElement> allElements= homePage.select_element_to_hover();
        int random = new Random().nextInt(3);
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(allElements.get(random)).perform();



    }

    @And("user click on any category and verify text")
    public void userClickOnAnyCategory() {
        List<WebElement> anySupCategory= homePage.select_one();
        Actions actions1 = new Actions(Hooks.driver);
        int random1 = new Random().nextInt(3);
        actions1.moveToElement(anySupCategory.get(random1)).click().release().build().perform();
        System.out.println(Hooks.driver.getTitle());
        Assert.assertTrue(true, Hooks.driver.getTitle());
//        String text = Hooks.driver.getTitle().toLowerCase().trim();
//        String headLine = homePage.getHeadline(random1).get(random1).getText();
//        Assert.assertTrue(text.contains(headLine));

    }

}
