package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

import java.time.Duration;

public class Hooks {

    WebDriver driver;

    @Before
    public void setUp(){

        System.out.println("HOOK STARTED");

        driver = BrowserFactory.startBrowser();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("BROWSER STARTED");
    }

    /*@After
    public void tearDown(){
        BrowserFactory.closeBrowser();
    }*/
}
