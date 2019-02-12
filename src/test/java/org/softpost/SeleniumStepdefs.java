package org.softpost;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumStepdefs {

    WebDriver driver;
    public SeleniumStepdefs (MySharedClass mySharedClass){
        driver = mySharedClass.startBrowser();
    }

    //selenium***********
    @Given("^I am on the home page of softpost$")
    public void iAmOnTheHomePageOfSoftpost() {
        driver.get("https://www.softpost.org");
    }

    @Then("^I should see that title contains tutorial$")
    public void iShouldSeeThatTitleContainsTutorial() {
        assert driver.getTitle().toLowerCase().contains("tutorial");
    }

    @Then("^I should see that source contains tutorial$")
    public void iShouldSeeThatSourceContainsTutorial() {
        assert driver.getPageSource().toLowerCase().contains("tutorial");
    }
    //outline_example
    @Given("^I am on the home page of softpost (.*)$")
    public void iAmOnTheHomePageOfSoftpostWebsite(String website) {
        driver.get(website);
    }
    //outline_example
    @Then("^I verify that title contains (.*)$")
    public void iVerifyThatTitleContainsWord(String word) {
        assert driver.getTitle().toLowerCase().contains(word);
    }
    //outline example2----------
    @Given("^I am on the url \"([^\"]*)\"$")
    public void iAmOnTheUrl(String url)  {
        driver.get(url);
    }
    //outline example2
    @Then("^I verify that I enter first name (.*)$")
    public void iVerifyThatIEnterFirstNameFirstName(String fname) {
        driver.findElement(By.id("fn")).sendKeys(fname);
    }
    //outline example2
    @Then("^I verify that I enter last name (.*)$")
    public void iVerifyThatIEnterLastNameLastName(String lname) {
       // driver.findElement(By.xpath("//*[@id=\"page\"]/div/div/div/section/div[2]/article/div/table[1]/tbody/tr[2]/td[2]/input")).sendKeys(lname);
        driver.findElement(By.xpath("(//input)[4]")).sendKeys(lname);
    }

    @When("^I close browser$")
    public void iCloseBrowser() throws InterruptedException {
        Thread.sleep(2000);
    }
}
