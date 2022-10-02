package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;


public class P05_homePage {


    public List<WebElement> select_element_to_hover() {
List<WebElement> elements = Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
  return  elements;
    }

    public List<WebElement> select_one(){

        List <WebElement> element = Hooks.driver.findElements(By.cssSelector("ul[class=\"sublist first-level\"]>li>a[href]"));

       return element;
    }
    public List<WebElement> getHeadline(int ran){
        int random1 = new Random(3).nextInt();
//    WebElement headline=   Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]")).get(random1);
        List<WebElement> elements = (List<WebElement>) Hooks.driver.findElements(By.cssSelector("ul[class=\"sublist first-level\"]>li>a[href]")).get(random1);
  return elements;


    }
}
