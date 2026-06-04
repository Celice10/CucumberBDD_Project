package stepDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import utils.BrowserFactory;
import utils.ConfigReader;

public class HomeSteps {

    WebDriver driver;
    HomePage homepage;
    LoginPage loginPage;


    @Given("the user is logged in as an admin")
    public void the_user_is_logged_in_as_an_admin() {

        driver = BrowserFactory.getDriver();

        homepage = new HomePage(driver);
        loginPage = new LoginPage(driver);



        loginPage.login(ConfigReader.getUsername(), ConfigReader.getPassword());

    }

    @When("the user clicks on the my profile dropdown")
    public void the_user_clicks_on_the_my_profile_dropdown() {
        homepage.clickMenuButton();
    }

    @When("the user navigates to Admin Panel")
    public void the_user_navigates_to_admin_panel(String optionName) {
       homepage.selectDropdownOption(optionName);


    }

    @And("the user logs out")
    public void the_user_logs_out() {

    }




}
