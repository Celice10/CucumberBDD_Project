package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends BasePage {


    @FindBy (id = "register-group")
    public WebElement selectYourGroupDropdown;

    public SignupPage(WebDriver driver) {

        super(driver);
    }

    //public void clickGroupDropdown() {
      //  click(selectYourGroupDropdown);}

    public boolean isGroupPresent(String expectedGroup) {

        Select select = new Select(selectYourGroupDropdown);

        for (WebElement option : select.getOptions()) {

            if (option.getText().trim().contains(expectedGroup)) {
                return true;
            }
        }

        return false;
    }


    //public boolean isGroupNameDisplayed() {
      //  return groupName.isDisplayed();
    //}
}
