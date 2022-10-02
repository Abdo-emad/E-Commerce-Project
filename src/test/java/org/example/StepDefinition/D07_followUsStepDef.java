package org.example.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P07_homePage;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class D07_followUsStepDef {
P07_homePage homePage = new P07_homePage();

    @Given("user opens facebook link")
    public void user_opens_facebook_link(){
     homePage.open_facebook().click();

    }

    @Given("user opens twitter link")
    public void userOpensTwitterLink() {
     homePage.open_twitter().click();

    }

    @Given("user opens rss link")
    public void userOpensRssLink() {
     homePage.open_rss().click();
    }

    @Given("user opens youtube link")
    public void userOpensYoutubeLink() {
      homePage.open_youtube().click();
    }


    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String window) {
         ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
         Hooks.driver.switchTo().window(tabs.get(1));
         Assert.assertTrue(Hooks.driver.getCurrentUrl().contains(window));

    }
}
