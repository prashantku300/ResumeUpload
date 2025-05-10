package CogRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/Features",
    glue = "CogStepsDefination",
    plugin = { "pretty", "html:src/test/java/Reports/cogReport.html" }, 
    tags= "@LoginTest"
)
public class CogRunner {
	
	
}
