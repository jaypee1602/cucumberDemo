import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {"TestCode"},
        monochrome = true,
        plugin = {"pretty", "junit:target/JunitReports/report.xml",
        "json:target/JsonReports/report.json,",
        "html:target/Reports"})
public class TestRunner {
}
