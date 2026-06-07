package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    public WebElement create;

    @FindBy(xpath = "//button[contains(text(),'Back to Website')]")
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

        type(groupNameInput, name);     //using type method from BasePage which includes waiting for visibility and clearing the field before typing
        type(groupDescriptionInput, description);

        type(groupYearInput, year);
        type(groupMaxCapacityInput, maxCapacity);

        startDateInput.sendKeys(startDate);
        endDateInput.sendKeys(endDate);

    }
    public void submitGroup() {
        click(create);
    }

    public void clickBackToWebsite() {
        click(backToWebsiteButton);
    }


}
