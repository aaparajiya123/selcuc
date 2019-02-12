package org.softpost;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:selenium.feature",
//        features = "src/test/resources",
        glue = "classpath:org.softpost",
//        tags = {"@sanity","@regression"},
//        name = {"PIN"} ,
        plugin = {"html:target/selenium-reports","rerun:target/rerun.txt"}
)
public class AppTest {}






