package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pages.P01_Register;
import org.testng.Assert;

public class D01_Register {
    P01_Register register = new P01_Register();
    @When("user enter first name")
    public void userEnterFirstName(){
        register.firstNameTextFieldLoc().sendKeys("Bassam");
    }

    @And("user enter last name")
    public void userEnterLastName() {
        register.lastNameTextFieldLoc().sendKeys("Mohamed");
    }

    @And("user enter business name")
    public void userEnterBusinessName() {
        register.businessNameTextFieldLoc().sendKeys("Bassam");
    }

    @And("user enter email")
    public void userEnterEmail() {
        register.emailTextFieldLoc().sendKeys("bassam@gmail.com");
    }

    @And("user enter valid result")
    public void userEnterValidResult() {
        int numb1 = Integer.parseInt(register.numb1TextLoc().getText());
        int numb2 = Integer.parseInt(register.numb2TextLoc().getText());
        int result = numb1 + numb2;
        register.resultTextFieldLoc().sendKeys(Integer.toString(result));
    }

    @And("user click submit")
    public void userClickSubmit() {
        register.submitButtonLoc().click();
    }

    @Then("user check that successfully registered")
    public void userCheckThatSuccessfullyRegistered() {
        String expectedMessage = "Thank you!";
        String actualMessage = register.successMessageLoc().getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
