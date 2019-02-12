package org.softpost;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class Parameters {
    WebDriver driver;
    public Parameters (MySharedClass mySharedClass){
        driver = mySharedClass.startBrowser();
    }

    @Given("^I am on the home page of the \"(.*)\"$")
    public void iAmOnTheHomePageOfThe(String website)  {
        driver.get(website);
    }

    @Then("^I verify tht title contains \"([^\"]*)\"$")
    public void iVerifyThtTitleContains(String title)  {
        assert driver.getTitle().toLowerCase().contains(title);
     }
}
