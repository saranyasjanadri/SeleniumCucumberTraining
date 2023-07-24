package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)//Parameter


//If you keep the path with single forward slash("src/test/resources/Features")
//then it will work on windows as well as on Linux, Mac etc

//("src\\test\\resources\\Features")It works only on Windows

//monochrome=true ----> for formatted output

@CucumberOptions(features="src/test/resources/Features",
                 glue={"StepDefinitions"},
                 monochrome=true,
                 plugin={"pretty","html:target/HtmlReports",
                         "json:target/JSONReports/report.json",
                         "junit:target/JUnitReports/report.xml"},
                 tags="@smoketest")
public class TestRunner 
{

}
