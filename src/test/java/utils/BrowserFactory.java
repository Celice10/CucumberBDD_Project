package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startBrowser () {

        String browserName = ConfigReader.getBrowser();
        String url = ConfigReader.getUrl();

        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }
    public static WebDriver getDriver() {

        return driver;
    }


    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
