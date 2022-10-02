package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_homePage {
    public WebElement search_field(){
       WebElement search_link = Hooks.driver.findElement(By.name("q"));
       return search_link ;
    }
    public List <WebElement> getData(){
       List<WebElement> sameText=  Hooks.driver.findElements(By.className("item-box"));
       return sameText ;
    }
    public WebElement verify_serial(){
      WebElement title=  Hooks.driver.findElement(By.className("product-title"));
        title.click();
      WebElement value=  Hooks.driver.findElement(By.className("value"));
      return  value;

    }





//    public WebElement send(String key){
//        WebElement send_data = Hooks.driver.findElement(By.name("q"));
//        return send_data ;
//    }

}
