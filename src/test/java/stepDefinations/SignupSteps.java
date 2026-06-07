package stepDefinations;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import utils.ScenarioContext;


public class SignupSteps extends BaseSteps{

    @Then("the group should exist in dropdown")
    public void verify_group_exists() {

        String expectedGroup = ScenarioContext.get("groupName");

        boolean found = signupPage.isGroupPresent(expectedGroup);

        System.out.println("Expected Group: " + expectedGroup);
        System.out.println("Group Found: " + found);

        Assert.assertTrue(found, "Group NOT found in dropdown: " + expectedGroup);
    }

}
