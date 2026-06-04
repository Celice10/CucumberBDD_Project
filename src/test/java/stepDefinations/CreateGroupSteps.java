package stepDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.CreateGroupPage;
import utils.BrowserFactory;
import utils.ConfigReader;

public class CreateGroupSteps {

    WebDriver driver;
    CreateGroupPage createGroupPage;


    @When("the user opens Groups section")
    public void the_user_opens_groups_section() {
        driver = BrowserFactory.getDriver();
        createGroupPage = new CreateGroupPage(driver);

        createGroupPage.clickGroupsButton();
    }

    @When("the user clicks Create New Group button")
    public void the_user_clicks_create_new_group_button() {
        createGroupPage.clickCreateGroupButton();
    }


    @When("the user enters group details")
    public void the_user_enters_group_details(String string, String string2) {

        createGroupPage.createGroupInput(ConfigReader.getGroupName(),
                ConfigReader.getGroupDescription(),
                ConfigReader.getGroupYear(),
                ConfigReader.getGroupMaxCapacity(),
                ConfigReader.getStartDate(),
                ConfigReader.getEndDate());

    }
    @Then("the user should see group creation success message")
    public void the_user_should_see_group_creation_success_message() {

    }

    @When("the user clicks back to website button")
    public void the_user_clicks_back_to_website_button() {

    }





    @And("the user navigates to sign up page")
    public void the_user_navigates_to_sign_up_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("the group {string} should exist in dropdown")
    public void the_group_should_exist_in_dropdown(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
