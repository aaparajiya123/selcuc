package org.softpost;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class Datatable {
    WebDriver driver;
    public Datatable(MySharedClass mySharedClass){
        driver = mySharedClass.startBrowser();
    }
    @Given("^I verify the webpage use data table$")
    public void iVerifyTheWebpageUseDataTable(Map<String,String> dataMap) {
        String website= dataMap.get("website");
        String title = dataMap.get("title");
        System.out.println(website+title);
        driver.get(website);
        assert driver.getTitle().toLowerCase().contains(title);
    }
}
