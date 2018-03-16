package utils;

import config.GetConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetProperty {
    public static WebDriver driver;

    public static void setBrowserProperty(){
        if(GetConfig.configItems.get("browser").equals("chrome")){
            System.setProperty("webdriver.chrome.driver","/Program Files/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (GetConfig.configItems.get("browser").equals("firefox")){
            System.setProperty("webdriver.gecko.driver","/Program Files/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get(GetConfig.configItems.get("web_address"));
    }

}
