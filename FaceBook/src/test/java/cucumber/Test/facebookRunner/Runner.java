package cucumber.Test.facebookRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
        features = "/Users/jewal/IntelliJ/WebAutomationGroup3/FaceBook/src/test/resources/feature/logIn.feature",
        glue = "cucumber.Test.steps"
)
public class Runner extends AbstractTestNGCucumberTests {


}
