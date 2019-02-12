package org.softpost;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {
    WebDriver driver;
    public MyStepdefs(MySharedClass mySharedClass){
        driver = mySharedClass.startBrowser();
    }
    @Given("^I insert the ATM card in ATM machine$")
    public void iInsertTheATMCardInATMMachine() {
    }

    @And("^I am asked to enter the PIN$")
    public void iAmAskedToEnterThePIN() {
    }

    @When("^I enter the correct PIN$")
    public void iEnterTheCorrectPIN() {
    }

    @Then("^I should be able to see option to withdraw money$")
    public void iShouldBeAbleToSeeOptionToWithdrawMoney() {
    }

    @Then("^I withdraw money$")
    public void iWithdrawMoney() {
        
    }

    @Then("^I should not be able to see option to withdraw money$")
    public void iShouldNotBeAbleToSeeOptionToWithdrawMoney() {

    }
}
