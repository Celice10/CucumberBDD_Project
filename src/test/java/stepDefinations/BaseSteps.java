package stepDefinations;

import org.openqa.selenium.WebDriver;
import pages.CreateGroupPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;
import hooks.Hooks;

// This class serves as a base for all step definition classes, providing common setup and page object instances
public class BaseSteps {

    protected WebDriver driver = Hooks.driver;

    protected LoginPage loginPage = new LoginPage(driver);
    protected HomePage homePage = new HomePage(driver);
    protected SignupPage signupPage = new SignupPage(driver);
    protected CreateGroupPage createGroupPage = new CreateGroupPage(driver);
}
