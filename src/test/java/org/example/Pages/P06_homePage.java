package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class P06_homePage {
    public WebElement find_slider(){


    WebElement slider_element=    Hooks.driver.findElement(By.className("class=\"nivo-imageLink\""));
        return slider_element;
    }
    public WebElement slider_click(){


        WebElement slider_Click= Hooks.driver.findElement(By.className("class=\\\"nivo-imageLink\\\"\""));
        return slider_Click;
    }
}
