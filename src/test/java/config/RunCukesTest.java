package config;

        import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;
        import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        features = {"src/test/resources/features/"},
        dryRun = false,
        glue="steps",
        format = {"pretty","html:target/Destination"}
//        ,tags = {"@Test"}
)
public class RunCukesTest {
}
