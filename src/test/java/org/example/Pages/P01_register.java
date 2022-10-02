package org.example.Pages;

import io.cucumber.java.eo.Se;
import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class P01_register {

public P01_register(){
    PageFactory.initElements(Hooks.driver,"this");

}

    public WebElement register_Link(){
        return   Hooks.driver.findElement(By.className("ico-register"));

    }
    public WebElement fName(){
        return Hooks.driver.findElement(By.id("FirstName"));

    }
    public WebElement lName(){
        return Hooks.driver.findElement(By.id("LastName"));

    }
   public WebElement setMale(){
    return Hooks.driver.findElement(By.id("gender-male"));
}

public void Day(String d){
   WebElement element = Hooks.driver.findElement(By.name("DateOfBirthDay"));
    Select dayNum = new Select(element);
     dayNum.selectByValue(d);
}
    public void Month(String m){
        WebElement element = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        Select monthNum = new Select(element);
        monthNum.selectByValue(m);
    }
    public void Year(String y){
        WebElement element = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        Select yearNum = new Select(element);
        yearNum.selectByValue(y);
    }
    public WebElement Email(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement Company(){
        return Hooks.driver.findElement(By.id("Company"));
    }
    public WebElement Newsletter(){
        return Hooks.driver.findElement(By.id("Newsletter"));
    }

    public WebElement Password(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement ConfirmPassword(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerButton(){
        return Hooks.driver.findElement(By.id("register-button"));

}
public WebElement getMessageColor(){
    return Hooks.driver.findElement(By.className("result"));
}
}









/*    @FindBy(id = "gender-male")
    public WebElement male;
    @FindBy(id = "FirstName")
    public WebElement firstName;
    @FindBy(id = "LastName")
    public WebElement lastName;
    @FindBy(name= "DateOfBirthDay")
    public WebElement dateOfBirth;
    @FindBy(name = "DateOfBirthMonth")
    public WebElement monthNumber;
    @FindBy(name = "DateOfBirthYear")
    public WebElement yearNumber;
    @FindBy(id = "Email")
    public
    WebElement email;
    @FindBy(id = "Company")
    public
    WebElement companyName;
    @FindBy(id = "Newsletter")
    WebElement newsLetter;
    @FindBy(id = "Password")
    WebElement Password;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @FindBy(id = "register-button")
    WebElement registerButton;
public WebElement Month11(){
    Select dayNum = new Select(dateOfBirth);
    dayNum.selectByValue(day);
    Select monthNum = new Select(monthNumber);
    monthNum.selectByValue(month);
    Select yearNum = new Select(yearNumber);
    yearNum.selectByValue(year);

}
public void setEmail(String email1){
    email.sendKeys(email1);
}
public void setCompanyName(String companyname){
    companyName.sendKeys(companyname);

}
public void setNewsLetter(){
    newsLetter.click();
}
public void setPassword(String pass)
{
    Password.sendKeys(pass);
    confirmPassword.sendKeys(pass);
}
public void RegisterClick(){
    registerButton.click();
}*/
