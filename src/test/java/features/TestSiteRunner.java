package features;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty" },features="src/test/java/features",glue={"stepdefs"},plugin = {"com.cucumber.listener.ExtentCucumberFormatter:src/test/reports/cucumber_report.html","html:target/cucumber-reports","json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml","html:target/cucumber-reports"},monochrome = true,tags="@test")
public class TestSiteRunner {

    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("/Users/nipuni/Downloads/LPGAPITest-master 2/src/main/java/config/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac os");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}


