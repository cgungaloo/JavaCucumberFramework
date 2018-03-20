package steps;
import config.GetConfig;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.json.*;
import utils.SetProperty;

import java.net.MalformedURLException;
import java.util.HashMap;

public class hooks {
    @Before
    public void BeforeScenario(Scenario scenario) throws MalformedURLException {
        GetConfig.GetConfig();
        SetProperty.setBrowserProperty();

        System.out.println("Running Scenario : "+ scenario.getName() + " on " + GetConfig.configItems.get("browser"));
    }

    @After
    public void AfterScenario() {
        SetProperty.driver.close();
    }
}
