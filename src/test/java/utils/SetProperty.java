package utils;

import config.GetConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SetProperty {
    public static WebDriver driver;

    public static void setBrowserProperty(){
        if(GetConfig.configItems.get("browser").equals("chrome")){
            System.setProperty("webdriver.chrome.driver","/Program Files/chromedriver.exe");
            if(GetConfig.configItems.get("headless").equals("true")){
                ChromeOptions co = new ChromeOptions();
                co.addArguments("headless");
                driver = new ChromeDriver(co);
            }else{
                driver = new ChromeDriver();
            }

        }else if (GetConfig.configItems.get("browser").equals("firefox")){
            System.setProperty("webdriver.gecko.driver","/Program Files/geckodriver.exe");
            FirefoxOptions fo = new FirefoxOptions();
            if(GetConfig.configItems.get("headless").equals("true")){
                fo.setHeadless(true);
                driver = new FirefoxDriver(fo);
            }else{
                driver = new FirefoxDriver();
            }

        }
        driver.get(GetConfig.configItems.get("web_address"));
    }

}
