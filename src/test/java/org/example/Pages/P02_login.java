package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement login_link(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement enter_email(String type){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement enter_password(){
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement remember(){
        return Hooks.driver.findElement(By.id("RememberMe"));
    }
    public WebElement login_btn(){
        return Hooks.driver.findElement(By.xpath("//*[@type='submit']"));
    }
    public String getUrl(){
     return    Hooks.driver.getCurrentUrl();
    }
    public WebElement is_display(){
       return Hooks.driver.findElement(By.className("ico-account"));
    }
    public WebElement failed_message(){
       return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
//        Login was unsuccessful. Please correct the errors and try again.
//                No customer account found

    }
    public WebElement failed_message_color(){
       return Hooks.driver.findElement(By.className("message-error"));
    }

}