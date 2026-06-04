package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateGroupPage extends BasePage {

    @FindBy(xpath = "//button[contains(text(),'Groups')]")
    public WebElement groupsButton;

    @FindBy(xpath = "//button[contains(text(),'Create New Group')]")
    public WebElement createGroupButton;

    @FindBy(name="name" )
    public WebElement groupNameInput;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement groupDescriptionInput;

    @FindBy(name ="year")
    public WebElement groupYearInput;

    @FindBy(name="maxCapacity")
    public WebElement groupMaxCapacityInput;

    @FindBy(css = "input[name='startDate']")
    public WebElement startDateInput;

    @FindBy(css = "input[name='endDate']")
    public WebElement endDateInput;

    @FindBy(xpath = "//button[contains(text(),'Create Group')]")
    public WebElement createButton;

    @FindBy(xpath = "//button[contains(text(),'back to website')]")
    public WebElement backToWebsiteButton;


    public CreateGroupPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    public void clickGroupsButton() {
        click(groupsButton);
    }

    public void clickCreateGroupButton() {
        click(createGroupButton);
    }

    public void createGroupInput(String name, String description, String year,
                                 String maxCapacity, String startDate, String endDate) {

        // 1. wait for modal (NOT input)
        wait.until(ExpectedConditions.visibilityOf(groupNameInput));

        // 2. interact
        groupNameInput.click();
        groupNameInput.sendKeys(name);

        wait.until(ExpectedConditions.visibilityOf(groupDescriptionInput));

        groupDescriptionInput.click();
        groupDescriptionInput.sendKeys(description);

        groupYearInput.sendKeys(year);
        groupMaxCapacityInput.sendKeys(maxCapacity);

        startDateInput.sendKeys(startDate);
        endDateInput.sendKeys(endDate);

        click(createButton);
    }

    public void clickBackToWebsite() {
        click(backToWebsiteButton);
    }


}
