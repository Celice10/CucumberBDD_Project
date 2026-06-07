package stepDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import utils.BrowserFactory;
import utils.ConfigReader;

public class HomeSteps extends BaseSteps{


    @Given("the user is logged in as an admin")
    public void the_user_is_logged_in_as_an_admin() {

        loginPage.login(ConfigReader.getUsername(), ConfigReader.getPassword());

    }

    @When("the user clicks on the my profile dropdown")
    public void the_user_clicks_on_the_my_profile_dropdown() {
        homePage.clickMenuButton();
    }

    @When("the user navigates to Admin Panel")
    public void the_user_navigates_to_admin_panel() {
        homePage.selectDropdownOption("Admin Panel");
    }

    @And("the user logs out")
    public void the_user_logs_out() {
        homePage.selectDropdownOption("Logout");
        homePage.acceptAlert();    //close the alert that appears after clicking logout
    }

    @When("clicks the login button again")
    public void clicks_the_login_button_again() {
        loginPage.clickLoginButton();
    }



}
