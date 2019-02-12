package org.softpost;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MySharedClass {
    public WebDriver driver;

    @Before
    public WebDriver startBrowser(){
        System.setProperty("webdriver.edge.driver", "c:\\MicrosoftWebDriver.exe");
        if(driver==null)
        driver=new EdgeDriver();
        return driver;
    }
    @After
    public void closeBrowser(Scenario scenario){
        if(scenario.isFailed()){
            scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
            scenario.write("Test Failed");
        }else {
            scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
            scenario.write("Test Passed");
        }

        driver.close();
        driver.quit();
        driver = null;
    }
}
