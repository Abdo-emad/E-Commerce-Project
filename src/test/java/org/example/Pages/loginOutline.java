package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginOutline {
    public WebElement facebook_link(){
       WebElement face_link = Hooks.driver.findElement(By.linkText("Facebook"));
       return face_link;
    }
    public WebElement user_name(){
        WebElement username = Hooks.driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/div[1]/label/input"));
        return username;
    }
    public WebElement user_password(){
        WebElement password = Hooks.driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/div[2]/label/input"));
        return password;
    }
    public WebElement error_msg(){
        WebElement actual_msg = Hooks.driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]/text()"));
        return actual_msg;
    }

}
