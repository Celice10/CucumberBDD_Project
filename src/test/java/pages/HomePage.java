package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static utils.BrowserFactory.getDriver;

public class HomePage extends BasePage {


    @FindBy(xpath = "/html/body/div/div/nav/div[1]/div[3]/div/button")
    public WebElement menuButton;

    @FindBy(css = "button.nav-dropdown-item")
    List<WebElement> dropdownOptions;



    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }




    public void clickMenuButton() {
        //menuButton.click();
        click(menuButton);         //from BasePage, we can use the click method which includes waiting for the element to be clickable
    }

    public void selectDropdownOption(String optionName) {

        click(menuButton);

        By optionLocator = By.xpath(
                "//button[contains(@class,'nav-dropdown-item')]" +
                        "[.//span[contains(text(),'" + optionName + "')]]"
        );

        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(optionLocator)
        );

        option.click();

    }
}








