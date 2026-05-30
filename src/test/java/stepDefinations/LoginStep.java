package stepDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.BrowserFactory;
import utils.ConfigReader;

public class LoginStep {


    WebDriver driver = BrowserFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("the user is on the login page")
    public void clickLoginButton() {
        loginPage.clickLoginButton();

    }
    @When("the user enters username")
    public void enters_username() {
        loginPage.enterUsername(ConfigReader.getUsername());
    }
    @When("the user enters password")
    public void enters_Password() {
        loginPage.enterPassword(ConfigReader.getPassword());

    }
    @When("clicks the login button")
    public void clicksLoginButton() {
        loginPage.clickSubmitLoginButton();

    }
    @Then("the user should be redirected to the dashboard")
    public void verifyDashboardIsDisplayed() {

        assert loginPage.userMenuButton.isDisplayed();


    }
}
