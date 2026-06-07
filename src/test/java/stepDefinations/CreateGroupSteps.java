package stepDefinations;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import utils.ConfigReader;
import utils.ScenarioContext;


public class CreateGroupSteps extends BaseSteps{

    @When("the user opens Groups section")
    public void the_user_opens_groups_section() {

        createGroupPage.clickGroupsButton();
    }

    @When("the user clicks Create New Group button")
    public void the_user_clicks_create_new_group_button() {
        createGroupPage.clickCreateGroupButton();
    }

    @When("the user enters group details")
    public void the_user_enters_group_details() {

        String groupName = ConfigReader.getGroupName()
                + "_" + System.currentTimeMillis(); // Append timestamp to ensure uniqueness
        ScenarioContext.set("groupName", groupName); // Store the unique group name in scenario context


        createGroupPage.createGroupInput(groupName,
                ConfigReader.getGroupDescription(),
                ConfigReader.getGroupYear(),
                ConfigReader.getGroupMaxCapacity(),
                ConfigReader.getStartDate(),
                ConfigReader.getEndDate());
    }

    @And("the user submits the form")
    public void the_user_submits_the_form() {

        createGroupPage.submitGroup();
    }

    @Then("the user should see group creation success message")
    public void the_user_should_see_group_creation_success_message() {

    }

    @When("the user clicks back to website button")
    public void the_user_clicks_back_to_website_button() {

        createGroupPage.clickBackToWebsite();

    }



}
