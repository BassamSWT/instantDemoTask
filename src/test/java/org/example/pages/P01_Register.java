package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Register {
    public WebElement firstNameTextFieldLoc(){
        return Hooks.driver.findElement(By.name("first_name"));
    }
    public WebElement lastNameTextFieldLoc(){
        return Hooks.driver.findElement(By.name("last_name"));
    }
    public WebElement businessNameTextFieldLoc(){
        return Hooks.driver.findElement(By.name("business_name"));
    }
    public WebElement emailTextFieldLoc(){
        return Hooks.driver.findElement(By.name("email"));
    }
    public WebElement numb1TextLoc(){
        return Hooks.driver.findElement(By.id("numb1"));
    }
    public WebElement numb2TextLoc(){
        return Hooks.driver.findElement(By.id("numb2"));
    }
    public WebElement resultTextFieldLoc(){
        return Hooks.driver.findElement(By.id("number"));
    }
    public WebElement submitButtonLoc(){
        return Hooks.driver.findElement(By.id("demo"));
    }
    public WebElement successMessageLoc(){
        return Hooks.driver.findElement(By.cssSelector("h2[class=\"text-center cw\"]"));
    }

}
