package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_homePage {
    public Select select_euro() {
        Select s1 = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        return s1;
    }

public List<WebElement> verify_text() {
    List<WebElement> elements = Hooks.driver.findElements(By.className("price"));
 return elements;
}
}
