package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.BrowserFactory;

public class Hooks {

    @Before
    public void setUp(){

        BrowserFactory.startBrowser();
    }

    /*@After
    public void tearDown(){
        BrowserFactory.closeBrowser();
    }*/
}
